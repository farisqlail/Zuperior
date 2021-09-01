package com.example.sicapin.MenuBottomNav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.example.sicapin.Fragmen.BacaArtikel;
import com.example.sicapin.Fragmen.Home;
import com.example.sicapin.Fragmen.MenuKamera;
import com.example.sicapin.Fragmen.menu_quiz;
import com.example.sicapin.Fragmen.onBoard1;
import com.example.sicapin.Fragmen.onBoard2;
import com.example.sicapin.Fragmen.onBoard3;
import com.example.sicapin.Fragmen.profile;
import com.example.sicapin.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNav extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    protected Fragment fragment = null;
    protected FragmentTransaction fragmentTransaction;
    protected FragmentManager fragmentManager;
    protected long back;
    protected BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bot);

        noActionBar();

        findViews();

        firstLayout();


    }

    public void noActionBar(){
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void firstLayout() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mainBotNav, new Home());
        fragmentTransaction.commit();
    }

    public void findViews() {

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navBot);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.mberanda:
                fragment = new Home();
                break;
            case R.id.martikel:
                fragment = new BacaArtikel();
                break;
            case R.id.mkamera:
                fragment = new MenuKamera() ;
                break;
            case R.id.mquiz:
                fragment = new menu_quiz() ;
                break;
            case R.id.mprofile:
                fragment = new profile();
                break;
        }

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainBotNav, fragment)
                .commit();

        return true;
    }
}