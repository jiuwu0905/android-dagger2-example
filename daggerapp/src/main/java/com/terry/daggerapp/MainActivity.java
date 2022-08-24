package com.terry.daggerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.terry.daggerapp.di.LoginComponent;
import com.terry.daggerapp.vm.LoginViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    LoginViewModel loginViewModel;

    LoginComponent loginComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        loginComponent = ((MyApplication) getApplication()).applicationComponent
                .loginComponent().create();
        loginComponent.inject(this);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}