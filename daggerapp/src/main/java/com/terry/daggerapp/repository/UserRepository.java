package com.terry.daggerapp.repository;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UserRepository {

    private final UserLocalDataSource localDataSource;
    private final UserRemoteDataSource remoteDataSource;

    @Inject
    public UserRepository(UserLocalDataSource localDataSource, UserRemoteDataSource remoteDataSource){

        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }


}
