package com.terry.daggerapp.net;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;



@Module
public class NetworkModule {

    @Singleton
    @Provides
    public LoginRetrofitService provideLoginRetrofitService(){
        return new LoginRetrofitService() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
    }

}
