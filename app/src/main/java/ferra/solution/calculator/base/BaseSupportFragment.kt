package ferra.solution.calculator.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import ferra.solution.calculator.util.CookieBarConfig
import ferra.solution.calculator.ui.MainActivity


abstract class BaseSupportFragment(fragment: Int) : Fragment(fragment) {

    //base viewModel for configuring info ,success, failure ,loading ,user login events
    abstract val viewModel: BaseViewModel

    //alert module , controlled through the base viewModel
    private val cookieBarConfig: CookieBarConfig by lazy { CookieBarConfig(requireActivity()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity as MainActivity).apply {
            activeLocalization()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onLazyInitView(savedInstanceState)
    }

    open fun onLazyInitView(savedInstanceState: Bundle?) {

    }

    open fun refreshUI() {

    }


    fun toggleKeyboard(activity: Context, show: Boolean? = null) {

        viewLifecycleOwner.lifecycleScope.launchWhenCreated {
            val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager

            if (show != null) {
                if (!show) {
                    imm.hideSoftInputFromWindow(requireView().windowToken, 0) // hide
                } else {
                    imm.toggleSoftInput(0, InputMethodManager.HIDE_IMPLICIT_ONLY) // show
                }
            } else {
                if (imm.isActive) {
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0) // hide
                } else {
                    imm.toggleSoftInput(0, InputMethodManager.HIDE_IMPLICIT_ONLY) // show
                }
            }
        }

    }

    fun showKeyboard(etText: EditText) {
        etText.requestFocus()
        toggleKeyboard(requireActivity(), true)
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).apply {
            activeLocalization()
        }
    }

}