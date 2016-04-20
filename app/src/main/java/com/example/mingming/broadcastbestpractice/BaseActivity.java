package com.example.mingming.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by mingming on 2016/4/20.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
