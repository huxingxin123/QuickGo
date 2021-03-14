package com.example.quickgo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.quickgo.databinding.ActivityMain2Binding;
import com.example.quickgo.databinding.ActivityMain3Binding;
import com.example.quickgo.databinding.ActivityMain3BindingImpl;

public class MainActivity3 extends AppCompatActivity {

    MyViewModel myViewModel ;

    ActivityMain3Binding binding3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        binding3= DataBindingUtil.setContentView(this,R.layout.activity_main3);
        myViewModel  = new ViewModelProvider(this).get(MyViewModel.class);
        binding3.setData(myViewModel);
        binding3.setLifecycleOwner(this);
    }
}