// Generated by data binding compiler. Do not edit!
package com.example.newtaipeizookotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.newtaipeizookotlin.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class WebviewActivityBinding extends ViewDataBinding {
  @NonNull
  public final WebView mWebView;

  protected WebviewActivityBinding(Object _bindingComponent, View _root, int _localFieldCount,
      WebView mWebView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mWebView = mWebView;
  }

  @NonNull
  public static WebviewActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.webview_activity, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static WebviewActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<WebviewActivityBinding>inflateInternal(inflater, R.layout.webview_activity, root, attachToRoot, component);
  }

  @NonNull
  public static WebviewActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.webview_activity, null, false, component)
   */
  @NonNull
  @Deprecated
  public static WebviewActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<WebviewActivityBinding>inflateInternal(inflater, R.layout.webview_activity, null, false, component);
  }

  public static WebviewActivityBinding bind(@NonNull View view) {
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
  public static WebviewActivityBinding bind(@NonNull View view, @Nullable Object component) {
    return (WebviewActivityBinding)bind(component, view, R.layout.webview_activity);
  }
}