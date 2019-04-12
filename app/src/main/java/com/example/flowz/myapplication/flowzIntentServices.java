package com.example.flowz.myapplication;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;


public class flowzIntentServices extends IntentService {

    private static final String TAG = "This is the log Tag";

    public flowzIntentServices() {
        super("flowzIntentServices");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
//       This is what the service does
        Log.i(TAG, "The service has started");
    }
}
