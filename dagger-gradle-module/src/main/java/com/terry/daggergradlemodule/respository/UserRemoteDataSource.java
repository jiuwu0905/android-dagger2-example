package com.terry.daggergradlemodule.respository;

import com.terry.daggergradlemodule.net.LoginRetrofitService;

import javax.inject.Inject;

public class UserRemoteDataSource {
    private final LoginRetrofitService loginRetrofitService;

    @Inject
    public UserRemoteDataSource(LoginRetrofitService loginRetrofitService) {
        this.loginRetrofitService = loginRetrofitService;
    }

    public String getData() {
        return "I m from remote";
    }
}
