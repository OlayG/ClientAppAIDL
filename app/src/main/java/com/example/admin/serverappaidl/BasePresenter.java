package com.example.admin.serverappaidl;

/**
 * Created by Admin on 9/11/2017.
 */

public interface BasePresenter<V extends BaseView>{

    void attachView(V view);
    void detachView();
}
