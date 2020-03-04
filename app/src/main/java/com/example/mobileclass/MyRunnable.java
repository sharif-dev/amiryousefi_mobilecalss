package com.example.mobileclass;

import android.util.Log;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        Log.i(MainActivity.TAG ,"My thread from Runnable ]]>>" +
                "pid : " + android.os.Process.myPid()  +
                "tid  : " + android.os.Process.myTid() +
                "id : " + Thread.currentThread().getId());
    }
}
