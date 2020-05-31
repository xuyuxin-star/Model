package com.example.day5_28_sw.factory;

import android.util.Log;

public class SquareShape implements Shape {
    @Override
    public void draw() {
        Log.e("tag","工厂模式:SquareShape draw()");
    }
}
