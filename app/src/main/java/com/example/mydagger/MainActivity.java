package com.example.mydagger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {

    private static final String TAG = "MainActivity";

    @Inject
    public DispatchingAndroidInjector<Fragment> injector;
    
    @Inject
    public Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: " + student.getName());
        
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return injector;
    }
}
