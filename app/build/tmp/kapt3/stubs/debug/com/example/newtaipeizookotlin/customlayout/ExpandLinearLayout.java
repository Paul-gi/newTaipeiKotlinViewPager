package com.example.newtaipeizookotlin.customlayout;

import java.lang.System;

/**
 * Created by yechao on 2020/11/11.
 * Describe : 可收起展开的LinearLayout
 *
 * 步骤：
 * 1.初始化参数 设置方向等
 * 2.根据动画执行进度计算高度
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0014J\b\u0010\u001c\u001a\u00020\u0018H\u0003J\u0006\u0010\u001d\u001a\u00020\u0013R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001e"}, d2 = {"Lcom/example/newtaipeizookotlin/customlayout/ExpandLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "allChildHeight", "value", "", "animPercent", "setAnimPercent", "(F)V", "firstChildHeight", "isOpen", "", "()Z", "setOpen", "(Z)V", "initView", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "startAnim", "toggle", "app_debug"})
public final class ExpandLinearLayout extends android.widget.LinearLayout {
    private boolean isOpen = true;
    private int firstChildHeight = 0;
    private int allChildHeight = 0;
    
    /**
     * 动画值改变的时候 请求重新布局
     */
    private float animPercent = 0.0F;
    
    public final boolean isOpen() {
        return false;
    }
    
    public final void setOpen(boolean p0) {
    }
    
    private final void setAnimPercent(float value) {
    }
    
    public ExpandLinearLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ExpandLinearLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public ExpandLinearLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet, int defStyleAttr) {
        super(null);
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public final boolean toggle() {
        return false;
    }
    
    /**
     * 执行动画的时候 更改 animPercent 属性的值 即从0-1
     */
    @android.annotation.SuppressLint(value = {"AnimatorKeep"})
    private final void startAnim() {
    }
}