package com.example.newtaipeizookotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/newtaipeizookotlin/ListViewPager;", "Lcom/example/newtaipeizookotlin/fragments/BaseFragment;", "Lcom/example/newtaipeizookotlin/databinding/ListviewpagerBinding;", "Lcom/example/newtaipeizookotlin/adapter/ExpandAdapter$ExpandRecycleViewClickListener;", "()V", "mExpandArrayList", "Ljava/util/ArrayList;", "", "mIsScrollEnable", "", "mLayout", "", "getMLayout", "()I", "mViewPagerCount", "initView", "", "onViewClicked", "position", "startImageRotate", "imageView", "Landroid/widget/ImageView;", "toggle", "app_debug"})
public final class ListViewPager extends com.example.newtaipeizookotlin.fragments.BaseFragment<com.example.newtaipeizookotlin.databinding.ListviewpagerBinding> implements com.example.newtaipeizookotlin.adapter.ExpandAdapter.ExpandRecycleViewClickListener {
    private int mViewPagerCount = 5;
    private java.util.ArrayList<java.lang.String> mExpandArrayList;
    private boolean mIsScrollEnable = false;
    
    public ListViewPager() {
        super();
    }
    
    @java.lang.Override()
    public int getMLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    /**
     * 旋转箭头图标
     */
    private final void startImageRotate(android.widget.ImageView imageView, boolean toggle) {
    }
    
    @java.lang.Override()
    public int onViewClicked(int position) {
        return 0;
    }
}