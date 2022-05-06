package com.example.newtaipeizookotlin.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u00103\u001a\u000204J\b\u00105\u001a\u000204H\u0002J\b\u00106\u001a\u000204H\u0002J\b\u00107\u001a\u000204H\u0016J\u0006\u00108\u001a\u000204R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0007R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b$\u0010%R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u000e\u0010,\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u00069"}, d2 = {"Lcom/example/newtaipeizookotlin/fragments/ListPageFragment;", "Lcom/example/newtaipeizookotlin/fragments/BaseFragment;", "Lcom/example/newtaipeizookotlin/databinding/ListPageFragmentBinding;", "()V", "mApiPosition", "", "getMApiPosition", "()I", "setMApiPosition", "(I)V", "mCallViewModel", "Lcom/example/newtaipeizookotlin/viewmodel/ListPageCallViewModel;", "getMCallViewModel", "()Lcom/example/newtaipeizookotlin/viewmodel/ListPageCallViewModel;", "mCallViewModel$delegate", "Lkotlin/Lazy;", "mCanCallApiFlag", "", "getMCanCallApiFlag", "()Z", "setMCanCallApiFlag", "(Z)V", "mGridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "mHandler", "Landroid/os/Handler;", "mIsNoData", "mLayout", "getMLayout", "mLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mListData", "Ljava/util/ArrayList;", "Lcom/example/newtaipeizookotlin/datalist/ListData;", "mListDataAdapter", "Lcom/example/newtaipeizookotlin/adapter/ListDataAdapter;", "getMListDataAdapter", "()Lcom/example/newtaipeizookotlin/adapter/ListDataAdapter;", "mListDataAdapter$delegate", "mLock", "Ljava/util/concurrent/locks/ReentrantLock;", "mOriginPosition", "getMOriginPosition", "setMOriginPosition", "mPageState", "mPageTitle", "", "getMPageTitle", "()Ljava/lang/String;", "setMPageTitle", "(Ljava/lang/String;)V", "callApiFromAdapter", "", "callApiThread", "getRoom", "initView", "setApiFlag", "app_debug"})
public final class ListPageFragment extends com.example.newtaipeizookotlin.fragments.BaseFragment<com.example.newtaipeizookotlin.databinding.ListPageFragmentBinding> {
    private androidx.recyclerview.widget.LinearLayoutManager mLinearLayoutManager;
    private androidx.recyclerview.widget.GridLayoutManager mGridLayoutManager;
    private boolean mIsNoData = false;
    private boolean mPageState = true;
    private java.util.concurrent.locks.ReentrantLock mLock;
    private final android.os.Handler mHandler = null;
    private final java.util.ArrayList<com.example.newtaipeizookotlin.datalist.ListData> mListData = null;
    private int mOriginPosition = -1;
    private int mApiPosition = -1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mPageTitle = "";
    private boolean mCanCallApiFlag = false;
    private final kotlin.Lazy mCallViewModel$delegate = null;
    private final kotlin.Lazy mListDataAdapter$delegate = null;
    
    public ListPageFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getMLayout() {
        return 0;
    }
    
    public final int getMOriginPosition() {
        return 0;
    }
    
    public final void setMOriginPosition(int p0) {
    }
    
    public final int getMApiPosition() {
        return 0;
    }
    
    public final void setMApiPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMPageTitle() {
        return null;
    }
    
    public final void setMPageTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getMCanCallApiFlag() {
        return false;
    }
    
    public final void setMCanCallApiFlag(boolean p0) {
    }
    
    public final void setApiFlag() {
    }
    
    public final void callApiFromAdapter() {
    }
    
    private final com.example.newtaipeizookotlin.viewmodel.ListPageCallViewModel getMCallViewModel() {
        return null;
    }
    
    private final com.example.newtaipeizookotlin.adapter.ListDataAdapter getMListDataAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    private final void callApiThread() {
    }
    
    private final void getRoom() {
    }
}