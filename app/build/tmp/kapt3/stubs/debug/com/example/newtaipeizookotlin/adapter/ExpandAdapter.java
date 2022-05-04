package com.example.newtaipeizookotlin.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\"\u0010\u0013\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/newtaipeizookotlin/adapter/ExpandAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/newtaipeizookotlin/adapter/ExpandAdapter$ViewHolder;", "()V", "mExpandListData", "Ljava/util/ArrayList;", "", "mExpandRecycleViewClickListener", "Lcom/example/newtaipeizookotlin/adapter/ExpandAdapter$ExpandRecycleViewClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "pExpandListData", "pExpandRecycleViewClickListener", "ExpandRecycleViewClickListener", "ViewHolder", "app_debug"})
public final class ExpandAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.newtaipeizookotlin.adapter.ExpandAdapter.ViewHolder> {
    private final java.util.ArrayList<java.lang.String> mExpandListData = null;
    private com.example.newtaipeizookotlin.adapter.ExpandAdapter.ExpandRecycleViewClickListener mExpandRecycleViewClickListener;
    
    public ExpandAdapter() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> pExpandListData, @org.jetbrains.annotations.Nullable()
    com.example.newtaipeizookotlin.adapter.ExpandAdapter.ExpandRecycleViewClickListener pExpandRecycleViewClickListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.newtaipeizookotlin.adapter.ExpandAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.newtaipeizookotlin.adapter.ExpandAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/example/newtaipeizookotlin/adapter/ExpandAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "pExpandRecycleViewClickListener", "Lcom/example/newtaipeizookotlin/adapter/ExpandAdapter$ExpandRecycleViewClickListener;", "(Landroid/view/View;Lcom/example/newtaipeizookotlin/adapter/ExpandAdapter$ExpandRecycleViewClickListener;)V", "mExpandRecycleViewClickListener", "mName", "Landroid/widget/TextView;", "getMName", "()Landroid/widget/TextView;", "setMName", "(Landroid/widget/TextView;)V", "onClick", "", "v", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mName;
        private com.example.newtaipeizookotlin.adapter.ExpandAdapter.ExpandRecycleViewClickListener mExpandRecycleViewClickListener;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.Nullable()
        com.example.newtaipeizookotlin.adapter.ExpandAdapter.ExpandRecycleViewClickListener pExpandRecycleViewClickListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMName() {
            return null;
        }
        
        public final void setMName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/newtaipeizookotlin/adapter/ExpandAdapter$ExpandRecycleViewClickListener;", "", "onViewClicked", "", "position", "", "app_debug"})
    public static abstract interface ExpandRecycleViewClickListener {
        
        public abstract void onViewClicked(int position);
    }
}