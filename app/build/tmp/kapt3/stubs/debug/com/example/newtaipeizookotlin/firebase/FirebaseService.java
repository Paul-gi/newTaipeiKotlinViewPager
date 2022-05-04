package com.example.newtaipeizookotlin.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0003J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/newtaipeizookotlin/firebase/FirebaseService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "iPowerManager", "Landroid/os/PowerManager;", "mBundle", "Landroid/os/Bundle;", "mChannelID", "", "mChannelName", "mFirebasePageCode", "", "mFirebasePageTitle", "mIntent", "Landroid/content/Intent;", "mUtilTools", "Lcom/example/newtaipeizookotlin/tools/UtilTools;", "checkNotification", "", "pTitle", "pPageCode", "getRemoteView", "Landroid/widget/RemoteViews;", "pMessage", "onMessageReceived", "pRemoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "mToken", "sendNotification", "app_debug"})
public final class FirebaseService extends com.google.firebase.messaging.FirebaseMessagingService {
    private final com.example.newtaipeizookotlin.tools.UtilTools mUtilTools = null;
    private final java.lang.String mChannelID = "notificationChannelID";
    private final java.lang.String mChannelName = "com.example.taipeizookotlin";
    private android.os.Bundle mBundle;
    private android.content.Intent mIntent;
    private android.os.PowerManager iPowerManager;
    private java.lang.String mFirebasePageTitle = "";
    private int mFirebasePageCode = -1;
    
    public FirebaseService() {
        super();
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String mToken) {
    }
    
    @android.annotation.SuppressLint(value = {"UnspecifiedImmutableFlag"})
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage pRemoteMessage) {
    }
    
    /**
     * mFirebaseHavePageCode = true 代表有PageCode跟TitleName 所以走詳細頁面
     * 如果沒有PageCode但是有TitleName 就走列表頁
     * 否則走一般的流程
     */
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