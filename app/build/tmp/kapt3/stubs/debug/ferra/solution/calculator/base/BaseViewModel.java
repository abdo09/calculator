package ferra.solution.calculator.base;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.*;
import kotlin.coroutines.CoroutineContext;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lferra/solution/calculator/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "job", "Lkotlinx/coroutines/CompletableJob;", "userLogged", "Landroidx/lifecycle/MutableLiveData;", "", "getUserLogged", "()Landroidx/lifecycle/MutableLiveData;", "onCleared", "", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel implements kotlinx.coroutines.CoroutineScope {
    private final kotlinx.coroutines.CompletableJob job = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> userLogged = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getUserLogged() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}