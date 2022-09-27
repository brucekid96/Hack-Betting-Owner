package com.hackbettingowner;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.hackbettingowner.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
  private TextView text;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    text = findViewById(R.id.home_text);

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
      Toast.makeText(getApplicationContext(),"home",Toast.LENGTH_LONG).show();

    } else if (id == R.id.nav_all_tips) {
      startActivity(new Intent(MainActivity.this, AllTips.class));

    } else if (id == R.id.nav_safe_tips) {
      startActivity(new Intent(MainActivity.this, SafeTips.class));


    }  else if (id == R.id.nav_single_tips) {
      startActivity(new Intent(MainActivity.this, SingleTips.class));

    }  else if (id == R.id.nav_combo_tips) {
      startActivity(new Intent(MainActivity.this, ComboTips.class));

    }  else if (id == R.id.nav_football_tips) {
      startActivity(new Intent(MainActivity.this, FootballTips.class));

    }  else if (id == R.id.nav_basketball_tips) {
      startActivity(new Intent(MainActivity.this, BasketballTips.class));


    }

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }

//  @Override
//  public boolean onCreateOptionsMenu(Menu menu) {
//    // Inflate the menu; this adds items to the action bar if it is present.
//    getMenuInflater().inflate(R.menu.main, menu);
//    return true;
//  }
//
//  @Override
//  public boolean onSupportNavigateUp() {
//    NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//    return NavigationUI.navigateUp(navController, mAppBarConfiguration)
//        || super.onSupportNavigateUp();
//  }
}