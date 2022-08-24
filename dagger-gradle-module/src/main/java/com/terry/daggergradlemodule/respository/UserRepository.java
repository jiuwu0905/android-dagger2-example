package com.terry.daggergradlemodule.respository;

import com.terry.daggergradlemodule.di.LoginActivityScope;

import javax.inject.Inject;

@LoginActivityScope
public class UserRepository {

    private final UserLocalDataSource localDataSource;
    private final UserRemoteDataSource remoteDataSource;

    @Inject
    public UserRepository(UserLocalDataSource localDataSource, UserRemoteDataSource remoteDataSource){

        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }


    public String getLocalString(){
        return localDataSource.getData();
    }

    public String getRemoteString(){
        return remoteDataSource.getData();
    }


}
