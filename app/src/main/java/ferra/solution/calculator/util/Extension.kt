@file:Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")

package ferra.solution.calculator.util

import android.animation.*
import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Color
import android.net.Uri
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AlphaAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.textfield.TextInputLayout
import ferra.solution.calculator.R
import java.io.File
import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

fun Activity.navigationBarAndStatusBarColor(
    @ColorRes statusColor: Int,
    @ColorRes navigationColor: Int
) {
    val window: Window = this.window
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this, statusColor)
        window.navigationBarColor = ContextCompat.getColor(this, navigationColor)
    }
}

fun String.replaceSignsWithSpace(): String{
    return this.replace("*", " ").replace("÷", " ")
        .replace("-", " ")
        .replace("+", " ")

}

fun String.listOfSigns(): ArrayList<String>{
    val signs = arrayListOf<String>()
    this.forEach {
        if (it == '*' || it == '÷' || it == '-' || it == '+') {
            signs.add(it.toString())
        }
    }
    return signs
}

fun Double.formatResult(): String {
    return String.format(Locale.ENGLISH, "%.2f", this)
}