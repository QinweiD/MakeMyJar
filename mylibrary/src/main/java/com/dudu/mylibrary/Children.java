package com.dudu.mylibrary;

import android.util.Log;

/**
 * Created by mac on 2018/1/30.
 */

public class Children extends Person {
    private static String TAG = "children";
    public String mother;
    public String father;
    public Children() {
    }

    public void studyHard() {
        Log.d(TAG, "studyHard: children");
    }
}
