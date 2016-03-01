package com.example.ljd.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyReceiver2 extends BroadcastReceiver {
    private final String TAG = "MyReceiver2";
    public MyReceiver2() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.example.ljd.BROADCASTRECEIVER".equals(intent.getAction())){
//            Log.d(TAG,getResultExtras(false).getString("key"));
//            getResultExtras(false).putString("test","haha");
            Log.d(TAG,intent.getExtras().getString("key"));
//            abortBroadcast();
        }
    }
}
