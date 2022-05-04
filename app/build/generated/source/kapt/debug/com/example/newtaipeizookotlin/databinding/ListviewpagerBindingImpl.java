package com.example.newtaipeizookotlin.databinding;
import com.example.newtaipeizookotlin.R;
import com.example.newtaipeizookotlin.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListviewpagerBindingImpl extends ListviewpagerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"expandrecyclew"},
            new int[] {1},
            new int[] {com.example.newtaipeizookotlin.R.layout.expandrecyclew});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ExpandBtn, 2);
        sViewsWithIds.put(R.id.tv_tip, 3);
        sViewsWithIds.put(R.id.iv_arrow, 4);
        sViewsWithIds.put(R.id.tabLayout, 5);
        sViewsWithIds.put(R.id.viewPager2, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListviewpagerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ListviewpagerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (com.example.newtaipeizookotlin.databinding.ExpandrecyclewBinding) bindings[1]
            , (com.google.android.material.tabs.TabLayout) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (androidx.viewpager2.widget.ViewPager2) bindings[6]
            );
        setContainedBinding(this.mExpandRecycleView);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        mExpandRecycleView.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mExpandRecycleView.hasPendingBindings()) {
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
        mExpandRecycleView.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMExpandRecycleView((com.example.newtaipeizookotlin.databinding.ExpandrecyclewBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMExpandRecycleView(com.example.newtaipeizookotlin.databinding.ExpandrecyclewBinding MExpandRecycleView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        executeBindingsOn(mExpandRecycleView);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mExpandRecycleView
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}