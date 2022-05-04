package com.example.newtaipeizookotlin.databinding;
import com.example.newtaipeizookotlin.R;
import com.example.newtaipeizookotlin.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainDetailFragmentBindingImpl extends MainDetailFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(1, 
            new String[] {"toolbar_layout", "animal_detail", "plant_detail", "department_detail", "detail_below_part"},
            new int[] {2, 3, 4, 5, 6},
            new int[] {com.example.newtaipeizookotlin.R.layout.toolbar_layout,
                com.example.newtaipeizookotlin.R.layout.animal_detail,
                com.example.newtaipeizookotlin.R.layout.plant_detail,
                com.example.newtaipeizookotlin.R.layout.department_detail,
                com.example.newtaipeizookotlin.R.layout.detail_below_part});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.LinearLayoutCompat mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainDetailFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private MainDetailFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (com.example.newtaipeizookotlin.databinding.AnimalDetailBinding) bindings[3]
            , (com.example.newtaipeizookotlin.databinding.DetailBelowPartBinding) bindings[6]
            , (com.example.newtaipeizookotlin.databinding.DepartmentDetailBinding) bindings[5]
            , (com.example.newtaipeizookotlin.databinding.PlantDetailBinding) bindings[4]
            , (com.example.newtaipeizookotlin.databinding.ToolbarLayoutBinding) bindings[2]
            );
        setContainedBinding(this.mAnimalDetail);
        setContainedBinding(this.mBelowDetail);
        setContainedBinding(this.mDepartmentDetail);
        setContainedBinding(this.mPlantDetail);
        setContainedBinding(this.mToolbarLayout);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.LinearLayoutCompat) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        mToolbarLayout.invalidateAll();
        mAnimalDetail.invalidateAll();
        mPlantDetail.invalidateAll();
        mDepartmentDetail.invalidateAll();
        mBelowDetail.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mToolbarLayout.hasPendingBindings()) {
            return true;
        }
        if (mAnimalDetail.hasPendingBindings()) {
            return true;
        }
        if (mPlantDetail.hasPendingBindings()) {
            return true;
        }
        if (mDepartmentDetail.hasPendingBindings()) {
            return true;
        }
        if (mBelowDetail.hasPendingBindings()) {
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
        mToolbarLayout.setLifecycleOwner(lifecycleOwner);
        mAnimalDetail.setLifecycleOwner(lifecycleOwner);
        mPlantDetail.setLifecycleOwner(lifecycleOwner);
        mDepartmentDetail.setLifecycleOwner(lifecycleOwner);
        mBelowDetail.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMToolbarLayout((com.example.newtaipeizookotlin.databinding.ToolbarLayoutBinding) object, fieldId);
            case 1 :
                return onChangeMPlantDetail((com.example.newtaipeizookotlin.databinding.PlantDetailBinding) object, fieldId);
            case 2 :
                return onChangeMBelowDetail((com.example.newtaipeizookotlin.databinding.DetailBelowPartBinding) object, fieldId);
            case 3 :
                return onChangeMAnimalDetail((com.example.newtaipeizookotlin.databinding.AnimalDetailBinding) object, fieldId);
            case 4 :
                return onChangeMDepartmentDetail((com.example.newtaipeizookotlin.databinding.DepartmentDetailBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMToolbarLayout(com.example.newtaipeizookotlin.databinding.ToolbarLayoutBinding MToolbarLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMPlantDetail(com.example.newtaipeizookotlin.databinding.PlantDetailBinding MPlantDetail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMBelowDetail(com.example.newtaipeizookotlin.databinding.DetailBelowPartBinding MBelowDetail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMAnimalDetail(com.example.newtaipeizookotlin.databinding.AnimalDetailBinding MAnimalDetail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMDepartmentDetail(com.example.newtaipeizookotlin.databinding.DepartmentDetailBinding MDepartmentDetail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        executeBindingsOn(mToolbarLayout);
        executeBindingsOn(mAnimalDetail);
        executeBindingsOn(mPlantDetail);
        executeBindingsOn(mDepartmentDetail);
        executeBindingsOn(mBelowDetail);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mToolbarLayout
        flag 1 (0x2L): mPlantDetail
        flag 2 (0x3L): mBelowDetail
        flag 3 (0x4L): mAnimalDetail
        flag 4 (0x5L): mDepartmentDetail
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}