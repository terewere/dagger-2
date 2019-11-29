package com.example.mydagger.dagger;

import com.example.mydagger.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = { })
    abstract MainActivity contributeMainActivity();
}
