package com.example.day5_28_sw.single;

import android.util.Log;

public class SingleInstance {
    //变量
    private static volatile SingleInstance instance;
    //私有化构造
    private SingleInstance(){

    }
    //双检索单例模式

    public static SingleInstance getInstance() {
        if (instance==null){
            synchronized (SingleInstance.class){
                if (instance==null){
                    instance=new SingleInstance();
                }
            }
        }
        return instance;
    }
    public void play(){
        Log.e("tag","单例模式:SingleInstance play()");
    }
}
