package com.example.day5_28_sw.temple;

/**
 * 抽象类
 */
public abstract class Game {
    abstract void initialize();
    abstract void startGame();
    abstract void endGame();
    //执行顺序
    public void play(){
        initialize();
        startGame();
        endGame();
    }
}
