package com.microntek;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

public class CrashHandler implements UncaughtExceptionHandler {
    private static CrashHandler crashHandler;
    private final String crashLogDir = "/mnt/sdcard/carsh/";
    private final DateFormat crashDateTime = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
    private HashMap<String, String> af;
    private Context context;
    private UncaughtExceptionHandler ah;
    private String packageName;

    public CrashHandler(Context context) {
        this.context = context.getApplicationContext();
        this.packageName = this.context.getPackageName().replace(".", "_");
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static CrashHandler handleCrashes(Context context) {
        if (crashHandler == null) {
            crashHandler = new CrashHandler(context);
        }
        return crashHandler;
    }

    private boolean ak(Throwable th) {
        if (th == null) {
            return false;
        }
        aj();
        al(th);
        return true;
    }

    void aj() {
        if (this.af == null) {
            this.af = new HashMap();
        }
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), PackageManager.GET_ACTIVITIES);
            if (packageInfo != null) {
                this.af.put("versionName", packageInfo.versionName);
                this.af.put("versionCode", "" + packageInfo.versionCode);
            }
        } catch (NameNotFoundException e) {
        }
    }

    private String al(Throwable th) {
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        String writer = stringWriter.toString();
        printWriter.close();
        StringBuffer stringBuffer = new StringBuffer();
        for (Entry entry : this.af.entrySet()) {
            stringBuffer.append(entry.getKey() + "=" + entry.getValue() + "\n");
        }
        stringBuffer.append(writer);
        File file = new File(crashLogDir);
        if (!file.exists()) {
            file.mkdirs();
        }
        String str = this.packageName + "-" + this.crashDateTime.format(new Date()) + ".log";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(crashLogDir + str);
            fileOutputStream.write(stringBuffer.toString().getBytes());
            fileOutputStream.close();
            return str;
        } catch (Exception e) {
            return null;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (ak(th)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        if (this.ah == null) {
            this.ah = Thread.getDefaultUncaughtExceptionHandler();
        }
        this.ah.uncaughtException(thread, th);
    }
}
