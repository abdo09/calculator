package ferra.solution.calculator.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import ferra.solution.calculator.util.CookieBarConfig;
import ferra.solution.calculator.ui.MainActivity;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u00a2\u0006\u0002\u0010!R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lferra/solution/calculator/base/BaseSupportFragment;", "Landroidx/fragment/app/Fragment;", "fragment", "", "(I)V", "cookieBarConfig", "Lferra/solution/calculator/util/CookieBarConfig;", "getCookieBarConfig", "()Lferra/solution/calculator/util/CookieBarConfig;", "cookieBarConfig$delegate", "Lkotlin/Lazy;", "viewModel", "Lferra/solution/calculator/base/BaseViewModel;", "getViewModel", "()Lferra/solution/calculator/base/BaseViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onLazyInitView", "onResume", "onViewCreated", "view", "Landroid/view/View;", "refreshUI", "showKeyboard", "etText", "Landroid/widget/EditText;", "toggleKeyboard", "activity", "Landroid/content/Context;", "show", "", "(Landroid/content/Context;Ljava/lang/Boolean;)V", "app_debug"})
public abstract class BaseSupportFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy cookieBarConfig$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public abstract ferra.solution.calculator.base.BaseViewModel getViewModel();
    
    private final ferra.solution.calculator.util.CookieBarConfig getCookieBarConfig() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void onLazyInitView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void refreshUI() {
    }
    
    public final void toggleKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean show) {
    }
    
    public final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.widget.EditText etText) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public BaseSupportFragment(int fragment) {
        super();
    }
}