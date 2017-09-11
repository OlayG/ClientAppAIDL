package com.example.admin.clientappaidl.view;

import com.example.admin.clientappaidl.BasePresenter;
import com.example.admin.clientappaidl.BaseView;

/**
 * Created by Admin on 9/11/2017.
 */

public interface MainActivityContract {

    interface view extends BaseView {

    }

    interface presenter extends BasePresenter<view>{

    }
}
