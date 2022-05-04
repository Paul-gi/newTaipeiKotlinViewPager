package com.example.newtaipeizookotlin.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\f"}, d2 = {"Lcom/example/newtaipeizookotlin/service/ZooApiService;", "", "getAnimalData", "Lretrofit2/Call;", "Lcom/google/gson/JsonObject;", "count", "", "startCount", "getPavilionData", "area", "", "getPlantData", "app_debug"})
public abstract interface ZooApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/v1/dataset/a3e2b221-75e0-45c1-8f97-75acbd43d613?scope=resourceAquire&limit&offset")
    public abstract retrofit2.Call<com.google.gson.JsonObject> getAnimalData(@retrofit2.http.Query(value = "limit")
    int count, @retrofit2.http.Query(value = "offset")
    int startCount);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/v1/dataset/5a0e5fbb-72f8-41c6-908e-2fb25eff9b8a?scope=resourceAquire&q&limit&offset")
    public abstract retrofit2.Call<com.google.gson.JsonObject> getPavilionData(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "q")
    java.lang.String area, @retrofit2.http.Query(value = "limit")
    int count, @retrofit2.http.Query(value = "offset")
    int startCount);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/v1/dataset/f18de02f-b6c9-47c0-8cda-50efad621c14?scope=resourceAquire&limit&offset")
    public abstract retrofit2.Call<com.google.gson.JsonObject> getPlantData(@retrofit2.http.Query(value = "limit")
    int count, @retrofit2.http.Query(value = "offset")
    int startCount);
}