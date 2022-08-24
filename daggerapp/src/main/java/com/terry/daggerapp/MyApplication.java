package com.terry.daggerapp;

import android.app.Application;

import com.terry.daggerapp.di.ApplicationComponent;
import com.terry.daggerapp.di.DaggerApplicationComponent;

public class MyApplication extends Application {

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    final ApplicationComponent applicationComponent = DaggerApplicationComponent.create();


    @Override
    public void onCreate() {
        super.onCreate();


    }


}
