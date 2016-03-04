package com.example.ljd.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyReceiver1 extends BroadcastReceiver {

    private final String TAG = "MyReceiver1";
    public MyReceiver1() {
    }
    @Override
    public void onReceive(Context context, Intent intent) {

        if (Constant.BROADCAST_ACTION.equals(intent.getAction())){
            Log.d(TAG, intent.getStringExtra(Constant.CONFERENCE_KEY));
            Log.d(TAG, getResultExtras(true).getString(Constant.DINE_KEY));
            Bundle bundle = getResultExtras(true);
            bundle.putString(Constant.DINE_KEY, "后天中午一起聚餐");
            setResultExtras(bundle);
        }
    }
}
