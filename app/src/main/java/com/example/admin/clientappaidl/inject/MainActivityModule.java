package com.example.admin.clientappaidl.inject;

import com.example.admin.clientappaidl.view.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 9/11/2017.
 */
@Module
class MainActivityModule {

    @Provides
    MainActivityPresenter providesMainActivityPresenter(){
        return new MainActivityPresenter();
    }
}
