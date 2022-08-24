package com.terry.daggerapp.vm;

import com.terry.daggerapp.di.ActivityScope;
import com.terry.daggerapp.repository.UserRepository;

import javax.inject.Inject;

@ActivityScope
public class LoginViewModel {


    private final UserRepository userRepository;

    @Inject
    public LoginViewModel(UserRepository userRepository){
        this.userRepository = userRepository;
    }

}
