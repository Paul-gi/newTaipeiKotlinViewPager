package com.example.newtaipeizookotlin.databinding;
import com.example.newtaipeizookotlin.R;
import com.example.newtaipeizookotlin.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeFragmentBindingImpl extends HomeFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(1, 
            new String[] {"all_area_navigation", "department_selectpage_fragment"},
            new int[] {2, 3},
            new int[] {com.example.newtaipeizookotlin.R.layout.all_area_navigation,
                com.example.newtaipeizookotlin.R.layout.department_selectpage_fragment});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.LinearLayoutCompat mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private HomeFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.example.newtaipeizookotlin.databinding.AllAreaNavigationBinding) bindings[2]
            , (com.example.newtaipeizookotlin.databinding.DepartmentSelectpageFragmentBinding) bindings[3]
            );
        setContainedBinding(this.mAllAreaNavigationIC);
        setContainedBinding(this.mDepartmentSelect);
        this.mboundView0 = (androidx.appcompat.widget.LinearLayoutCompat) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mAllAreaNavigationIC.invalidateAll();
        mDepartmentSelect.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mAllAreaNavigationIC.hasPendingBindings()) {
            return true;
        }
        if (mDepartmentSelect.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mAllAreaNavigationIC.setLifecycleOwner(lifecycleOwner);
        mDepartmentSelect.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMDepartmentSelect((com.example.newtaipeizookotlin.databinding.DepartmentSelectpageFragmentBinding) object, fieldId);
            case 1 :
                return onChangeMAllAreaNavigationIC((com.example.newtaipeizookotlin.databinding.AllAreaNavigationBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMDepartmentSelect(com.example.newtaipeizookotlin.databinding.DepartmentSelectpageFragmentBinding MDepartmentSelect, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMAllAreaNavigationIC(com.example.newtaipeizookotlin.databinding.AllAreaNavigationBinding MAllAreaNavigationIC, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        // batch finished
        executeBindingsOn(mAllAreaNavigationIC);
        executeBindingsOn(mDepartmentSelect);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mDepartmentSelect
        flag 1 (0x2L): mAllAreaNavigationIC
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}