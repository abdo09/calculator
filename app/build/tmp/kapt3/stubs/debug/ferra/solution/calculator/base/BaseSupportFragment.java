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

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u0019R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001a"}, d2 = {"Lferra/solution/calculator/base/BaseSupportFragment;", "Landroidx/fragment/app/Fragment;", "()V", "viewModel", "Lferra/solution/calculator/base/BaseViewModel;", "getViewModel", "()Lferra/solution/calculator/base/BaseViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onLazyInitView", "onResume", "onViewCreated", "view", "Landroid/view/View;", "refreshUI", "showKeyboard", "etText", "Landroid/widget/EditText;", "toggleKeyboard", "activity", "Landroid/content/Context;", "show", "", "(Landroid/content/Context;Ljava/lang/Boolean;)V", "app_debug"})
public abstract class BaseSupportFragment extends androidx.fragment.app.Fragment {
    
    public BaseSupportFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract ferra.solution.calculator.base.BaseViewModel getViewModel();
    
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
}