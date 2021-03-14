package com.example.quickgo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.quickgo.databinding.ActivityMain2Binding;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    MyViewModel myViewModel ;

    ActivityMain2Binding binding2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        binding2= DataBindingUtil.setContentView(this,R.layout.activity_main2);
        myViewModel  = new ViewModelProvider(this).get(MyViewModel.class);
        binding2.setData(myViewModel);
        binding2.setLifecycleOwner(this);
    }
}