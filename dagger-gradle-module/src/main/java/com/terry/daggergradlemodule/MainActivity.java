package com.terry.daggergradlemodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.terry.daggergradlemodule.di.LoginComponent;
import com.terry.daggergradlemodule.di.LoginComponentProvider;
import com.terry.daggergradlemodule.vm.LoginViewModel;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {



    @Inject
    LoginViewModel loginViewModel;


    LoginComponent loginComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        loginComponent = ((LoginComponentProvider) getApplication()).provideLoginComponent();

        loginComponent.inject(this);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((TextView) findViewById(R.id.tv1)).setText(loginViewModel.getData());
    }
}