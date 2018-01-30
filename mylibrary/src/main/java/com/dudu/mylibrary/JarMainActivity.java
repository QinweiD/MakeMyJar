package com.dudu.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JarMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jar_main);
        LogTool tool = new LogTool();
    }
}
