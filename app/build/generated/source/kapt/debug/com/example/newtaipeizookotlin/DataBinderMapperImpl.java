package com.example.newtaipeizookotlin;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.newtaipeizookotlin.databinding.ActivityMainBindingImpl;
import com.example.newtaipeizookotlin.databinding.AllAreaNavigationBindingImpl;
import com.example.newtaipeizookotlin.databinding.AnimalDetailBindingImpl;
import com.example.newtaipeizookotlin.databinding.DepartmentDetailBindingImpl;
import com.example.newtaipeizookotlin.databinding.DepartmentSelectpageFragmentBindingImpl;
import com.example.newtaipeizookotlin.databinding.DetailBelowPartBindingImpl;
import com.example.newtaipeizookotlin.databinding.ExpanditemBindingImpl;
import com.example.newtaipeizookotlin.databinding.ExpandrecyclewBindingImpl;
import com.example.newtaipeizookotlin.databinding.GoogleMapFragmentBindingImpl;
import com.example.newtaipeizookotlin.databinding.HomeFragmentBindingImpl;
import com.example.newtaipeizookotlin.databinding.ListPageFragmentBindingImpl;
import com.example.newtaipeizookotlin.databinding.ListviewpagerBindingImpl;
import com.example.newtaipeizookotlin.databinding.MainDetailFragmentBindingImpl;
import com.example.newtaipeizookotlin.databinding.PlantDetailBindingImpl;
import com.example.newtaipeizookotlin.databinding.ToolbarLayoutBindingImpl;
import com.example.newtaipeizookotlin.databinding.WebviewActivityBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ALLAREANAVIGATION = 2;

  private static final int LAYOUT_ANIMALDETAIL = 3;

  private static final int LAYOUT_DEPARTMENTDETAIL = 4;

  private static final int LAYOUT_DEPARTMENTSELECTPAGEFRAGMENT = 5;

  private static final int LAYOUT_DETAILBELOWPART = 6;

  private static final int LAYOUT_EXPANDITEM = 7;

  private static final int LAYOUT_EXPANDRECYCLEW = 8;

  private static final int LAYOUT_GOOGLEMAPFRAGMENT = 9;

  private static final int LAYOUT_HOMEFRAGMENT = 10;

  private static final int LAYOUT_LISTPAGEFRAGMENT = 11;

  private static final int LAYOUT_LISTVIEWPAGER = 12;

  private static final int LAYOUT_MAINDETAILFRAGMENT = 13;

  private static final int LAYOUT_PLANTDETAIL = 14;

  private static final int LAYOUT_TOOLBARLAYOUT = 15;

  private static final int LAYOUT_WEBVIEWACTIVITY = 16;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(16);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.all_area_navigation, LAYOUT_ALLAREANAVIGATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.animal_detail, LAYOUT_ANIMALDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.department_detail, LAYOUT_DEPARTMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.department_selectpage_fragment, LAYOUT_DEPARTMENTSELECTPAGEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.detail_below_part, LAYOUT_DETAILBELOWPART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.expanditem, LAYOUT_EXPANDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.expandrecyclew, LAYOUT_EXPANDRECYCLEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.google_map_fragment, LAYOUT_GOOGLEMAPFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.home_fragment, LAYOUT_HOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.list_page_fragment, LAYOUT_LISTPAGEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.listviewpager, LAYOUT_LISTVIEWPAGER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.main_detail_fragment, LAYOUT_MAINDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.plant_detail, LAYOUT_PLANTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.toolbar_layout, LAYOUT_TOOLBARLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.newtaipeizookotlin.R.layout.webview_activity, LAYOUT_WEBVIEWACTIVITY);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ALLAREANAVIGATION: {
          if ("layout/all_area_navigation_0".equals(tag)) {
            return new AllAreaNavigationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for all_area_navigation is invalid. Received: " + tag);
        }
        case  LAYOUT_ANIMALDETAIL: {
          if ("layout/animal_detail_0".equals(tag)) {
            return new AnimalDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for animal_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_DEPARTMENTDETAIL: {
          if ("layout/department_detail_0".equals(tag)) {
            return new DepartmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for department_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_DEPARTMENTSELECTPAGEFRAGMENT: {
          if ("layout/department_selectpage_fragment_0".equals(tag)) {
            return new DepartmentSelectpageFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for department_selectpage_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DETAILBELOWPART: {
          if ("layout/detail_below_part_0".equals(tag)) {
            return new DetailBelowPartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for detail_below_part is invalid. Received: " + tag);
        }
        case  LAYOUT_EXPANDITEM: {
          if ("layout/expanditem_0".equals(tag)) {
            return new ExpanditemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for expanditem is invalid. Received: " + tag);
        }
        case  LAYOUT_EXPANDRECYCLEW: {
          if ("layout/expandrecyclew_0".equals(tag)) {
            return new ExpandrecyclewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for expandrecyclew is invalid. Received: " + tag);
        }
        case  LAYOUT_GOOGLEMAPFRAGMENT: {
          if ("layout/google_map_fragment_0".equals(tag)) {
            return new GoogleMapFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for google_map_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEFRAGMENT: {
          if ("layout/home_fragment_0".equals(tag)) {
            return new HomeFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTPAGEFRAGMENT: {
          if ("layout/list_page_fragment_0".equals(tag)) {
            return new ListPageFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_page_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWPAGER: {
          if ("layout/listviewpager_0".equals(tag)) {
            return new ListviewpagerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listviewpager is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINDETAILFRAGMENT: {
          if ("layout/main_detail_fragment_0".equals(tag)) {
            return new MainDetailFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_detail_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_PLANTDETAIL: {
          if ("layout/plant_detail_0".equals(tag)) {
            return new PlantDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for plant_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_TOOLBARLAYOUT: {
          if ("layout/toolbar_layout_0".equals(tag)) {
            return new ToolbarLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for toolbar_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_WEBVIEWACTIVITY: {
          if ("layout/webview_activity_0".equals(tag)) {
            return new WebviewActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for webview_activity is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(16);

    static {
      sKeys.put("layout/activity_main_0", com.example.newtaipeizookotlin.R.layout.activity_main);
      sKeys.put("layout/all_area_navigation_0", com.example.newtaipeizookotlin.R.layout.all_area_navigation);
      sKeys.put("layout/animal_detail_0", com.example.newtaipeizookotlin.R.layout.animal_detail);
      sKeys.put("layout/department_detail_0", com.example.newtaipeizookotlin.R.layout.department_detail);
      sKeys.put("layout/department_selectpage_fragment_0", com.example.newtaipeizookotlin.R.layout.department_selectpage_fragment);
      sKeys.put("layout/detail_below_part_0", com.example.newtaipeizookotlin.R.layout.detail_below_part);
      sKeys.put("layout/expanditem_0", com.example.newtaipeizookotlin.R.layout.expanditem);
      sKeys.put("layout/expandrecyclew_0", com.example.newtaipeizookotlin.R.layout.expandrecyclew);
      sKeys.put("layout/google_map_fragment_0", com.example.newtaipeizookotlin.R.layout.google_map_fragment);
      sKeys.put("layout/home_fragment_0", com.example.newtaipeizookotlin.R.layout.home_fragment);
      sKeys.put("layout/list_page_fragment_0", com.example.newtaipeizookotlin.R.layout.list_page_fragment);
      sKeys.put("layout/listviewpager_0", com.example.newtaipeizookotlin.R.layout.listviewpager);
      sKeys.put("layout/main_detail_fragment_0", com.example.newtaipeizookotlin.R.layout.main_detail_fragment);
      sKeys.put("layout/plant_detail_0", com.example.newtaipeizookotlin.R.layout.plant_detail);
      sKeys.put("layout/toolbar_layout_0", com.example.newtaipeizookotlin.R.layout.toolbar_layout);
      sKeys.put("layout/webview_activity_0", com.example.newtaipeizookotlin.R.layout.webview_activity);
    }
  }
}
