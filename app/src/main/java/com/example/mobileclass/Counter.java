package com.example.mobileclass;

import android.util.Log;
import android.widget.TextView;

public class Counter {
    static int count = 0 ;
    public void count(){
        for (int i  = 0 ;i<10000 ; i++){
            count++;
        }
    }
    public void safe(){
        synchronized (this){
            for (int i = 0 ; i<100 ; i++){
                MainActivity.COUNT++;
                print();
            }
        }
    }

    public void print(){
        Log.i(MainActivity.TAG  , "COUNT : " + MainActivity.COUNT);
    }

    public static int getCount() {
        return count;
    }
}
