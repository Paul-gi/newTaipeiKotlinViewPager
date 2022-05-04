package com.example.newtaipeizookotlin.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u000bJ\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/newtaipeizookotlin/service/RetrofitManager;", "", "()V", "mRetrofitManager", "createService", "T", "service", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getInstance", "getSSLOkHttpClient", "Lokhttp3/OkHttpClient;", "okHttpClient", "retrofit", "Lretrofit2/Retrofit;", "app_debug"})
public final class RetrofitManager {
    @kotlin.jvm.Volatile()
    private volatile com.example.newtaipeizookotlin.service.RetrofitManager mRetrofitManager;
    
    public RetrofitManager() {
        super();
    }
    
    @kotlin.Suppress(names = {"NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS"})
    public final <T extends java.lang.Object>T createService(@org.jetbrains.annotations.Nullable()
    java.lang.Class<T> service) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.newtaipeizookotlin.service.RetrofitManager getInstance() {
        return null;
    }
    
    private final retrofit2.Retrofit retrofit() {
        return null;
    }
    
    private final okhttp3.OkHttpClient okHttpClient() {
        return null;
    }
    
    /**
     * 设置https 访问的时候对所有证书都进行信任
     *
     * @throws Exception
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final okhttp3.OkHttpClient getSSLOkHttpClient() throws java.lang.Exception {
        return null;
    }
}