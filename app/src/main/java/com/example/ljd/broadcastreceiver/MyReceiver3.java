package com.example.ljd.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver3 extends BroadcastReceiver {
    private final String TAG = "MyReceiver3";
    public MyReceiver3() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Constant.BROADCAST_ACTION.equals(intent.getAction())){
            Log.d(TAG,intent.getStringExtra(Constant.CONFERENCE_KEY));
        }
    }
}
