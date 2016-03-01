package com.example.ljd.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;

public class MyReceiver1 extends BroadcastReceiver {

    private final String TAG = "MyReceiver1";
    public MyReceiver1() {
    }
    @Override
    public void onReceive(Context context, Intent intent) {

        if ("com.example.ljd.BROADCASTRECEIVER".equals(intent.getAction())){
            Log.d(TAG,intent.getExtras().getString("key"));
           /* Log.d(TAG,getResultExtras(false).getString("key"));

            Log.d(TAG,getResultExtras(false).containsKey("test")?getResultExtras(false).getString("test"):"----------");*/
        }
//        Log.e("onReceive",String.valueOf(Looper.getMainLooper() == Looper.myLooper()));
    }
}
