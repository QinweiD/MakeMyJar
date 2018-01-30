package com.dudu.mylibrary;

/**
 * Created by mac on 2018/1/30.
 */

public class LogTool {
    Person mPerson;
    Man mMan;
    Children mChildren;
    Woman mWoman;

    public LogTool() {
        getInfo();
        mPerson = new Person();
        mMan = new Man();
        mChildren = new Children();
        mWoman = new Woman();
        mWoman.setaName("小花");
        mMan.setaName("小明");
        mChildren.setaName("小强");

    }
    public static void getInfo() {

    }
}
