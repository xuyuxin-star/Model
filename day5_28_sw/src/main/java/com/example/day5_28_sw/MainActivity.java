package com.example.day5_28_sw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.day5_28_sw.create.Computer;
import com.example.day5_28_sw.factory.Concats;
import com.example.day5_28_sw.factory.Shape;
import com.example.day5_28_sw.factory.ShapeFactory;
import com.example.day5_28_sw.single.SingleInstance;
import com.example.day5_28_sw.temple.Cs;
import com.example.day5_28_sw.temple.FootBall;
import com.example.day5_28_sw.temple.Game;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //单例模式
        SingleInstance.getInstance().play();
        //工厂模式
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(Concats.CIRCLE);
        shape.draw();
        Shape shape1 = shapeFactory.getShape(Concats.SQUARE);
        shape1.draw();
        //模板模式 转型 向上 向下? 子类向父类=
        Game game = new FootBall();
        game.play();

        game = new Cs();
        game.play();

        //创建者模式
        Computer build = new Computer.Builder()
                .setName("雨欣")
                .setColor("红色")
                .setAge(19)
                .build();
        Log.e("tag",build.toString());
    }
}
