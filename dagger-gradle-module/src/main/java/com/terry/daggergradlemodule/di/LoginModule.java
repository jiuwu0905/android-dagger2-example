package com.terry.daggergradlemodule.di;


import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@LoginActivityScope
@Module
public class LoginModule {




    @LoginActivityScope
    @Named("key1")
    @Provides
    public String provides(){
        return "LoginModule";
    }


}
