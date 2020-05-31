package com.example.day5_28_sw.factory;

import android.util.Log;

public class CircleShape implements Shape {
    @Override
    public void draw() {
        Log.e("tag","工厂模式:CircleShape draw()");
    }
}
