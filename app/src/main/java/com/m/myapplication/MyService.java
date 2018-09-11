package com.m.myapplication;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends IntentService {

    public MyService(String name) {
        super(name);
    }

//    public MyService(String name) {
//        super(name);
//
//        Log.e("MyService", "MyService");
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.e("onDestroy", "onDestroy");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.


        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {


    }
}
