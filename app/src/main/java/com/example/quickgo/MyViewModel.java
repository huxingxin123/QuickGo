package com.example.quickgo;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyViewModel extends AndroidViewModel {
    public MyViewModel(@NonNull Application application) {
        super(application);
    }
    private MutableLiveData<String> myDate;

    public MutableLiveData<String> getMyDate() {
        if (myDate==null){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");

            Date curdate=new Date(System.currentTimeMillis());
            myDate=new MutableLiveData<>();
            myDate.setValue( format.format(curdate));
            Log.e("TAG",format.format(curdate));
        }
        return myDate;
    }

}
