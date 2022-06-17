package ferra.solution.calculator.ui;

import androidx.lifecycle.MutableLiveData;
import ferra.solution.calculator.base.BaseViewModel;
import timber.log.Timber;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020 J\u0012\u00102\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\n\u001a\u0002002\b\b\u0002\u00104\u001a\u000205J\u0006\u00106\u001a\u000200J\u0016\u00107\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004J\u000e\u00108\u001a\u0002002\u0006\u00109\u001a\u000205J\u0016\u0010:\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004J\u000e\u0010;\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\fJ\u000e\u0010<\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\fJ\u0016\u0010=\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0&0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000e\"\u0004\b(\u0010\u0010R\"\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010\u00a8\u0006>"}, d2 = {"Lferra/solution/calculator/ui/HomeViewModel;", "Lferra/solution/calculator/base/BaseViewModel;", "()V", "calculations", "", "getCalculations", "()Ljava/lang/Double;", "setCalculations", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "clearAll", "Landroidx/lifecycle/MutableLiveData;", "", "getClearAll", "()Landroidx/lifecycle/MutableLiveData;", "setClearAll", "(Landroidx/lifecycle/MutableLiveData;)V", "firstOperation", "", "getFirstOperation", "()Z", "setFirstOperation", "(Z)V", "holeContainer", "getHoleContainer", "setHoleContainer", "holeContainer1", "getHoleContainer1", "()Ljava/lang/String;", "setHoleContainer1", "(Ljava/lang/String;)V", "operationNumber", "", "getOperationNumber", "()I", "setOperationNumber", "(I)V", "operators", "Ljava/util/ArrayList;", "getOperators", "setOperators", "result", "getResult", "setResult", "add", "container1", "container2", "changeNumbersContainer", "", "operationType", "checkLastCharNotOperatorSign", "lastChar", "clear", "", "deleteButton", "div", "getNumberFromTheButton", "number", "multiply", "plusOrMinus", "sqrt", "sub", "app_debug"})
public final class HomeViewModel extends ferra.solution.calculator.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> operators;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> holeContainer;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> clearAll;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String holeContainer1;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> result;
    private int operationNumber;
    private boolean firstOperation;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double calculations;
    
    public HomeViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getOperators() {
        return null;
    }
    
    public final void setOperators(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getHoleContainer() {
        return null;
    }
    
    public final void setHoleContainer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getClearAll() {
        return null;
    }
    
    public final void setClearAll(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHoleContainer1() {
        return null;
    }
    
    public final void setHoleContainer1(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final int getOperationNumber() {
        return 0;
    }
    
    public final void setOperationNumber(int p0) {
    }
    
    public final boolean getFirstOperation() {
        return false;
    }
    
    public final void setFirstOperation(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCalculations() {
        return null;
    }
    
    public final void setCalculations(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public final void changeNumbersContainer(int operationType) {
    }
    
    public final void clearAll(char clear) {
    }
    
    public final void getNumberFromTheButton(char number) {
    }
    
    private final boolean checkLastCharNotOperatorSign(java.lang.String lastChar) {
        return false;
    }
    
    public final double add(double container1, double container2) {
        return 0.0;
    }
    
    public final double sub(double container1, double container2) {
        return 0.0;
    }
    
    public final double multiply(double container1, double container2) {
        return 0.0;
    }
    
    public final double div(double container1, double container2) {
        return 0.0;
    }
    
    public final double plusOrMinus(@org.jetbrains.annotations.NotNull()
    java.lang.String result) {
        return 0.0;
    }
    
    public final double sqrt(@org.jetbrains.annotations.NotNull()
    java.lang.String result) {
        return 0.0;
    }
    
    public final void deleteButton() {
    }
}