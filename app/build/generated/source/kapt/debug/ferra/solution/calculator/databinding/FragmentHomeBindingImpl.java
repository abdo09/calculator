package ferra.solution.calculator.databinding;
import ferra.solution.calculator.R;
import ferra.solution.calculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements ferra.solution.calculator.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline1, 18);
        sViewsWithIds.put(R.id.tv_calculation, 19);
        sViewsWithIds.put(R.id.tv_equal_sign, 20);
        sViewsWithIds.put(R.id.tv_result, 21);
        sViewsWithIds.put(R.id.guideline2, 22);
        sViewsWithIds.put(R.id.guideline3, 23);
        sViewsWithIds.put(R.id.constraintLayout, 24);
        sViewsWithIds.put(R.id.guideline11, 25);
        sViewsWithIds.put(R.id.btn_left_bracket, 26);
        sViewsWithIds.put(R.id.btn_right_bracket, 27);
        sViewsWithIds.put(R.id.btn_sqrt, 28);
        sViewsWithIds.put(R.id.btn_percentage, 29);
        sViewsWithIds.put(R.id.btn_plus_minus, 30);
        sViewsWithIds.put(R.id.guideline12, 31);
        sViewsWithIds.put(R.id.guideline13, 32);
        sViewsWithIds.put(R.id.btn_equal, 33);
        sViewsWithIds.put(R.id.guideline4, 34);
        sViewsWithIds.put(R.id.guideline5, 35);
        sViewsWithIds.put(R.id.guideline6, 36);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 37, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[17]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[33]
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , (androidx.appcompat.widget.AppCompatButton) bindings[26]
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , (androidx.appcompat.widget.AppCompatButton) bindings[29]
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (androidx.appcompat.widget.AppCompatButton) bindings[30]
            , (androidx.appcompat.widget.AppCompatButton) bindings[27]
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (androidx.appcompat.widget.AppCompatButton) bindings[28]
            , (androidx.appcompat.widget.AppCompatButton) bindings[14]
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , (androidx.constraintlayout.widget.Guideline) bindings[18]
            , (androidx.constraintlayout.widget.Guideline) bindings[25]
            , (androidx.constraintlayout.widget.Guideline) bindings[31]
            , (androidx.constraintlayout.widget.Guideline) bindings[32]
            , (androidx.constraintlayout.widget.Guideline) bindings[22]
            , (androidx.constraintlayout.widget.Guideline) bindings[23]
            , (androidx.constraintlayout.widget.Guideline) bindings[34]
            , (androidx.constraintlayout.widget.Guideline) bindings[35]
            , (androidx.constraintlayout.widget.Guideline) bindings[36]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[21]
            );
        this.btnClear.setTag(null);
        this.btnDelete.setTag(null);
        this.btnDivision.setTag(null);
        this.btnDot.setTag(null);
        this.btnEight.setTag(null);
        this.btnFive.setTag(null);
        this.btnFour.setTag(null);
        this.btnMinus.setTag(null);
        this.btnMulti.setTag(null);
        this.btnNine.setTag(null);
        this.btnOne.setTag(null);
        this.btnPlus.setTag(null);
        this.btnSeven.setTag(null);
        this.btnSix.setTag(null);
        this.btnThree.setTag(null);
        this.btnTwo.setTag(null);
        this.btnZero.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 15);
        mCallback11 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 11);
        mCallback6 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 6);
        mCallback2 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 2);
        mCallback16 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 16);
        mCallback12 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 12);
        mCallback9 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 9);
        mCallback5 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 5);
        mCallback1 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 1);
        mCallback17 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 17);
        mCallback13 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 13);
        mCallback8 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 8);
        mCallback4 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 4);
        mCallback14 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 14);
        mCallback10 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 10);
        mCallback7 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 7);
        mCallback3 = new ferra.solution.calculator.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ferra.solution.calculator.ui.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ferra.solution.calculator.ui.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnClear.setOnClickListener(mCallback1);
            this.btnDelete.setOnClickListener(mCallback17);
            this.btnDivision.setOnClickListener(mCallback3);
            this.btnDot.setOnClickListener(mCallback15);
            this.btnEight.setOnClickListener(mCallback5);
            this.btnFive.setOnClickListener(mCallback9);
            this.btnFour.setOnClickListener(mCallback8);
            this.btnMinus.setOnClickListener(mCallback7);
            this.btnMulti.setOnClickListener(mCallback2);
            this.btnNine.setOnClickListener(mCallback6);
            this.btnOne.setOnClickListener(mCallback12);
            this.btnPlus.setOnClickListener(mCallback11);
            this.btnSeven.setOnClickListener(mCallback4);
            this.btnSix.setOnClickListener(mCallback10);
            this.btnThree.setOnClickListener(mCallback14);
            this.btnTwo.setOnClickListener(mCallback13);
            this.btnZero.setOnClickListener(mCallback16);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 15: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getNumberFromTheButton('.');
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.changeNumbersContainer(4);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getNumberFromTheButton('9');
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.changeNumbersContainer(1);
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getNumberFromTheButton('0');
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getNumberFromTheButton('1');
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getNumberFromTheButton('5');
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getNumberFromTheButton('8');
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.clearAll('C');
                }
                break;
            }
            case 17: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.deleteButton();
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getNumberFromTheButton('2');
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getNumberFromTheButton('4');
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getNumberFromTheButton('7');
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getNumberFromTheButton('3');
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getNumberFromTheButton('6');
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.changeNumbersContainer(3);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ferra.solution.calculator.ui.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.changeNumbersContainer(2);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}