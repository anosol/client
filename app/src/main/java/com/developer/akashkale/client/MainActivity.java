package com.developer.akashkale.client;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_TEXT = "com.developer.akashkale.client.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.developer.akashkale.client.EXTRA_NUMBER";
    EditText ed1,ed2;
    final Context context = this;
    Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      ed1 = findViewById(R.id.etContact);
      ed2 = findViewById(R.id.etMessage);
      bt1 = findViewById(R.id.btSubmit);

       bt1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String a = ed1.getText().toString();
        String b = ed2.getText().toString();
        Intent it = new Intent(MainActivity.this,AddUser.class);
        it.putExtra(EXTRA_NUMBER,a);
        it.putExtra(EXTRA_TEXT,b);
        startActivity(it);



    }


}
