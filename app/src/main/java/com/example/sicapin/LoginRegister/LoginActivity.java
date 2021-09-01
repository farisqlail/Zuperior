package com.example.sicapin.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.sicapin.MenuBottomNav.BottomNav;
import com.example.sicapin.R;

public class LoginActivity extends AppCompatActivity {

    protected Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        noActionBar();
        findViews();
        klik();

    }

    public void noActionBar(){
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void findViews() {

        button = (Button) findViewById(R.id.btnlogin);

    }

    public void klik() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( LoginActivity.this, BottomNav.class);
                startActivity(intent);

            }
        });

    }
}