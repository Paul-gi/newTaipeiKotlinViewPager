package com.example.newtaipeizookotlin.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0002J\b\u0010.\u001a\u00020,H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR\u000e\u0010$\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006/"}, d2 = {"Lcom/example/newtaipeizookotlin/fragments/ListPageFragment;", "Lcom/example/newtaipeizookotlin/fragments/BaseFragment;", "Lcom/example/newtaipeizookotlin/databinding/ListPageFragmentBinding;", "()V", "mApiPosition", "", "getMApiPosition", "()I", "setMApiPosition", "(I)V", "mCallViewModel", "Lcom/example/newtaipeizookotlin/viewmodel/ListPageCallViewModel;", "getMCallViewModel", "()Lcom/example/newtaipeizookotlin/viewmodel/ListPageCallViewModel;", "mCallViewModel$delegate", "Lkotlin/Lazy;", "mGridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "mHandler", "Landroid/os/Handler;", "mIsNoData", "", "mLayout", "getMLayout", "mLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mListDataAdapter", "Lcom/example/newtaipeizookotlin/adapter/ListDataAdapter;", "getMListDataAdapter", "()Lcom/example/newtaipeizookotlin/adapter/ListDataAdapter;", "mListDataAdapter$delegate", "mLock", "Ljava/util/concurrent/locks/ReentrantLock;", "mOriginPosition", "getMOriginPosition", "setMOriginPosition", "mPageState", "mPageTitle", "", "getMPageTitle", "()Ljava/lang/String;", "setMPageTitle", "(Ljava/lang/String;)V", "callApiThread", "", "getRoom", "initView", "app_debug"})
public final class ListPageFragment extends com.example.newtaipeizookotlin.fragments.BaseFragment<com.example.newtaipeizookotlin.databinding.ListPageFragmentBinding> {
    private androidx.recyclerview.widget.LinearLayoutManager mLinearLayoutManager;
    private androidx.recyclerview.widget.GridLayoutManager mGridLayoutManager;
    private boolean mIsNoData = false;
    private boolean mPageState = true;
    private java.util.concurrent.locks.ReentrantLock mLock;
    private final android.os.Handler mHandler = null;
    private int mOriginPosition = -1;
    private int mApiPosition = -1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mPageTitle = "";
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
    
    private final com.example.newtaipeizookotlin.viewmodel.ListPageCallViewModel getMCallViewModel() {
        return null;
    }
    
    private final com.example.newtaipeizookotlin.adapter.ListDataAdapter getMListDataAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    private final void callApiThread() {
    }
    
    private final void getRoom() {
    }
}