package com.example.ljd.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver2 extends BroadcastReceiver {
    private final String TAG = "MyReceiver2";
    public MyReceiver2() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Constant.BROADCAST_ACTION.equals(intent.getAction())){
            Log.d(TAG, intent.getStringExtra(Constant.CONFERENCE_KEY));
            Log.d(TAG, getResultExtras(true).getString(Constant.DINE_KEY));
            abortBroadcast();
        }
    }
}