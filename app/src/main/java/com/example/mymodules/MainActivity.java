package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAP, tvIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAP=findViewById(R.id.textViewAP);
        tvIP=findViewById(R.id.textViewIP);

        tvAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C236");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("ven", "W66M");
                startActivity(intent);
            }
        });

        tvIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C239");
                intent.putExtra("name", "iPad Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("sem", 1);
                intent.putExtra("cred",3);
                intent.putExtra("ven", "E36A");
                startActivity(intent);

            }
        });
    }
}