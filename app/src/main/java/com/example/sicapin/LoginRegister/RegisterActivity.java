package com.example.sicapin.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sicapin.Fragmen.Home;
import com.example.sicapin.MainActivity;
import com.example.sicapin.R;
import com.example.sicapin.Response.RegisterResponse;

public class RegisterActivity extends AppCompatActivity {

    private Button btnRegister;
    private EditText txtNama, txtPassword, txtEmail, txtKelas, txtUsername;
    private TextView linkMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtNama = (EditText) findViewById(R.id.txtNama);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtKelas = (EditText) findViewById(R.id.txtKelas);
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        linkMasuk = (TextView) findViewById(R.id.linkMasuk);

        linkMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), LoginActivity.class));

            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(txtNama.getText().toString())  ||  TextUtils.isEmpty(txtKelas.getText().toString())) {

                    String message = "Inputan harus diisi semua";
                    Toast.makeText(RegisterActivity.this, message,Toast.LENGTH_LONG).show();

                } else {

                    RegisterRequest registerRequest = new RegisterRequest();
                    registerRequest.setFull_name(txtNama.getText().toString());
                    registerRequest.setUsername(txtUsername.getText().toString());
                    registerRequest.setEmail(txtEmail.getText().toString());
                    registerRequest.setUser_class(txtKelas.getText().toString());
                    registerRequest.setPassword(txtPassword.getText().toString());
                    registerUser(registerRequest);
                }

            }
        });


    }

}