package ferra.solution.calculator.base;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import ferra.solution.calculator.R;
import ferra.solution.calculator.util.ContextWrapper;
import ferra.solution.calculator.util.LocalizationUtil;
import java.util.*;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\nH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lferra/solution/calculator/base/BaseSupportActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "Lkotlin/Lazy;", "activeLocalization", "", "attachBaseContext", "newBase", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStart", "app_debug"})
public abstract class BaseSupportActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy navController$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context newBase) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void activeLocalization() {
    }
    
    public BaseSupportActivity() {
        super();
    }
}