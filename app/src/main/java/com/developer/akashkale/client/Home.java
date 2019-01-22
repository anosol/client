package com.developer.akashkale.client;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity implements View.OnClickListener {
    Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bt1 = findViewById(R.id.btMessage);
        bt2 = findViewById(R.id.btEmail);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btMessage:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btEmail:
                Intent intent2 = new Intent(this, Email.class);
                startActivity(intent2);
                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
