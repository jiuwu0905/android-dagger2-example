package com.terry.daggerbaselibrary.di;

import com.terry.daggerbaselibrary.net.LoginRetrofitService;
import com.terry.daggerbaselibrary.net.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = NetworkModule.class)
public interface ApplicationComponent {



    @Component.Builder
    interface Factory{
        ApplicationComponent build();

    }


    LoginRetrofitService getLoginRetrofitService();


}
