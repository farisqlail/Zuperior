package com.example.sicapin.MenuBottomNav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.sicapin.Fragmen.BacaArtikel;
import com.example.sicapin.Fragmen.Home;
import com.example.sicapin.Fragmen.MenuKamera;
import com.example.sicapin.Fragmen.menu_quiz;
import com.example.sicapin.Fragmen.onBoard1;
import com.example.sicapin.Fragmen.onBoard2;
import com.example.sicapin.Fragmen.onBoard3;
import com.example.sicapin.Fragmen.profile;
import com.example.sicapin.LoginRegister.LoginActivity;
import com.example.sicapin.R;
import com.example.sicapin.Response.LoginResponse;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Optional;

public class BottomNav extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    protected Fragment fragment = null;
    protected FragmentTransaction fragmentTransaction;
    protected FragmentManager fragmentManager;
    protected long back;
    protected BottomNavigationView bottomNavigationView;

    protected TextView username;
    LoginResponse loginResponse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bot);

        noActionBar();

        findViews();

        firstLayout();

//        username = (TextView) findViewById(R.id.dataUsername);
//
//        Intent intent = getIntent();
//        Bundle bundle = intent.getExtras();
//
//        if (intent.getExtras() != null){
////            System.out.println(bundle.getSerializable("username"));
//            username.setText("haha");
////            LoginActivity loginActivity = (LoginActivity) intent.getSerializableExtra("username");
////            System.out.println(loginActivity);
////            Log.e("TAG", loginResponse.getUsername());
////            username.setText(loginResponse.getUsername());
//        }


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