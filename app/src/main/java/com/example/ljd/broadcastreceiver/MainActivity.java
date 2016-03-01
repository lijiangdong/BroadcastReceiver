package com.example.ljd.broadcastreceiver;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.bind(this);
    }

    @OnClick(R.id.send_button)
    public void onClickButton(){
        Intent intent = new Intent("com.example.ljd.BROADCASTRECEIVER1");
        Bundle bundle = new Bundle();
        bundle.putString("key","BroadcastReceiver");
        intent.putExtras(bundle);
        sendBroadcast(intent);
//        sendOrderedBroadcast(intent,null,null,null, Activity.RESULT_OK ,null,bundle);
//        sendOrderedBroadcastAsUser();
//        sendStickyBroadcast(intent);
    }

    @OnClick(R.id.start_activity)
    public void startActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
