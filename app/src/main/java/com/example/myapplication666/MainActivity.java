package com.example.myapplication666;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home , R.id.navigation_profile, R.id.navigation_setting
        ).build();
        NavController navController = Navigation.findNavController(this, R.id.my_main_fragment);
        NavigationUI.setupActionBarWithNavController(this , navController , appBarConfiguration);
        NavigationUI.setupWithNavController( bottomNavigationView , navController);
    }
}