package com.example.newtaipeizookotlin.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\nH\u0017J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\"\u0010\u0013\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/newtaipeizookotlin/adapter/GoogleMapItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/newtaipeizookotlin/adapter/GoogleMapItemAdapter$MyViewHolder;", "()V", "mLocationDataList", "Ljava/util/ArrayList;", "Lcom/example/newtaipeizookotlin/datalist/LocationPositionData;", "mMapViewRecycleViewClickListener", "Lcom/example/newtaipeizookotlin/adapter/GoogleMapItemAdapter$MapViewRecycleViewClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "pLocationList", "pMapViewRecycleViewClickListener", "MapViewRecycleViewClickListener", "MyViewHolder", "app_debug"})
public final class GoogleMapItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.newtaipeizookotlin.adapter.GoogleMapItemAdapter.MyViewHolder> {
    private final java.util.ArrayList<com.example.newtaipeizookotlin.datalist.LocationPositionData> mLocationDataList = null;
    private com.example.newtaipeizookotlin.adapter.GoogleMapItemAdapter.MapViewRecycleViewClickListener mMapViewRecycleViewClickListener;
    
    public GoogleMapItemAdapter() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.newtaipeizookotlin.datalist.LocationPositionData> pLocationList, @org.jetbrains.annotations.Nullable()
    com.example.newtaipeizookotlin.adapter.GoogleMapItemAdapter.MapViewRecycleViewClickListener pMapViewRecycleViewClickListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.newtaipeizookotlin.adapter.GoogleMapItemAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor", "SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.newtaipeizookotlin.adapter.GoogleMapItemAdapter.MyViewHolder holder, @android.annotation.SuppressLint(value = {"RecyclerView"})
    int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/newtaipeizookotlin/adapter/GoogleMapItemAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "pMapViewRecycleViewClickListener", "Lcom/example/newtaipeizookotlin/adapter/GoogleMapItemAdapter$MapViewRecycleViewClickListener;", "(Landroid/view/View;Lcom/example/newtaipeizookotlin/adapter/GoogleMapItemAdapter$MapViewRecycleViewClickListener;)V", "mItem", "Landroid/widget/TextView;", "getMItem", "()Landroid/widget/TextView;", "mMapViewRecycleViewClickListener", "onClick", "", "v", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mItem = null;
        private com.example.newtaipeizookotlin.adapter.GoogleMapItemAdapter.MapViewRecycleViewClickListener mMapViewRecycleViewClickListener;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.Nullable()
        com.example.newtaipeizookotlin.adapter.GoogleMapItemAdapter.MapViewRecycleViewClickListener pMapViewRecycleViewClickListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMItem() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/newtaipeizookotlin/adapter/GoogleMapItemAdapter$MapViewRecycleViewClickListener;", "", "onMapViewClicked", "", "position", "", "app_debug"})
    public static abstract interface MapViewRecycleViewClickListener {
        
        public abstract void onMapViewClicked(int position);
    }
}