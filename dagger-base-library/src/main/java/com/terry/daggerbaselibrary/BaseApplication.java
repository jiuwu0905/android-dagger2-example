package com.terry.daggerbaselibrary;

import android.app.Application;

import com.terry.daggerbaselibrary.di.ApplicationComponent;
import com.terry.daggerbaselibrary.di.DaggerApplicationComponent;
import com.terry.daggerbaselibrary.net.NetworkModule;

public class BaseApplication extends Application {

    public ApplicationComponent applicationComponent = DaggerApplicationComponent.builder()
           // .networkModule(new NetworkModule())
            .build();


    @Override
    public void onCreate() {
        super.onCreate();



    }
}
