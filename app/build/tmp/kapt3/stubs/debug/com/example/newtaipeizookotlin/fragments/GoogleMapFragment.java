package com.example.newtaipeizookotlin.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/newtaipeizookotlin/fragments/GoogleMapFragment;", "Lcom/example/newtaipeizookotlin/fragments/BaseFragment;", "Lcom/example/newtaipeizookotlin/databinding/GoogleMapFragmentBinding;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/example/newtaipeizookotlin/adapter/GoogleMapItemAdapter$MapViewRecycleViewClickListener;", "()V", "mGoogleMap", "Lcom/google/android/gms/maps/GoogleMap;", "mLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "mLayout", "", "getMLayout", "()I", "mLocationPositionListData", "Ljava/util/ArrayList;", "Lcom/example/newtaipeizookotlin/datalist/LocationPositionData;", "getBundle", "", "initView", "onMapReady", "googleMap", "onMapViewClicked", "position", "app_debug"})
public final class GoogleMapFragment extends com.example.newtaipeizookotlin.fragments.BaseFragment<com.example.newtaipeizookotlin.databinding.GoogleMapFragmentBinding> implements com.google.android.gms.maps.OnMapReadyCallback, com.example.newtaipeizookotlin.adapter.GoogleMapItemAdapter.MapViewRecycleViewClickListener {
    private com.google.android.gms.maps.GoogleMap mGoogleMap;
    private com.google.android.gms.maps.model.LatLng mLatLng;
    private java.util.ArrayList<com.example.newtaipeizookotlin.datalist.LocationPositionData> mLocationPositionListData;
    
    public GoogleMapFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getMLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    protected void getBundle() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public void onMapViewClicked(int position) {
    }
}