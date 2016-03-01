package com.example.ljd.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyReceiver3 extends BroadcastReceiver {
    private final String TAG = "MyReceiver3";
    public MyReceiver3() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.example.ljd.BROADCASTRECEIVER".equals(intent.getAction())){
            Log.d(TAG,intent.getExtras().getString("key"));
//            Log.d(TAG,getResultExtras(false).getString("key"));
//            getResultExtras(true).putString("test","haha");
//            intent.getExtras().putString("key","222222222");
        }
    }
}
