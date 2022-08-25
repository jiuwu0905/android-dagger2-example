package com.terry.daggergradlemodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.terry.daggerbaselibrary.BaseApplication;
import com.terry.daggerbaselibrary.LoginComponentProvider;
import com.terry.daggerbaselibrary.di.ApplicationComponent;
import com.terry.daggergradlemodule.di.DaggerLoginComponent;
import com.terry.daggergradlemodule.di.LoginComponent;
import com.terry.daggergradlemodule.vm.LoginViewModel;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {



    @Inject
    LoginViewModel loginViewModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ApplicationComponent applicationComponent = ((BaseApplication) getApplication()).applicationComponent;


        LoginComponent loginComponent = DaggerLoginComponent.builder().applicationComponent(applicationComponent).build();

        loginComponent.inject(this);
        // loginComponent =  ((BaseApplication) getApplication()).applicationComponent





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((TextView) findViewById(R.id.tv1)).setText(loginViewModel.getData());
    }
}