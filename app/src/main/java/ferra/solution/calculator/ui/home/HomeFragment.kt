package ferra.solution.calculator.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import ferra.solution.calculator.base.BaseSupportFragment
import ferra.solution.calculator.databinding.FragmentHomeBinding
import ferra.solution.calculator.ui.HomeViewModel
import ferra.solution.calculator.util.formatResult
import ferra.solution.calculator.util.listOfSigns
import ferra.solution.calculator.util.replaceSignsWithSpace
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber
import kotlin.math.sqrt

class HomeFragment : BaseSupportFragment() {

    override val viewModel by viewModel<HomeViewModel>()
    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onClickListener()

        addCallBackToExit()

        viewModelObserver()

    }

    // Handel fragment click lister
    private fun onClickListener() {
        binding?.viewModel = viewModel

        binding?.btnEqual?.setOnClickListener {
            try {
                binding?.tvCalculation?.text = binding?.tvResult?.text
                viewModel.holeContainer.value = binding?.tvResult?.text.toString()
            }catch (ex: Exception){Timber.wtf(ex)}
        }

        binding?.btnPercentage?.setOnClickListener {
            try {
                if (binding?.tvResult?.text.toString().isNotEmpty() && binding?.tvResult?.text.toString().toDouble() != 0.0){
                    val percentageResult = (binding?.tvResult?.text.toString().toDouble() / 100).formatResult()
                    binding?.tvCalculation?.text = percentageResult
                    viewModel.holeContainer.value = percentageResult
                }
            }catch (ex: Exception){Timber.wtf(ex)}
        }

        binding?.btnPlusMinus?.setOnClickListener {
            try {
                val plusOrMinusValue = viewModel.plusOrMinus(binding?.tvResult?.text.toString()).formatResult()
                binding?.tvCalculation?.text = plusOrMinusValue
                viewModel.holeContainer.value = plusOrMinusValue
            }catch (ex: Exception){Timber.wtf(ex)}
        }

        binding?.btnSqrt?.setOnClickListener {
            try {
                val sqrtValue = viewModel.sqrt(binding?.tvResult?.text.toString()).formatResult()
                binding?.tvCalculation?.text = sqrtValue
                viewModel.holeContainer.value = sqrtValue
            }catch (ex: Exception){Timber.wtf(ex)}
        }
    }

    private fun viewModelObserver() {
        viewModel.holeContainer.observe(viewLifecycleOwner) { holeContainer ->

            viewModel.holeContainer1 = holeContainer?.replaceSignsWithSpace()
            val sign = holeContainer?.listOfSigns()

            viewModel.holeContainer1?.split(" ")?.forEachIndexed { index, number ->
                when {
                    index == 0 -> {
                        try {
                            if (number.isNotEmpty()){
                                viewModel.calculations = number.toDouble()
                            } else{
                                viewModel.calculations = 0.0
                            }
                        } catch (e: Exception){
                            Timber.d(e)
                        }
                    }
                    index > 0 -> {
                        try {
                            when (sign?.get(index - 1)) {
                                "*" -> {
                                    try {
                                        viewModel.calculations = viewModel.multiply(viewModel.calculations!!, number.toDouble())
                                    } catch (e: Exception) {
                                        Timber.d(e)
                                    }
                                }
                                "÷" -> {
                                    try {
                                        viewModel.calculations = viewModel.div(viewModel.calculations!!, number.toDouble())
                                    } catch (e: Exception) {
                                        Timber.d(e)
                                    }
                                }
                                "-" -> {
                                    try {
                                        viewModel.calculations = viewModel.sub(viewModel.calculations!!, number.toDouble())
                                    } catch (e: Exception) {
                                        Timber.d(e)
                                    }
                                }
                                "+" -> {
                                    try {
                                        viewModel.calculations = viewModel.add(viewModel.calculations!!, number.toDouble())
                                    } catch (e: Exception) {
                                        Timber.d(e)
                                    }
                                }
                            }
                        } catch (e: Exception){
                            Timber.d(e)
                        }
                    }
                    else -> {
                        viewModel.calculations = 0.0
                    }
                }
            }
            if (viewModel.calculations == 0.0 && holeContainer?.isEmpty() == true) {
                viewModel.result.postValue("")
            } else if (viewModel.calculations == 0.0 && holeContainer?.isNotEmpty() == true) {
                viewModel.result.postValue(0.0.toString())
            }else{
                viewModel.result.postValue(viewModel.calculations.toString())
            }

            binding?.tvCalculation?.text = holeContainer.toString()
        }

        viewModel.clearAll.observe(viewLifecycleOwner){
            viewModel.holeContainer1 = ""
            viewModel.holeContainer.value = ""
            binding?.tvResult?.text = ""
            binding?.tvCalculation?.text = ""
        }

        viewModel.result.observe(viewLifecycleOwner) { result ->
            try {
                if (!result.isNullOrEmpty()) binding?.tvResult?.text = result.toDouble().formatResult()
                else binding?.tvResult?.text = ""
            }catch (ex: Exception){Timber.wtf(ex)}
        }
    }

    // Handel on back button pressed
    private fun addCallBackToExit() {
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, callBack)
    }

    var lastCallback: Long = 0

    private var callBack: OnBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            if (System.currentTimeMillis() - lastCallback < 3000) {
                requireActivity().finish()
            } else {
                lastCallback = System.currentTimeMillis()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}