package ferra.solution.calculator.util;

import android.animation.*;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.textfield.TextInputLayout;
import ferra.solution.calculator.R;
import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@kotlin.Suppress(names = {"RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\b\u0010\f\u001a\u00020\rH\u0002\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0016\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007\u001a\"\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\"\u001a\u00020\u0001H\u0002\u001a\u000e\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f\u001a\u0012\u0010%\u001a\u00020\u0013*\u00020\u00152\u0006\u0010&\u001a\u00020\'\u001a\u0014\u0010(\u001a\u00020\u0013*\u00020\u001a2\b\b\u0002\u0010)\u001a\u00020\t\u001a\u001c\u0010(\u001a\u00020\u0013*\u00020\u001a2\b\b\u0002\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0001\u001a\u0014\u0010+\u001a\u00020\u0013*\u00020\u001a2\b\b\u0002\u0010)\u001a\u00020\t\u001a\u001c\u0010+\u001a\u00020\u0013*\u00020\u001a2\b\b\u0002\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0001\u001a\n\u0010,\u001a\u00020\u0007*\u00020\u0007\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a\u001e\u0010-\u001a\u00020\u0013*\u00020.2\b\b\u0001\u0010/\u001a\u00020\u00012\b\b\u0001\u00100\u001a\u00020\u0001\u001a,\u00101\u001a\u00020\u0013\"\u0004\b\u0000\u00102*\b\u0012\u0004\u0012\u0002H2032\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u0002H207\u001a\u001c\u00108\u001a\u00020\u0013*\u00020\u00152\b\b\u0002\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020;\u001a.\u0010<\u001a\u00020\u0013*\u00020=2\u0006\u0010>\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020\u0001\u001a\u0012\u0010B\u001a\u00020\u0007*\u00020\u00152\u0006\u0010C\u001a\u00020\u0001\u001a\u0014\u0010D\u001a\u00020\u0013*\u00020E2\b\b\u0001\u0010F\u001a\u00020\u0001\u001a\n\u0010G\u001a\u00020\'*\u00020\'\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\u00a8\u0006H"}, d2 = {"dp", "", "", "getDp", "(F)I", "(I)I", "formatDate", "", "timeInMillis", "", "fullDate", "", "getSimpleDateFormat", "Ljava/text/SimpleDateFormat;", "roundOffDecimal", "", "number", "(D)Ljava/lang/Double;", "sendScreenShot", "", "context", "Landroid/content/Context;", "imageFile", "Ljava/io/File;", "setFadeAnimation", "view", "Landroid/view/View;", "setReceivedCardHolder", "constraintLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "color", "setTextInputLayoutHintColor", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "colorIdRes", "vatString", "value", "copyToClipboard", "text", "", "fadeIn", "duration", "visible", "fadeOut", "firebaseString", "navigationBarAndStatusBarColor", "Landroid/app/Activity;", "statusColor", "navigationColor", "observeOnce", "T", "Landroidx/lifecycle/LiveData;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "postToLooper", "delay", "r", "Ljava/lang/Runnable;", "setCurrentItemX", "Landroidx/viewpager2/widget/ViewPager2;", "item", "interpolator", "Landroid/animation/TimeInterpolator;", "pagePxWidth", "setSheetHexColor", "res", "toColor", "Landroid/widget/TextView;", "colorResId", "trim", "app_debug"})
public final class ExtensionKt {
    
    public static final void navigationBarAndStatusBarColor(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$navigationBarAndStatusBarColor, @androidx.annotation.ColorRes()
    int statusColor, @androidx.annotation.ColorRes()
    int navigationColor) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String firebaseString(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$firebaseString) {
        return null;
    }
    
    public static final int getDp(int $this$dp) {
        return 0;
    }
    
    public static final int getDp(float $this$dp) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Double roundOffDecimal(double number) {
        return null;
    }
    
    private static final java.text.SimpleDateFormat getSimpleDateFormat() {
        return null;
    }
    
    /**
     * Formats timestamp to 'date month' format (e.g. 'February 3').
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String formatDate(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$formatDate, @org.jetbrains.annotations.Nullable()
    java.lang.String timeInMillis) {
        return null;
    }
    
    /**
     * Formats timestamp to 'date month' format (e.g. 'February 3').
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String formatDate(long timeInMillis) {
        return null;
    }
    
    /**
     * Formats timestamp to 'date month' format (e.g. 'February 3').
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatDate(long timeInMillis, boolean fullDate) {
        return null;
    }
    
    public static final void fadeIn(@org.jetbrains.annotations.NotNull()
    android.view.View $this$fadeIn, long duration) {
    }
    
    public static final void fadeOut(@org.jetbrains.annotations.NotNull()
    android.view.View $this$fadeOut, long duration) {
    }
    
    public static final void fadeIn(@org.jetbrains.annotations.NotNull()
    android.view.View $this$fadeIn, long duration, int visible) {
    }
    
    public static final void fadeOut(@org.jetbrains.annotations.NotNull()
    android.view.View $this$fadeOut, long duration, int visible) {
    }
    
    public static final void setCurrentItemX(@org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 $this$setCurrentItemX, int item, long duration, @org.jetbrains.annotations.NotNull()
    android.animation.TimeInterpolator interpolator, int pagePxWidth) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String vatString(double value) {
        return null;
    }
    
    public static final void toColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$toColor, @androidx.annotation.ColorRes()
    int colorResId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.CharSequence trim(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence $this$trim) {
        return null;
    }
    
    public static final <T extends java.lang.Object>void observeOnce(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observeOnce, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<T> observer) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String setSheetHexColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setSheetHexColor, int res) {
        return null;
    }
    
    public static final void copyToClipboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$copyToClipboard, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    public static final void postToLooper(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$postToLooper, long delay, @org.jetbrains.annotations.NotNull()
    java.lang.Runnable r) {
    }
    
    private static final void setTextInputLayoutHintColor(com.google.android.material.textfield.TextInputLayout textInputLayout, android.content.Context context, @androidx.annotation.ColorRes()
    int colorIdRes) {
    }
    
    public static final void sendScreenShot(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File imageFile) {
    }
    
    public static final void setFadeAnimation(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final void setReceivedCardHolder(@org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout constraintLayout, @org.jetbrains.annotations.NotNull()
    java.lang.String color) {
    }
}