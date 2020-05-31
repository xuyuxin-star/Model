package com.example.day5_28_sw.temple;

import android.util.Log;

public class Cs extends Game {
    @Override
    void initialize() {
        Log.e("tag","cs initialize()");
    }

    @Override
    void startGame() {
        Log.e("tag","cs start()");
    }

    @Override
    void endGame() {
        Log.e("tag","cs end()");
    }
}
