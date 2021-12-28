package ferra.solution.calculator.ui.home

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import ferra.solution.calculator.R
import ferra.solution.calculator.base.BaseSupportFragment
import ferra.solution.calculator.ui.HomeViewModel
import ferra.solution.calculator.util.CookieBarConfig
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.viewmodel.ext.android.viewModel
import java.lang.Exception

class HomeFragment : BaseSupportFragment(R.layout.fragment_home) {

    override val viewModel by viewModel<HomeViewModel>()

    private var onOperationClickListener: ((Double) -> Unit)? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onClickListener()

        addCallBackToExit()

        viewModelObserver()

        val c = (3).toDouble()
    }

    // Handel fragment click lister
    private fun onClickListener() {

        /*screenMode.setOnClickListener {
            switchMode()
        }*/

        btn_zero.setOnClickListener {
            viewModel.getNumberFromTheButton(viewModel.zero)
        }

        btn_one.setOnClickListener {
            viewModel.getNumberFromTheButton(viewModel.one)
        }

        btn_two.setOnClickListener {
            viewModel.getNumberFromTheButton(viewModel.two)
        }

        btn_three.setOnClickListener {
            viewModel.getNumberFromTheButton(viewModel.three)
        }

        btn_four.setOnClickListener {
            viewModel.getNumberFromTheButton(viewModel.four)
        }

        btn_five.setOnClickListener {
            viewModel.getNumberFromTheButton(viewModel.five)
        }

        btn_six.setOnClickListener {
            viewModel.getNumberFromTheButton(viewModel.six)
        }

        btn_seven.setOnClickListener {
            viewModel.getNumberFromTheButton(viewModel.seven)
        }

        btn_eight.setOnClickListener {
            viewModel.getNumberFromTheButton(viewModel.eight)
        }

        btn_nine.setOnClickListener {
            viewModel.getNumberFromTheButton(viewModel.nine)
        }

        btn_multi.setOnClickListener {
            calculations()
            viewModel.changeNumbersContainer(viewModel.one)
        }

        btn_division.setOnClickListener {
            calculations()
            viewModel.changeNumbersContainer(viewModel.two)
        }

        btn_minus.setOnClickListener {
            calculations()
            viewModel.changeNumbersContainer(viewModel.three)
        }

        btn_plus.setOnClickListener {
            calculations()
            viewModel.changeNumbersContainer(viewModel.four)
        }

        btn_equal.setOnClickListener {
            Toast.makeText(requireContext(), viewModel.container1.value, Toast.LENGTH_SHORT).show()
        }

        btn_delete.setOnClickListener {

        }

    }

    private fun viewModelObserver() {
        viewModel.container2.observe(viewLifecycleOwner, {
            if (viewModel.operationNumber == 0) {
                viewModel.container1.postValue("")
                viewModel.container1.postValue(it)
            } else {
                var result = 0.0
                if (it.isNotEmpty()) {
                    val c1 = viewModel.container1.value?.toDouble()!!
                    var c3 = ""
                    if (viewModel.container3.value?.isNotEmpty() == true) c3 = viewModel.container3.value?:""
                    when (viewModel.operationNumber) {
                        1 -> { result = if (c3.isNotEmpty()) viewModel.multiply(c3.toDouble(), it.toDouble()) else viewModel.multiply(c1, it.toDouble())}
                        2 -> { result = if (c3.isNotEmpty()) viewModel.div(c3.toDouble(), it.toDouble()) else viewModel.div(c1, it.toDouble())}
                        3 -> { result = if (c3.isNotEmpty()) viewModel.sub(c3.toDouble(), it.toDouble()) else viewModel.sub(c1, it.toDouble())}
                        4 -> { result = if (c3.isNotEmpty()) viewModel.add(c3.toDouble(), it.toDouble()) else viewModel.add(c1, it.toDouble())}
                    }
                    viewModel.result.postValue(result.toString())
                }
            }
        })

        setOnLikedClickListener {
            if (!viewModel.firstOperation) viewModel.container3.postValue(it.toString())
        }

        viewModel.holeContainer.observe(viewLifecycleOwner, {
            tv_calculation.text = it.toString()
        })

        viewModel.result.observe(viewLifecycleOwner, { result ->
            tv_result.text = result.toString()
        })
    }

    // Change to the light or dark mode
    /*private fun switchMode() {
        if (viewModel.isDarkMode) {
            screenMode.speed = 1F
            screenMode.playAnimation()
            viewModel.isDarkMode = false
        } else {
            screenMode.speed = -1F
            screenMode.playAnimation()
            viewModel.isDarkMode = true
        }
    }*/

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
                CookieBarConfig(requireActivity()).showDefaultInfoCookie(
                    requireContext().getString(
                        R.string.press_back_again_to_exit
                    )
                )
                lastCallback = System.currentTimeMillis()
            }
        }
    }

    private fun setOnLikedClickListener(listener: (Double) -> Unit) {
        onOperationClickListener = listener
    }

    private fun  calculations(){
        var result = 0.0
        val c2 = viewModel.container2.value
        if (c2?.isNotEmpty() == true) {
            val c1 = viewModel.container1.value?.toDouble()!!
            var c3 = ""
            if (viewModel.container3.value?.isNotEmpty() == true) c3 = viewModel.container3.value?:""
            when (viewModel.operationNumber) {
                1 -> { result = if (c3.isNotEmpty()) viewModel.multiply(c3.toDouble(), c2.toDouble()) else viewModel.multiply(c1, c2.toDouble())}
                2 -> { result = if (c3.isNotEmpty()) viewModel.div(c3.toDouble(), c2.toDouble()) else viewModel.div(c1, c2.toDouble())}
                3 -> { result = if (c3.isNotEmpty()) viewModel.sub(c3.toDouble(), c2.toDouble()) else viewModel.sub(c1, c2.toDouble())}
                4 -> { result = if (c3.isNotEmpty()) viewModel.add(c3.toDouble(), c2.toDouble()) else viewModel.add(c1, c2.toDouble())}
            }
            onOperationClickListener?.let {
                it(result)
            }
        }
    }

}