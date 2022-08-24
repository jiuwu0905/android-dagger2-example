package com.terry.daggergradlemodule.vm;


import com.terry.daggergradlemodule.di.LoginActivityScope;
import com.terry.daggergradlemodule.respository.UserRepository;

import javax.inject.Inject;

@LoginActivityScope
public class LoginViewModel {


    private final UserRepository userRepository;

    @Inject
    public LoginViewModel(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public String getData(){
        return userRepository.getLocalString() +"---" + userRepository.getRemoteString();
    }


}
