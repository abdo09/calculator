package ferra.solution.calculator.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import ferra.solution.calculator.util.navigationBarAndStatusBarColor
import ferra.solution.calculator.R
import ferra.solution.calculator.util.ContextWrapper
import ferra.solution.calculator.util.LocalizationUtil
import java.util.*

abstract class BaseSupportActivity: AppCompatActivity() {

    val navController by lazy { findNavController(R.id.calculatorNavHostFragment) }

    override fun attachBaseContext(newBase: Context?) {
        val lang = "en"
        val myLocale = Locale(lang)
        val context: Context = ContextWrapper.wrap(newBase, myLocale)
        super.attachBaseContext(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        activeLocalization()
        super.onCreate(savedInstanceState)
        activeLocalization()

        this.navigationBarAndStatusBarColor(R.color.statusBar, R.color.navigationBar)

    }

    override fun onStart() {
        super.onStart()
        activeLocalization()
    }

    override fun onResume() {
        super.onResume()
        activeLocalization()
    }

    fun activeLocalization() {
        val preferences = getSharedPreferences(getString(R.string.pref_language), Context.MODE_PRIVATE)
        val lang = preferences.getString(getString(R.string.lang_key), "") ?: "en"
        LocalizationUtil.setLanguage(lang, this)
    }

}