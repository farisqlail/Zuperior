package com.example.sicapin.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sicapin.HttpRequest.InitRetrofit;
import com.example.sicapin.HttpRequest.LoginRequest;
import com.example.sicapin.MenuBottomNav.BottomNav;
import com.example.sicapin.R;
import com.example.sicapin.Response.LoginResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {


    protected Button btnLogin;
    private TextView linkDaftar;
    EditText txtNama, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        linkDaftar = (TextView) findViewById(R.id.linkDaftar);
        txtNama = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(txtNama.getText().toString())  ||  TextUtils.isEmpty(txtPassword.getText().toString())) {

                    Toast.makeText(LoginActivity.this, "Pastikan semua terisi", Toast.LENGTH_SHORT).show();

                } else {
                            LoginRequest loginRequest = new LoginRequest();
                            loginRequest.setUsername(txtNama.getText().toString());
                    loginRequest.setPassword(txtPassword.getText().toString());
                    login(loginRequest);

                }
//                Intent intent = new Intent( LoginActivity.this, BottomNav.class);
//                startActivity(intent);

            }
        });

        linkDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));

            }
        });
//        noActionBar();
//        findViews();
//        klik();
//        input();

    }

    public void noActionBar(){

    }

    public void findViews() {



    }

    public void klik() {



    }

    public void login(LoginRequest loginRequest){

        Call<LoginResponse> loginResponseCall = (Call<LoginResponse>) InitRetrofit.getInstance().loginUser(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                if (response.isSuccessful()){
                    Toast.makeText(LoginActivity.this, "Berhasil masuk!", Toast.LENGTH_SHORT).show();
                    LoginResponse loginResponse = response.body();
                    String jsonData = response.body().toString();
                    JSONObject jsonObject = new JSONObject();
                    System.out.println(jsonData);

                    startActivity(new Intent(getApplicationContext(), BottomNav.class).putExtra("data", loginResponse.getUsername()));

                } else {
                    Toast.makeText(LoginActivity.this, "Gagal masuk!", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "Throwable"+t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}