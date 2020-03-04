package com.example.mobileclass;

import android.util.Log;

public class Mythread extends Thread {
    @Override
    public void run() {
        Log.i(MainActivity.TAG ,"My thread ]]>>" +
                "pid : " + android.os.Process.myPid()  +
                "tid  : " + android.os.Process.myTid() +
                "id : " + Thread.currentThread().getId());
    }

}
