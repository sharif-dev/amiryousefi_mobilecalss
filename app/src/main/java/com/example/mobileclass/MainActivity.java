package com.example.mobileclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {
    //todo : executors test !!!

    public static final String TAG = "THREAD CREATED!!!!!";
    public static int COUNT = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn_toast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this ,"salam amir",  Toast.LENGTH_LONG).show();
            }
        });
        //ThreadSubclass();
        //ThreadRunnable();
        ThreadSynchrinize();

    }

    void ThreadSubclass() {
        Log.i(MainActivity.TAG, "subclass thread  ]]>> " +
                "pid : " + android.os.Process.myPid() +
                "tid  : " + android.os.Process.myTid() +
                "id : " + Thread.currentThread().getId());
        Mythread mythread = new Mythread();
        mythread.start();
        Log.i(MainActivity.TAG, "subclass thread  ]]>> " +
                "pid : " + android.os.Process.myPid() +
                "tid  : " + android.os.Process.myTid() +
                "id : " + Thread.currentThread().getId());


    }

    void ThreadRunnable() {
        Log.i(MainActivity.TAG, "subclass thread  ]]>> " +
                "pid : " + android.os.Process.myPid() +
                "tid  : " + android.os.Process.myTid() +
                "id : " + Thread.currentThread().getId());
        MyRunnable runnable = new MyRunnable();
        runnable.run();
        Log.i(MainActivity.TAG, "subclass thread  ]]>> " +
                "pid : " + android.os.Process.myPid() +
                "tid : " + android.os.Process.myTid() +
                "id : " + Thread.currentThread().getId());
    }
    //todo : test volatile variable
    //todo : create method for creating 2 thread and output for racecondition
    void ThreadSynchrinize(){
        final Counter counter = new Counter();
        //todo : create immutable object and call add function : TEST
        //Thread thread = new Thread(counter.safe());
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                Log.i(MainActivity.TAG , "Thread 1 : \n pid : " + android.os.Process.myPid() + " tid : " + android.os.Process.myTid()
                        + "  id  : " + Thread.currentThread().getId());
                counter.safe();
            }
        }; thread1.start();
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                Log.i(MainActivity.TAG , "Thread 2 : \n pid : " + android.os.Process.myPid() + " tid : " + android.os.Process.myTid()
                        + "  id  : " + Thread.currentThread().getId());
                counter.safe();

            }
        }; thread2.start();

    }

}
