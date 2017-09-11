package com.example.admin.clientappaidl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.clientappaidl.inject.DaggerMainActivityComponent;
import com.example.admin.clientappaidl.view.MainActivityPresenter;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.create().inject(this);
    }


    ServiceConnection serviceConnection =  new ServiceConnection() {

        private IEventbrite iEventbrite;

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder service) {
            iEventbrite = IEventbrite.Stub.asInterface(service);
            try {
                List<Event> events = iEventbrite.getEvents();

            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            unbindService(serviceConnection);
        }
    };
}
