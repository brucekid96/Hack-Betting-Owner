package com.hackbettingowner;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class AllTips extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
  private TextView text;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.alltips);

    

    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    DrawerLayout drawer =  findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.addDrawerListener(toggle);
    toggle.syncState();

    NavigationView navigationView =
        findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);
  }

  @Override
  public void onBackPressed() {
    DrawerLayout drawer = (DrawerLayout)
        findViewById(R.id.drawer_layout);
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }

  @SuppressWarnings("StatementWithEmptyBody")
  @Override
  public boolean onNavigationItemSelected(MenuItem item) {
    // Handle navigation view item clicks here.
    Intent intent = null;
    int id = item.getItemId();

    if (id == R.id.nav_home) {
      // Handle the camera action
      startActivity(new Intent(AllTips.this, MainActivity.class));

    } else if (id == R.id.nav_all_tips) {
      startActivity(new Intent(AllTips.this, AllTips.class));

    } else if (id == R.id.nav_safe_tips) {
      startActivity(new Intent(AllTips.this, SafeTips.class));

    } else if (id == R.id.nav_single_tips) {
      startActivity(new Intent(AllTips.this, SingleTips.class));

    }
    else if (id == R.id.nav_combo_tips) {
      startActivity(new Intent(AllTips.this, ComboTips.class));

    }
    else if (id == R.id.nav_football_tips) {
      startActivity(new Intent(AllTips.this, FootballTips.class));

    }
    else if (id == R.id.nav_basketball_tips) {
      startActivity(new Intent(AllTips.this, BasketballTips.class));

    }
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }

}
