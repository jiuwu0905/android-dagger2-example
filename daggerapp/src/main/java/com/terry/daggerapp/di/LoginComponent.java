package com.terry.daggerapp.di;

import com.terry.daggerapp.MainActivity;

import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent
public interface LoginComponent {

    @Subcomponent.Builder
    interface Factory{
        LoginComponent create();
    }

    void inject(MainActivity loginActivity);
}
