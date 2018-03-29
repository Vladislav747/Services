package com.example.vladislavkudryakov.services;

import android.app.IntentService;
import android.os.Handler;
import android.os.Looper;


/**
 * Created by vladislavkudryakov on 30.03.18.
 */

public class CommandService extends IntentService {
    public static final String ACTION = "COMMAND_SERVICE_ACTION";
    private android.os.Handler mHandler = new Handler(Looper.myLooper());

    public CommandService() {this("CommandService")}
}
