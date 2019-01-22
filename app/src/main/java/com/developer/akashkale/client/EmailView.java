package com.developer.akashkale.client;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class EmailView extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_view);
        Intent it = getIntent();

        String b = it.getStringExtra(MainActivity.EXTRA_TEXT);
        String a = it.getStringExtra(MainActivity.EXTRA_NUMBER);


        webView = findViewById(R.id.webViewE);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://ascellent.co.in/email/emailSender.php?senderEmail=Ajay@ascellent.co.in&receiverEmail="+a+"&subject=testSubject&msg="+b);
        Toast.makeText(this, "http://ascellent.co.in/email/emailSender.php?senderEmail=Ajay@ascellent.co.in&receiverEmail="+a+"&subject=testSubject&msg="+b, Toast.LENGTH_SHORT).show();
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
