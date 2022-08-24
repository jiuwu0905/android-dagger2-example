package com.terry.daggerapp.di;

import com.terry.daggerapp.MainActivity;
import com.terry.daggerapp.net.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class,LoginComponentModule.class})
public interface ApplicationComponent {


    LoginComponent.Factory loginComponent();


}
