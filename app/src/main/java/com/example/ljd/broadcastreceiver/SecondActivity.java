package com.example.ljd.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private final String TAG = "SecondActivity";
    private MyReceiver4 myReceiver4;
    class MyReceiver4 extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            if ("com.example.ljd.BROADCASTRECEIVER1".equals(intent.getAction())){
                Log.d(TAG,intent.getExtras().getString("key"));
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        myReceiver4 = new MyReceiver4();
        registerReceiver();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myReceiver4);
    }

    private void registerReceiver(){
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.example.ljd.BROADCASTRECEIVER1");
        registerReceiver(myReceiver4,intentFilter);
    }
}
