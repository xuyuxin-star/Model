package com.example.day5_28_sw.temple;

import android.util.Log;

public class FootBall extends Game {
    @Override
    void initialize() {
        Log.e("tag","模板模式:football initialize()");
    }

    @Override
    void startGame() {
        Log.e("tag","模板模式:football start()");
    }

    @Override
    void endGame() {
        Log.e("tag","模板模式:football end()");
    }
}
