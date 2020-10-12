package com.application.tutorial;


   import android.support.annotation.NonNull; 
   import android.support.design.widget.NavigationView; 
   import android.support.v4.view.GravityCompat; 
   import android.support.v4.widget.DrawerLayout; 
   import android.support.v7.app.ActionBarDrawerToggle; 
   import android.support.v7.app.AppCompatActivity; 
   import android.os.Bundle; 
   import android.support.v7.widget.Toolbar;  
   import android.view.MenuItem; 
   import android.widget.Toast; 
   
  public class ExampleNavigationDrawer extends AppCompatActivity implements  
          NavigationView.OnNavigationItemSelectedListener{ 
   
      Toolbar toolbar; 
      DrawerLayout drawerLayout; 
      NavigationView navigationView; 
   
      @Override 
      protected void onCreate(Bundle savedInstanceState) { 
          super.onCreate(savedInstanceState); 
          setContentView(R.layout.example_navigation_drawer); 
   
          toolbar = findViewById(R.id.tool_Bar); 
          setSupportActionBar(toolbar); 
   
          drawerLayout = findViewById(R.id.drawerlayout); 
          ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar, 
                  R.string.opne, R.string.close); 
   
          drawerLayout.addDrawerListener(toggle); 
          toggle.syncState(); 
             navigationView = findViewById(R.id.navigation_view); 
            navigationView.setNavigationItemSelectedListener(this); 
   
      } 
   
      @Override 
      public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) { 
          switch (menuItem.getItemId()){ 
              case R.id.navi_android: 
                  Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show(); 
                  break; 
              case R.id.navi_rate: 
                  Toast.makeText(this, "Rate us", Toast.LENGTH_SHORT).show(); 
                  break; 
              case R.id.navi_feedback: 
                  Toast.makeText(this, "give me feedback", Toast.LENGTH_SHORT).show(); 
                  break; 
              case R.id.navi_share: 
                  Toast.makeText(this, "share the aap", Toast.LENGTH_SHORT).show(); 
                  break; 
              case R.id.navi_send: 
                  Toast.makeText(this, "Send the link", Toast.LENGTH_SHORT).show(); 
                  break; 
          } 
          drawerLayout.closeDrawer(GravityCompat.START); 
          return true; 
      } 
  } 
   

