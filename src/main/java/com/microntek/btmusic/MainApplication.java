package com.microntek.btmusic;

import android.app.Application;
import com.microntek.CrashHandler;

public class MainApplication extends Application {
    public void onCreate() {
        CrashHandler.handleCrashes(getApplicationContext());
        super.onCreate();
    }
}
