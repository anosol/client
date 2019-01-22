package com.developer.akashkale.client;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class AddUser extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        Intent it = getIntent();

        String b = it.getStringExtra(MainActivity.EXTRA_TEXT);
        String a = it.getStringExtra(MainActivity.EXTRA_NUMBER);


        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://sms.ascell.in/app/smsapi/index.php?key=35C459C005AB3A&routeid=240&type=text&contacts="+a+"&senderid=ASCELL&msg="+b);
        Toast.makeText(this, "http://sms.ascell.in/app/smsapi/index.php?key=35C459C005AB3A&routeid=240&type=text&contacts="+a+"&senderid=ASCELL&msg="+b, Toast.LENGTH_SHORT).show();
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
    }

