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
import kotlin.collections.ArrayList;

@kotlin.Suppress(names = {"RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001a\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0004j\b\u0012\u0004\u0012\u00020\u0001`\u0005*\u00020\u0001\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0001\u00a8\u0006\r"}, d2 = {"formatResult", "", "", "listOfSigns", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "navigationBarAndStatusBarColor", "", "Landroid/app/Activity;", "statusColor", "", "navigationColor", "replaceSignsWithSpace", "app_debug"})
public final class ExtensionKt {
    
    public static final void navigationBarAndStatusBarColor(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$navigationBarAndStatusBarColor, @androidx.annotation.ColorRes()
    int statusColor, @androidx.annotation.ColorRes()
    int navigationColor) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String replaceSignsWithSpace(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$replaceSignsWithSpace) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.ArrayList<java.lang.String> listOfSigns(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$listOfSigns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatResult(double $this$formatResult) {
        return null;
    }
}