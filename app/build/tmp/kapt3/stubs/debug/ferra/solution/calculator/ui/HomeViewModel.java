package ferra.solution.calculator.ui;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import ferra.solution.calculator.base.BaseViewModel;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010B\u001a\u00020C2\u0006\u0010\u0003\u001a\u00020C2\u0006\u0010\n\u001a\u00020CJ\u000e\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0011J\u0012\u0010G\u001a\u00020\u00172\b\u0010H\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u0010I\u001a\u00020C2\u0006\u0010\u0003\u001a\u00020C2\u0006\u0010\n\u001a\u00020CJ\u000e\u0010J\u001a\u00020E2\u0006\u0010K\u001a\u00020\u0011J\u0016\u0010L\u001a\u00020C2\u0006\u0010\u0003\u001a\u00020C2\u0006\u0010\n\u001a\u00020CJ\u0016\u0010M\u001a\u00020C2\u0006\u0010\u0003\u001a\u00020C2\u0006\u0010\n\u001a\u00020CR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u001f\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\"\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u001a\u0010\'\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001a\u0010*\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R\u001a\u0010-\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015R\"\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR\u001a\u00103\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u0010\u0015R\u001a\u00106\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u0010\u0015R\u001a\u00109\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0013\"\u0004\b;\u0010\u0015R\u001a\u0010<\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0013\"\u0004\b>\u0010\u0015R\u001a\u0010?\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0013\"\u0004\bA\u0010\u0015\u00a8\u0006N"}, d2 = {"Lferra/solution/calculator/ui/HomeViewModel;", "Lferra/solution/calculator/base/BaseViewModel;", "()V", "container1", "Landroidx/lifecycle/MutableLiveData;", "", "getContainer1", "()Landroidx/lifecycle/MutableLiveData;", "setContainer1", "(Landroidx/lifecycle/MutableLiveData;)V", "container2", "getContainer2", "setContainer2", "container3", "getContainer3", "setContainer3", "eight", "", "getEight", "()I", "setEight", "(I)V", "firstOperation", "", "getFirstOperation", "()Z", "setFirstOperation", "(Z)V", "five", "getFive", "setFive", "four", "getFour", "setFour", "holeContainer", "getHoleContainer", "setHoleContainer", "isDarkMode", "setDarkMode", "nine", "getNine", "setNine", "one", "getOne", "setOne", "operationNumber", "getOperationNumber", "setOperationNumber", "result", "getResult", "setResult", "seven", "getSeven", "setSeven", "six", "getSix", "setSix", "three", "getThree", "setThree", "two", "getTwo", "setTwo", "zero", "getZero", "setZero", "add", "", "changeNumbersContainer", "", "operationType", "checkLastCharNotOperatorSign", "lastChar", "div", "getNumberFromTheButton", "number", "multiply", "sub", "app_debug"})
public final class HomeViewModel extends ferra.solution.calculator.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> container1;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> container2;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> container3;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> holeContainer;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> result;
    private int operationNumber;
    private boolean firstOperation;
    private boolean isDarkMode = true;
    private int zero = 0;
    private int one = 1;
    private int two = 2;
    private int three = 3;
    private int four = 4;
    private int five = 5;
    private int six = 6;
    private int seven = 7;
    private int eight = 8;
    private int nine = 9;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getContainer1() {
        return null;
    }
    
    public final void setContainer1(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getContainer2() {
        return null;
    }
    
    public final void setContainer2(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getContainer3() {
        return null;
    }
    
    public final void setContainer3(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getHoleContainer() {
        return null;
    }
    
    public final void setHoleContainer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
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
    
    public final boolean isDarkMode() {
        return false;
    }
    
    public final void setDarkMode(boolean p0) {
    }
    
    public final int getZero() {
        return 0;
    }
    
    public final void setZero(int p0) {
    }
    
    public final int getOne() {
        return 0;
    }
    
    public final void setOne(int p0) {
    }
    
    public final int getTwo() {
        return 0;
    }
    
    public final void setTwo(int p0) {
    }
    
    public final int getThree() {
        return 0;
    }
    
    public final void setThree(int p0) {
    }
    
    public final int getFour() {
        return 0;
    }
    
    public final void setFour(int p0) {
    }
    
    public final int getFive() {
        return 0;
    }
    
    public final void setFive(int p0) {
    }
    
    public final int getSix() {
        return 0;
    }
    
    public final void setSix(int p0) {
    }
    
    public final int getSeven() {
        return 0;
    }
    
    public final void setSeven(int p0) {
    }
    
    public final int getEight() {
        return 0;
    }
    
    public final void setEight(int p0) {
    }
    
    public final int getNine() {
        return 0;
    }
    
    public final void setNine(int p0) {
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
    
    public HomeViewModel() {
        super();
    }
}