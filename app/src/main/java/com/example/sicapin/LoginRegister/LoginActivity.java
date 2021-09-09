package com.example.sicapin.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sicapin.MenuBottomNav.BottomNav;
import com.example.sicapin.R;

public class LoginActivity extends AppCompatActivity {


    protected Button btnLogin;
    private TextView linkDaftar;
    private EditText txtNama, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        noActionBar();
        findViews();
        klik();
        input();

    }

    public void noActionBar(){
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void findViews() {

        btnLogin = (Button) findViewById(R.id.btnLogin);
        linkDaftar = (TextView) findViewById(R.id.linkDaftar);
        txtNama = (EditText) findViewById(R.id.txtNama);
        txtPassword = (EditText) findViewById(R.id.txtPassword);

    }

    public void klik() {

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( LoginActivity.this, BottomNav.class);
                startActivity(intent);

            }
        });

        linkDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));

            }
        });

    }

    private void input() {

    }
}