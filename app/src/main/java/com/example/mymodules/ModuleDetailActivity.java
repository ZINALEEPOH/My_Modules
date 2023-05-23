package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tv;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tv=findViewById(R.id.textView);
        btnBack=findViewById(R.id.buttonBack);

        String code=getIntent().getStringExtra("code");
        String name=getIntent().getStringExtra("name");
        int year=getIntent().getIntExtra("year", 0);
        int sem=getIntent().getIntExtra("sem",0);
        int cred=getIntent().getIntExtra("cred",0);
        String ven=getIntent().getStringExtra("ven");

        String output="Module Code: "+code+"\n" + "Module Name: "+name+"\n" + "Academic Year: "+year+"\n" + "Semester: "+sem+"\n" + "Module Credit: "+cred+"\n" + "Venue: "+ven;
        if(code.equals("C236")){
            tv.setText(output);
        }else if(code.equals("C239")){
            tv.setText(output);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}