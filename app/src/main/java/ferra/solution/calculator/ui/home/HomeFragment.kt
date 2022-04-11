package ferra.solution.calculator.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import ferra.solution.calculator.base.BaseSupportFragment
import ferra.solution.calculator.databinding.FragmentHomeBinding
import ferra.solution.calculator.ui.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber

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

        binding?.btnDelete?.setOnClickListener {
            val sign = arrayListOf<String>()

            viewModel.holeContainer1 =
                viewModel.holeContainer.value?.dropLast(1)?.replace("*", " ")?.replace("÷", " ")
                    ?.replace("-", " ")
                    ?.replace("+", " ")
            viewModel.holeContainer.postValue(viewModel.holeContainer.value?.dropLast(1))

            viewModel.holeContainer.value?.forEach {
                if (it == '*' || it == '÷' || it == '-' || it == '+') {
                    sign.add(it.toString())
                }
            }

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
                            when (sign[index - 1]) {
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
            if (viewModel.calculations == 0.0 && viewModel.holeContainer1?.isEmpty() == true) {
                viewModel.result.postValue("")
            } else if (viewModel.calculations == 0.0 && viewModel.holeContainer1?.isNotEmpty() == true) {
                viewModel.result.postValue(0.0.toString())
            }else{
                viewModel.result.postValue(viewModel.calculations.toString())
            }
        }
    }

    private fun viewModelObserver() {
        viewModel.holeContainer.observe(viewLifecycleOwner) { holeContainer ->

            val sign = arrayListOf<String>()

            viewModel.holeContainer1 = holeContainer?.replace("*", " ")?.replace("÷", " ")
                    ?.replace("-", " ")
                    ?.replace("+", " ")

            holeContainer?.forEach {
                if (it == '*' || it == '÷' || it == '-' || it == '+') {
                    sign.add(it.toString())
                }
            }

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
                            when (sign[index - 1]) {
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

        viewModel.result.observe(viewLifecycleOwner) { result ->
            binding?.tvResult?.text = result.toString()
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