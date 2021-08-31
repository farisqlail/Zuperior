package com.example.sicapin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.sicapin.Fragmen.onBoard1;
import com.example.sicapin.Fragmen.onBoard2;

public class onBoard extends AppCompatActivity {

    protected FragmentManager fragmentManager;
    protected FragmentTransaction fragmentTransaction;
    protected Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_on_board);

        findViews();

        listener();
    }

    public void initViews() {

    }

    public void findViews() {

        // Fv Button
        b1 = (Button) findViewById(R.id.btnOb1);

        // Fv FragmentMamager
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.container, new onBoard1());
        fragmentTransaction.commit();


    }

    public void listener() {

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.container, new onBoard2());
                fragmentTransaction.commit();

            }
        });

    }

}