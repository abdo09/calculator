package ferra.solution.calculator.ui;

import androidx.lifecycle.MutableLiveData;
import ferra.solution.calculator.base.BaseViewModel;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001dJ\u0012\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u0012H\u0002J\u0016\u00101\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004J\u000e\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020\u001dJ\u0016\u00104\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004J\u0016\u00105\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120#0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\"\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0014\"\u0004\b(\u0010\u0016\u00a8\u00066"}, d2 = {"Lferra/solution/calculator/ui/HomeViewModel;", "Lferra/solution/calculator/base/BaseViewModel;", "()V", "calculations", "", "getCalculations", "()Ljava/lang/Double;", "setCalculations", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "firstOperation", "", "getFirstOperation", "()Z", "setFirstOperation", "(Z)V", "holeContainer", "Landroidx/lifecycle/MutableLiveData;", "", "getHoleContainer", "()Landroidx/lifecycle/MutableLiveData;", "setHoleContainer", "(Landroidx/lifecycle/MutableLiveData;)V", "holeContainer1", "getHoleContainer1", "()Ljava/lang/String;", "setHoleContainer1", "(Ljava/lang/String;)V", "operationNumber", "", "getOperationNumber", "()I", "setOperationNumber", "(I)V", "operators", "Ljava/util/ArrayList;", "getOperators", "setOperators", "result", "getResult", "setResult", "add", "container1", "container2", "changeNumbersContainer", "", "operationType", "checkLastCharNotOperatorSign", "lastChar", "div", "getNumberFromTheButton", "number", "multiply", "sub", "app_debug"})
public final class HomeViewModel extends ferra.solution.calculator.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> operators;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> holeContainer;
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
    
    public final void getNumberFromTheButton(int number) {
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
}