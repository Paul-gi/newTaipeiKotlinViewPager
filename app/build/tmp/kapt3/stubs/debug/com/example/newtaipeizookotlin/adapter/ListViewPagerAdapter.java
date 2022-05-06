package com.example.newtaipeizookotlin.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000bH\u0002R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/newtaipeizookotlin/adapter/ListViewPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "mFragmentManager", "Landroidx/fragment/app/FragmentManager;", "mLifecycle", "Landroidx/lifecycle/Lifecycle;", "mCount", "", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;I)V", "mFragment", "Ljava/util/HashMap;", "Lcom/example/newtaipeizookotlin/fragments/ListPageFragment;", "mSelected", "pCount", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "getItemCount", "setApiFlag", "", "pPosition", "setCallAnimal", "pListFragment", "setCallPlant", "app_debug"})
public final class ListViewPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final int pCount = 0;
    private final java.util.HashMap<java.lang.Integer, com.example.newtaipeizookotlin.fragments.ListPageFragment> mFragment = null;
    private int mSelected = -1;
    
    public ListViewPagerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager mFragmentManager, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle mLifecycle, int mCount) {
        super(null);
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    private final void setCallAnimal(com.example.newtaipeizookotlin.fragments.ListPageFragment pListFragment) {
    }
    
    private final void setCallPlant(com.example.newtaipeizookotlin.fragments.ListPageFragment pListFragment) {
    }
    
    public final void setApiFlag(int pPosition) {
    }
}