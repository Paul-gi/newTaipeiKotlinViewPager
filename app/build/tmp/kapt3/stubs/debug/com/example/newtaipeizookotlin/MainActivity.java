package com.example.newtaipeizookotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fH\u0003J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0003J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\u0012\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0014J\u0012\u0010!\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0014J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\fH\u0003J\b\u0010$\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/newtaipeizookotlin/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activityMainBinding", "Lcom/example/newtaipeizookotlin/databinding/ActivityMainBinding;", "mBundle", "Landroid/os/Bundle;", "mFormFirebase", "", "mIntent", "Landroid/content/Intent;", "mPageCode", "", "mTitleStr", "", "myApplication", "Lcom/example/newtaipeizookotlin/MyApplication;", "checkNotification", "", "pTitle", "pPageCode", "fcmTest", "funSelectPage", "getBundle", "pIntent", "getRemoteView", "Landroid/widget/RemoteViews;", "pMessage", "init", "initView", "onBackPressed", "onCreate", "savedInstanceState", "onNewIntent", "intent", "sendNotification", "setBundle", "app_debug"})
public class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.newtaipeizookotlin.databinding.ActivityMainBinding activityMainBinding;
    private com.example.newtaipeizookotlin.MyApplication myApplication;
    private android.content.Intent mIntent;
    private final android.os.Bundle mBundle = null;
    private java.lang.String mTitleStr = "";
    private int mPageCode = -1;
    private boolean mFormFirebase = false;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void init() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final void getBundle(android.content.Intent pIntent) {
    }
    
    private final void setBundle() {
    }
    
    private final void funSelectPage() {
    }
    
    private final void fcmTest() {
    }
    
    @android.annotation.SuppressLint(value = {"UnspecifiedImmutableFlag"})
    private final void checkNotification(java.lang.String pTitle, int pPageCode) {
    }
    
    @android.annotation.SuppressLint(value = {"UnspecifiedImmutableFlag", "LaunchActivityFromNotification"})
    private final void sendNotification(java.lang.String pTitle, int pMessage) {
    }
    
    @android.annotation.SuppressLint(value = {"RemoteViewLayout"})
    private final android.widget.RemoteViews getRemoteView(java.lang.String pTitle, java.lang.String pMessage) {
        return null;
    }
}