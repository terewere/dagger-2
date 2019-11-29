package com.example.mydagger;

import android.app.Activity;
import android.app.Application;

import androidx.fragment.app.Fragment;

import com.example.mydagger.dagger.AppInjector;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector {

    @Inject
    public DispatchingAndroidInjector<Activity> injector;
    @Override
    public void onCreate() {
        super.onCreate();

        AppInjector.init(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return injector;
    }
}
