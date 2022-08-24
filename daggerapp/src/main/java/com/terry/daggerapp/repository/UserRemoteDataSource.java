package com.terry.daggerapp.repository;

import com.terry.daggerapp.net.LoginRetrofitService;

import javax.inject.Inject;

public class UserRemoteDataSource {
    private final LoginRetrofitService loginRetrofitService;

    @Inject
    public UserRemoteDataSource(LoginRetrofitService loginRetrofitService) {
        this.loginRetrofitService = loginRetrofitService;
    }

}
