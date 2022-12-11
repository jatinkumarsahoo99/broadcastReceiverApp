package com.example.broadcastreceiverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter = new IntentFilter("com.jks.myBroadcastMessage");
        MyBroadcastReceiver objReceiver = new MyBroadcastReceiver();
        registerReceiver(objReceiver,intentFilter);

        IntentFilter intentFilter1 = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        MyJKSBroadcastReceiverReceiver objReceiver1 = new MyJKSBroadcastReceiverReceiver();
        registerReceiver(objReceiver1,intentFilter1);
    }




}