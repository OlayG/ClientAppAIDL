package com.example.admin.clientappaidl.inject;

import com.example.admin.clientappaidl.MainActivity;

import dagger.Component;

/**
 * Created by Admin on 9/11/2017.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
