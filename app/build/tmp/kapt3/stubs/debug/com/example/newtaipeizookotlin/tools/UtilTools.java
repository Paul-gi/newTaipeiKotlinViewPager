package com.example.newtaipeizookotlin.tools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0010J$\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017J$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017J0\u0010\u001a\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010J*\u0010\u001a\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/newtaipeizookotlin/tools/UtilTools;", "", "()V", "isFirst", "", "controlPicture", "", "pContext", "Landroid/content/Context;", "pString", "", "pImage", "Landroid/widget/ImageView;", "setData", "pShowContext", "pTextView", "Landroid/widget/TextView;", "setGeo", "pListData", "Lcom/example/newtaipeizookotlin/datalist/ListData;", "pLocationPositionData", "Lcom/example/newtaipeizookotlin/datalist/LocationPositionData;", "pGeoListData", "Ljava/util/ArrayList;", "setLocation", "pLocationPositionDataArrayList", "setPictureGone", "pURL", "pImageView", "mImageTitleView", "setTextScrollView", "wakeUpPhone", "iPowerManager", "Landroid/os/PowerManager;", "app_debug"})
public final class UtilTools {
    private boolean isFirst = true;
    
    public UtilTools() {
        super();
    }
    
    /**
     * @param pString ??????url??????
     * @param pImage  image??????
     * ??????https????????????????????????isFirst ??????call????????????????????????????????????
     * gilde???????????????????????????minifast?????????xml???netWork&??????????????????
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final void controlPicture(@org.jetbrains.annotations.Nullable()
    android.content.Context pContext, @org.jetbrains.annotations.NotNull()
    java.lang.String pString, @org.jetbrains.annotations.Nullable()
    android.widget.ImageView pImage) throws java.lang.Exception {
    }
    
    /**
     * @param pContext        context
     * @param pURL            ??????URL ??????????????????
     * @param pImageView      ????????????
     * @param pTextView       ??????????????????
     * @param mImageTitleView ??????????????????????????????Title???mark???
     */
    public final void setPictureGone(@org.jetbrains.annotations.Nullable()
    android.content.Context pContext, @org.jetbrains.annotations.NotNull()
    java.lang.String pURL, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView pImageView, @org.jetbrains.annotations.NotNull()
    android.widget.TextView pTextView, @org.jetbrains.annotations.NotNull()
    android.widget.TextView mImageTitleView) {
    }
    
    /**
     * ???????????????????????????tool
     *
     * @param pContext
     * @param pURL
     * @param pImageView
     * @param pTextView
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final void setPictureGone(@org.jetbrains.annotations.Nullable()
    android.content.Context pContext, @org.jetbrains.annotations.Nullable()
    java.lang.String pURL, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView pImageView, @org.jetbrains.annotations.NotNull()
    android.widget.TextView pTextView) throws java.lang.Exception {
    }
    
    /**
     * ????????????????????????
     */
    public final void setGeo(@org.jetbrains.annotations.NotNull()
    com.example.newtaipeizookotlin.datalist.ListData pListData, @org.jetbrains.annotations.NotNull()
    com.example.newtaipeizookotlin.datalist.LocationPositionData pLocationPositionData, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.newtaipeizookotlin.datalist.LocationPositionData> pGeoListData) {
    }
    
    /**
     * ???????????????Map
     */
    @kotlin.Suppress(names = {"NAME_SHADOWING"})
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    com.example.newtaipeizookotlin.datalist.ListData pListData, @org.jetbrains.annotations.NotNull()
    com.example.newtaipeizookotlin.datalist.LocationPositionData pLocationPositionData, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.newtaipeizookotlin.datalist.LocationPositionData> pLocationPositionDataArrayList) {
    }
    
    /**
     * ?????????????????????GONE??????
     */
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.lang.String pShowContext, @org.jetbrains.annotations.NotNull()
    android.widget.TextView pTextView) {
    }
    
    /**
     * ???ScrollView?????????TextView??????
     */
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public final void setTextScrollView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView pTextView) {
    }
    
    /**
     * ????????????
     */
    @android.annotation.SuppressLint(value = {"InvalidWakeLockTag"})
    public final void wakeUpPhone(@org.jetbrains.annotations.NotNull()
    android.os.PowerManager iPowerManager) {
    }
}