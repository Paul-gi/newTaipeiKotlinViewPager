package com.example.newtaipeizookotlin.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0007J \u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n0\u0007J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0007J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013J&\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000eJ&\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013J\u0016\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cR\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/newtaipeizookotlin/viewmodel/ListPageCallViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "mCall", "Lretrofit2/Call;", "Lcom/google/gson/JsonObject;", "mDataList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/example/newtaipeizookotlin/datalist/ListData;", "Lkotlin/collections/ArrayList;", "mGettingData", "", "mIndex", "", "mIsNoData", "mNeedCallApi", "mNotMoreData", "mPageTitle", "", "mRawDataStr", "getDataFinishState", "getDataListObserver", "getNeedCallApi", "getViewPagerListDataRoom", "", "pPosition", "pContext", "Landroid/content/Context;", "pTitleName", "mCallApi", "pOriginPosition", "setRawDataToArrayList", "iRawData", "setViewPagerListDataRoom", "app_debug"})
public final class ListPageCallViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.newtaipeizookotlin.datalist.ListData>> mDataList = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mIsNoData = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> mNeedCallApi;
    private int mIndex = 0;
    private boolean mNotMoreData = false;
    private boolean mGettingData = false;
    private retrofit2.Call<com.google.gson.JsonObject> mCall;
    private java.lang.String mPageTitle = "";
    private java.lang.String mRawDataStr = "";
    
    public ListPageCallViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.newtaipeizookotlin.datalist.ListData>> getDataListObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDataFinishState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNeedCallApi() {
        return null;
    }
    
    public final void mCallApi(@org.jetbrains.annotations.NotNull()
    java.lang.String pTitleName, int pPosition, @org.jetbrains.annotations.NotNull()
    android.content.Context pContext, int pOriginPosition) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.newtaipeizookotlin.datalist.ListData> setRawDataToArrayList(@org.jetbrains.annotations.NotNull()
    java.lang.String iRawData, @org.jetbrains.annotations.NotNull()
    java.lang.String pTitleName) {
        return null;
    }
    
    public final void setViewPagerListDataRoom(int pPosition, @org.jetbrains.annotations.NotNull()
    android.content.Context pContext) {
    }
    
    public final void getViewPagerListDataRoom(int pPosition, @org.jetbrains.annotations.NotNull()
    android.content.Context pContext, @org.jetbrains.annotations.NotNull()
    java.lang.String pTitleName) {
    }
}