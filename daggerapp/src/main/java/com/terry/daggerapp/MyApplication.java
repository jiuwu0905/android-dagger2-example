package com.terry.daggerapp;

import android.app.Application;

import com.terry.daggerapp.di.ApplicationComponent;
import com.terry.daggerapp.di.DaggerApplicationComponent;
import com.terry.daggergradlemodule.di.LoginComponent;
import com.terry.daggergradlemodule.di.LoginComponentProvider;

public class MyApplication extends Application implements LoginComponentProvider {

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    final ApplicationComponent applicationComponent = DaggerApplicationComponent.create();


    @Override
    public void onCreate() {
        super.onCreate();


    }


    @Override
    public LoginComponent provideLoginComponent() {
        return applicationComponent.loginComponent().create();
    }
}
