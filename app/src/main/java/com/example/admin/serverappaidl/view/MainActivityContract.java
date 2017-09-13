package com.example.admin.serverappaidl.view;

import com.example.admin.serverappaidl.BasePresenter;
import com.example.admin.serverappaidl.BaseView;

/**
 * Created by Admin on 9/11/2017.
 */

public interface MainActivityContract {

    interface view extends BaseView {

    }

    interface presenter extends BasePresenter<view>{

    }
}
