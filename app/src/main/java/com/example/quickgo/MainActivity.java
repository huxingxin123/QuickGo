package com.example.quickgo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.quickgo.databinding.ActivityMain2Binding;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.go);
        button2=findViewById(R.id.back);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.go:
                Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
                break;
            case R.id.back:
                Intent intent1=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}