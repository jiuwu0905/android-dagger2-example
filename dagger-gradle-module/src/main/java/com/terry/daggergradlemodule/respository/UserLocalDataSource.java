package com.terry.daggergradlemodule.respository;

import javax.inject.Inject;

public class UserLocalDataSource {

    @Inject
    public UserLocalDataSource(){}


    public String getData(){
        return "I m from local!";
    }

}
