package com.example.newtaipeizookotlin.datalist;

import java.lang.System;

@java.lang.SuppressWarnings(value = {"SpellCheckingInspection"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bK\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\u0004R\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\u0004R\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\u0004R\u001a\u0010\'\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\u0004R\u001a\u0010*\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\u0004R\u001a\u0010-\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\u0004R\u001a\u00100\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\u0004R\u001a\u00103\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\u0004R\u001a\u00106\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\u0004R\u001a\u00109\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\u0004R\u001a\u0010<\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\u0004R\u001a\u0010?\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\u0004R\u001a\u0010B\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\u0004R\u001a\u0010E\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\u0004R\u001a\u0010H\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\u0004R\u001a\u0010K\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\u0004\u00a8\u0006N"}, d2 = {"Lcom/example/newtaipeizookotlin/datalist/ZooDataDetail;", "", "pType", "", "(Ljava/lang/String;)V", "KeyBrief", "getKeyBrief", "()Ljava/lang/String;", "setKeyBrief", "KeyEName", "getKeyEName", "setKeyEName", "KeyE_Pic_URL", "getKeyE_Pic_URL", "setKeyE_Pic_URL", "KeyFeature", "getKeyFeature", "setKeyFeature", "KeyFunctionApplication", "getKeyFunctionApplication", "setKeyFunctionApplication", "KeyGenus", "getKeyGenus", "setKeyGenus", "KeyInfo", "getKeyInfo", "setKeyInfo", "KeyMemo", "getKeyMemo", "setKeyMemo", "KeyUrl", "getKeyUrl", "setKeyUrl", "KeymAlsoKnown", "getKeymAlsoKnown", "setKeymAlsoKnown", "keyAlt01", "getKeyAlt01", "setKeyAlt01", "keyAlt02", "getKeyAlt02", "setKeyAlt02", "keyAlt03", "getKeyAlt03", "setKeyAlt03", "keyAlt04", "getKeyAlt04", "setKeyAlt04", "keyBehavior", "getKeyBehavior", "setKeyBehavior", "keyClass", "getKeyClass", "setKeyClass", "keyDistribution", "getKeyDistribution", "setKeyDistribution", "keyFamily", "getKeyFamily", "setKeyFamily", "keyGeo", "getKeyGeo", "setKeyGeo", "keyLocation", "getKeyLocation", "setKeyLocation", "keyUrl02", "getKeyUrl02", "setKeyUrl02", "keyUrl03", "getKeyUrl03", "setKeyUrl03", "keyUrl04", "getKeyUrl04", "setKeyUrl04", "keyVedio", "getKeyVedio", "setKeyVedio", "app_debug"})
public final class ZooDataDetail {
    
    /**
     * @param pType + _Pic02_URL
     * 因管區 最前面為 “X+固定字串”
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyUrl02;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyUrl03;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyUrl04;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyAlt01;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyAlt02;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyAlt03;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyAlt04;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyBehavior;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyDistribution;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyClass;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyFamily;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyVedio;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyLocation;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyGeo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String KeymAlsoKnown;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String KeyBrief;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String KeyFeature;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String KeyGenus;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String KeyFunctionApplication;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String KeyE_Pic_URL;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String KeyInfo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String KeyMemo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String KeyUrl;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String KeyEName;
    
    public ZooDataDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String pType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyUrl02() {
        return null;
    }
    
    public final void setKeyUrl02(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyUrl03() {
        return null;
    }
    
    public final void setKeyUrl03(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyUrl04() {
        return null;
    }
    
    public final void setKeyUrl04(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyAlt01() {
        return null;
    }
    
    public final void setKeyAlt01(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyAlt02() {
        return null;
    }
    
    public final void setKeyAlt02(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyAlt03() {
        return null;
    }
    
    public final void setKeyAlt03(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyAlt04() {
        return null;
    }
    
    public final void setKeyAlt04(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyBehavior() {
        return null;
    }
    
    public final void setKeyBehavior(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyDistribution() {
        return null;
    }
    
    public final void setKeyDistribution(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyClass() {
        return null;
    }
    
    public final void setKeyClass(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyFamily() {
        return null;
    }
    
    public final void setKeyFamily(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyVedio() {
        return null;
    }
    
    public final void setKeyVedio(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyLocation() {
        return null;
    }
    
    public final void setKeyLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyGeo() {
        return null;
    }
    
    public final void setKeyGeo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeymAlsoKnown() {
        return null;
    }
    
    public final void setKeymAlsoKnown(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyBrief() {
        return null;
    }
    
    public final void setKeyBrief(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyFeature() {
        return null;
    }
    
    public final void setKeyFeature(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyGenus() {
        return null;
    }
    
    public final void setKeyGenus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyFunctionApplication() {
        return null;
    }
    
    public final void setKeyFunctionApplication(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyE_Pic_URL() {
        return null;
    }
    
    public final void setKeyE_Pic_URL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyInfo() {
        return null;
    }
    
    public final void setKeyInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyMemo() {
        return null;
    }
    
    public final void setKeyMemo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyUrl() {
        return null;
    }
    
    public final void setKeyUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyEName() {
        return null;
    }
    
    public final void setKeyEName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}