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

fun String.firebaseString(): String {
    return this.toLowerCase().replace(" ", "_")
}

val Int.dp: Int
    get() = (this * Resources.getSystem().displayMetrics.density + 0.5f).toInt()

val Float.dp: Int
    get() = (this * Resources.getSystem().displayMetrics.density + 0.5f).toInt()

fun roundOffDecimal(number: Double): Double? {
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING
    return df.format(number).toDouble()
}

private fun getSimpleDateFormat(): SimpleDateFormat {
    val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH)
    sdf.timeZone = TimeZone.getTimeZone("GMT")
    return sdf
}

/**
 * Formats timestamp to 'date month' format (e.g. 'February 3').
 */
fun String.formatDate(timeInMillis: String?): String? {
    val dateFormat = getSimpleDateFormat()
    var date = timeInMillis
    try {
        date = formatDate(dateFormat.parse(timeInMillis ?: "").time, true)
    } catch (e: ParseException) {
        e.printStackTrace()
    }
    return date
}


/**
 * Formats timestamp to 'date month' format (e.g. 'February 3').
 */
fun formatDate(timeInMillis: Long): String? {
    val dateFormat = SimpleDateFormat("MMMM dd", Locale.ENGLISH)
    return dateFormat.format(timeInMillis)
}


/**
 * Formats timestamp to 'date month' format (e.g. 'February 3').
 */
fun formatDate(timeInMillis: Long, fullDate: Boolean): String {
    val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
    return dateFormat.format(timeInMillis)
}

fun View.fadeIn(duration: Long = 600) {
    if (visibility != View.VISIBLE)
        this.apply {
            alpha = 0f
            visibility = View.VISIBLE
            post {
                animate().alpha(1f).setDuration(duration).start()
            }
        }

}

fun View.fadeOut(duration: Long = 800) {
    if (visibility != View.GONE)
        this.apply {
            alpha = 1f
            post {
                animate().alpha(0f).setDuration(duration)
                    .withEndAction {
                        visibility = View.GONE
                    }.start()
            }
        }
}

fun View.fadeIn(duration: Long = 600, visible: Int) {
    if (visibility != visible)
        this.apply {
            alpha = 0f
            visibility = visible
            post {
                animate().alpha(1f).setDuration(duration).start()
            }
        }

}

fun View.fadeOut(duration: Long = 800, visible: Int) {
    if (visibility != visible)
        this.apply {
            alpha = 1f
            post {
                animate().alpha(0f).setDuration(duration)
                    .withEndAction {
                        visibility = visible
                    }.start()
            }
        }
}

fun ViewPager2.setCurrentItemX(
    item: Int,
    duration: Long,
    interpolator: TimeInterpolator = AccelerateDecelerateInterpolator(),
    pagePxWidth: Int = width // Default value taken from getWidth() from ViewPager2 view
) {
    val pxToDrag: Int = pagePxWidth * (item - currentItem)
    val animator = ValueAnimator.ofInt(0, pxToDrag)
    var previousValue = 0
    animator.addUpdateListener { valueAnimator ->
        val currentValue = valueAnimator.animatedValue as Int
        val currentPxToDrag = (currentValue - previousValue).toFloat()
        fakeDragBy(currentPxToDrag)
        previousValue = currentValue
    }
    animator.addListener(object : Animator.AnimatorListener {
        override fun onAnimationStart(animation: Animator?) {
            try {
                beginFakeDrag()
            } catch (ex: java.lang.Exception) {
                ex.printStackTrace()
            }
        }

        override fun onAnimationEnd(animation: Animator?) {
            try {
                endFakeDrag()
            } catch (ex: java.lang.Exception) {
                ex.printStackTrace()
            }
        }

        override fun onAnimationCancel(animation: Animator?) { /* Ignored */
        }

        override fun onAnimationRepeat(animation: Animator?) { /* Ignored */
        }
    })
    animator.interpolator = interpolator
    animator.duration = duration
    animator.start()
}

fun vatString(value: Double): String {
    val totalAmountWithoutVAT = value / 1.05
    val vatValue = value - totalAmountWithoutVAT
    return String.format("%.2f", vatValue)
}

fun TextView.toColor(@ColorRes colorResId: Int) {
    ObjectAnimator.ofObject(
        this,  // Object to animating
        "textColor",  // Property to animate
        ArgbEvaluator(),  // Interpolation function
        this.currentTextColor,  // Start color
        colorResId // End color
    ).setDuration(600) // Duration in milliseconds
        .start() //

}

fun CharSequence.trim(): CharSequence = trim(Char::isWhitespace)

interface TextWatcherMinified : TextWatcher {
    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
    }

    override fun afterTextChanged(s: Editable?) {

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }
}

fun <T> LiveData<T>.observeOnce(lifecycleOwner: LifecycleOwner, observer: Observer<T>) {
    observe(lifecycleOwner, object : Observer<T> {
        override fun onChanged(t: T) {
            observer.onChanged(t)
            removeObserver(this)
        }
    })
}

fun Context.setSheetHexColor(res: Int): String {
    return Integer.toHexString(ContextCompat.getColor(this, res))
        .substring(2).toUpperCase(Locale.ROOT)
}

fun Context.copyToClipboard(text: CharSequence) {
    val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clip = ClipData.newPlainText("label", text)
    clipboard.setPrimaryClip(clip)
}

fun Context.postToLooper(delay: Long = 0, r: Runnable) {
    val handlerUI = Handler(Looper.getMainLooper())
    handlerUI.postDelayed(r, delay)
}
private fun setTextInputLayoutHintColor(
    textInputLayout: TextInputLayout,
    context: Context,
    @ColorRes colorIdRes: Int
) {
    textInputLayout.defaultHintTextColor = ColorStateList.valueOf(
        ContextCompat.getColor(
            context,
            colorIdRes
        )
    )
}


/*
@SuppressLint("SimpleDateFormat")
fun takeScreenShot(
    context: Context,
    holder: ReceivedMessageAdapter.ReceivedMessageViewHolder,
    status: Boolean
) {


    if (status) {
        holder.itemView.cardImage_receivedGift.visibility = View.VISIBLE
        holder.itemView.cardLayoutBackground.visibility = View.VISIBLE
    } else {
        holder.itemView.cardImage_receivedGift.visibility = View.GONE
        holder.itemView.cardLayoutBackground.visibility = View.GONE

    }

    val bitmap = loadBitmapFromView(holder, status)
    try {
        val sdf = SimpleDateFormat("yyyyMMdd_HHmmss")
        val dt: String = sdf.format(Date())
        val file = File(context.filesDir, "/sarahah-${dt}.png")
        val fOut = FileOutputStream(file)
        bitmap!!.compress(Bitmap.CompressFormat.PNG, 100, fOut)
        fOut.flush()
        fOut.close()
        holder.itemView.isLike!!.visibility = View.VISIBLE
        holder.itemView.ivShare_receivedGift!!.visibility = View.VISIBLE
        holder.itemView.logo_icon!!.visibility = View.GONE
        holder.itemView.ic_received_option_menu!!.visibility = View.VISIBLE

        holder.itemView.item_received.setBackgroundColor(
            ContextCompat.getColor(
                context,
                R.color.transparent
            )
        )
        sendScreenShot(context, file)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
*/

fun sendScreenShot(context: Context, imageFile: File) {
    val uri: Uri = FileProvider.getUriForFile(
        context,
        "BuildConfig.APPLICATION_ID" + ".provider",
        imageFile
    )
    val shareIntent = Intent()
    shareIntent.action = Intent.ACTION_SEND
    shareIntent.type = "image/*"
    shareIntent.putExtra(
        Intent.EXTRA_SUBJECT,
        "${context.getString(R.string.app_name)} @petssa_com"
    )
    shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
    shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    shareIntent.putExtra(Intent.EXTRA_STREAM, uri)
    shareIntent.type = "image/*"
    context.startActivity(Intent.createChooser(shareIntent, "Share image"))
}

fun setFadeAnimation(view: View) {
    val anim = AlphaAnimation(0.0f, 1.0f)
    anim.duration = 500
    view.startAnimation(anim)
}

fun setReceivedCardHolder(constraintLayout: ConstraintLayout, color: String) {

    try {
        constraintLayout.background.setTint(Color.parseColor("#${color}"))

    } catch (e: Exception) {
        constraintLayout.background.setTint(Color.parseColor("#4E418F"))

    }
}

/*
@SuppressLint("Recycle")
fun Fragment.getContacts(): ListOfContactsAndNumbers {

    val listOfContactsAndNumbers = ListOfContactsAndNumbers()

    val contacts = ArrayList<ContactInfo>()

    val numbers = ArrayList<String>()

    val q = Contacts.getQuery()

    q.hasPhoneNumber()

    q.find().forEach {

        val contactMap = ContactInfo()

        contactMap.apply {
            key = it.id.toString()
            name = it.displayName
            imageUri = it.photoUri

            it.phoneNumbers.forEach { phoneNumber ->

                val contactResponse = ContactDetails.getContactDetails(phoneNumber.number.replace("\\s".toRegex(), ""), fragment = this@getContacts)

                contactResponse.map { map ->
                    if (!this.numbers.contains("+${map.key}${map.value}")){
                        this.numbers.add("+${map.key}${map.value}")
                    }
                    numbers.add("+${map.key}${map.value}")
                }

            }
        }
       if (!contacts.contains(contactMap)){
           contacts.add(contactMap)
       }
    }

    listOfContactsAndNumbers.apply {
        this.numbers = numbers
        this.contactsInfo = contacts
    }
    return listOfContactsAndNumbers

}*/
