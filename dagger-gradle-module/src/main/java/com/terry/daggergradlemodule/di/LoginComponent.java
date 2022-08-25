package com.terry.daggergradlemodule.di;


import com.terry.daggerbaselibrary.di.ApplicationComponent;
import com.terry.daggerbaselibrary.net.LoginRetrofitService;
import com.terry.daggerbaselibrary.net.NetworkModule;
import com.terry.daggergradlemodule.MainActivity;

import dagger.Component;
import dagger.Subcomponent;


@LoginActivityScope
@Component(dependencies = ApplicationComponent.class)
public interface LoginComponent {




    @Component.Builder
    interface LoginComponentFactory{

        LoginComponent build();

        LoginComponentFactory applicationComponent(ApplicationComponent applicationComponent);

    }


    void inject(MainActivity loginActivity);

}
