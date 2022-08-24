package com.terry.daggergradlemodule.di;


import com.terry.daggergradlemodule.MainActivity;

import dagger.Subcomponent;


@LoginActivityScope
@Subcomponent
public interface LoginComponent {


    @Subcomponent.Builder
    interface Factory{
        LoginComponent create();
    }

    void inject(MainActivity loginActivity);
}
