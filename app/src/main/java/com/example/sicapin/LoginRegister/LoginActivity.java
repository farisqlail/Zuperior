package com.example.sicapin.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sicapin.Fragmen.Home;
import com.example.sicapin.HttpRequest.ApiInterface;
import com.example.sicapin.HttpRequest.InitRetrofit;
import com.example.sicapin.HttpRequest.LoginRequest;
import com.example.sicapin.MenuBottomNav.BottomNav;
import com.example.sicapin.R;
import com.example.sicapin.Response.LoginResponse;
import com.example.sicapin.Response.RegisterResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {


    protected Button btnLogin;
    private TextView linkDaftar;
    private EditText txtUsername, txtPassword;

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

        btnLogin = (Button) findViewById(R.id.btnLogin);
        linkDaftar = (TextView) findViewById(R.id.linkDaftar);
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);

    }

    public void klik() {

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(txtUsername.getText().toString()) || TextUtils.isEmpty(txtPassword.getText().toString())){

                    String message = "Inputan harus lengkap";
                    Toast.makeText(LoginActivity.this, message,Toast.LENGTH_LONG).show();

                } else {

                    LoginRequest loginRequest = new LoginRequest();
                    loginRequest.setUsername(txtUsername.getText().toString());
                    loginRequest.setPassword(txtPassword.getText().toString());

                    loginUser(loginRequest);
                }

            }
        });

        linkDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));

            }
        });

    }

    private void loginUser(LoginRequest loginRequest) {
        Call<LoginResponse> loginResponseCall = (Call<LoginResponse>) InitRetrofit.getInstance().loginUser(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()){

                    LoginResponse loginResponse = response.body();
                    startActivity(new Intent(LoginActivity.this, Home.class).putExtra("data", loginResponse));
                    finish();

                } else {

                    String message = "Ada yang error";
                    Toast.makeText(LoginActivity.this, message,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

                String message = t.getLocalizedMessage();
                Toast.makeText(LoginActivity.this, message,Toast.LENGTH_LONG).show();
            }
        });
    }
}