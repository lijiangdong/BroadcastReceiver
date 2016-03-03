package com.example.ljd.broadcastreceiver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    private MyReceiver myReceiver = new MyReceiver();

    class MyReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            if (Constant.BROADCAST_ACTION.equals(intent.getAction())){
                Log.d(TAG,intent.getStringExtra(Constant.CONFERENCE_KEY));
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ButterKnife.bind(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constant.BROADCAST_ACTION);
        registerReceiver(myReceiver,intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.bind(this);
        unregisterReceiver(myReceiver);
    }

    @OnClick(R.id.send_button)
    public void onClickButton(){
        Intent intent = new Intent(Constant.BROADCAST_ACTION);
//        intent.setFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
        intent.putExtra(Constant.CONFERENCE_KEY, "你好，明天九点半101会议室开会。");
//        sendBroadcast(intent);
//        Bundle bundle = new Bundle();
//        bundle.putString("key", "BroadcastReceiver");
//        intent.putExtras(bundle);
        sendOrderedBroadcast(intent,null,null,null, Activity.RESULT_OK ,null,null);

    }

}
