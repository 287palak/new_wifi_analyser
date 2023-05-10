// Generated by view binder compiler. Do not edit!
package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.navigation.NavigationView;
import com.vrem.wifianalyzer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainActivityBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final NavigationView navDrawer;

  private MainActivityBinding(@NonNull DrawerLayout rootView, @NonNull DrawerLayout drawerLayout,
      @NonNull NavigationView navDrawer) {
    this.rootView = rootView;
    this.drawerLayout = drawerLayout;
    this.navDrawer = navDrawer;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.nav_drawer;
      NavigationView navDrawer = ViewBindings.findChildViewById(rootView, id);
      if (navDrawer == null) {
        break missingId;
      }

      return new MainActivityBinding((DrawerLayout) rootView, drawerLayout, navDrawer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}