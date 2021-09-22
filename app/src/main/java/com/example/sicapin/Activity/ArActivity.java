package com.example.sicapin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.sicapin.R;

public class ArActivity extends AppCompatActivity {

    WebView webView;
    WebSettings webSettings;
    String MODEL_URL="https://sketchfab.com/models/e6ebe6a6c57f441187bcca8e9e14b011/embed?autospin=1&autostart=1&preload=1&ui_theme=dark";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ar);

        WebView myWebView = (WebView) findViewById(R.id.arView);
        webSettings = myWebView.getSettings();

        myWebView.loadUrl(MODEL_URL);
        webSettings.setJavaScriptEnabled(true);
    }
}