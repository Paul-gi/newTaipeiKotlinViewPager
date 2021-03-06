// Generated by data binding compiler. Do not edit!
package com.example.newtaipeizookotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.newtaipeizookotlin.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DepartmentDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView mADistribution;

  @NonNull
  public final AppCompatTextView mArea;

  @NonNull
  public final AppCompatTextView mDistributionView;

  @NonNull
  public final AppCompatTextView mEInfo;

  @NonNull
  public final AppCompatTextView mEMemo;

  @NonNull
  public final AppCompatTextView mEName;

  @NonNull
  public final AppCompatTextView mInfoView;

  @NonNull
  public final AppCompatTextView mNameView;

  protected DepartmentDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView mADistribution, AppCompatTextView mArea,
      AppCompatTextView mDistributionView, AppCompatTextView mEInfo, AppCompatTextView mEMemo,
      AppCompatTextView mEName, AppCompatTextView mInfoView, AppCompatTextView mNameView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mADistribution = mADistribution;
    this.mArea = mArea;
    this.mDistributionView = mDistributionView;
    this.mEInfo = mEInfo;
    this.mEMemo = mEMemo;
    this.mEName = mEName;
    this.mInfoView = mInfoView;
    this.mNameView = mNameView;
  }

  @NonNull
  public static DepartmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.department_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DepartmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DepartmentDetailBinding>inflateInternal(inflater, R.layout.department_detail, root, attachToRoot, component);
  }

  @NonNull
  public static DepartmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.department_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DepartmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DepartmentDetailBinding>inflateInternal(inflater, R.layout.department_detail, null, false, component);
  }

  public static DepartmentDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static DepartmentDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (DepartmentDetailBinding)bind(component, view, R.layout.department_detail);
  }
}
