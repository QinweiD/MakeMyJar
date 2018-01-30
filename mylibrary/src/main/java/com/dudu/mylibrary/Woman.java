package com.dudu.mylibrary;

import android.util.Log;

/**
 * Created by mac on 2018/1/30.
 */

public class Woman extends Person {
    private static String TAG = "woman";
    public String huadband;

    public Woman() {
    }

    public String getHuadband() {
        return huadband;
    }

    public void setHuadband(String huadband) {
        this.huadband = huadband;
    }

    public void doHouseWork() {
        Log.d(TAG, "doHouseWork: woman");
    }
}
