package com.dudu.mylibrary;

import android.util.Log;

/**
 * Created by mac on 2018/1/30.
 */

public class Man extends Person {
    private static String TAG = "man";
    public String wife;

    public Man() {
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }
    public void makeMoney() {
        Log.d(TAG, "makeMoney: ");
    }
}
