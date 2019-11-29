package com.example.mydagger.dagger;

import android.app.Application;

import com.example.mydagger.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class, //use has support
//        AppModule::class,
                MainActivityModule.class

        }
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

//        @BindsInstance
//        fun info(url: String): Builder

        AppComponent build();
    }

    void inject( App app);
}