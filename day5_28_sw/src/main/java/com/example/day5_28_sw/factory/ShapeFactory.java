package com.example.day5_28_sw.factory;

import android.text.TextUtils;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (TextUtils.isEmpty(shapeType)){
            return null;
        }
        if (shapeType.equals(Concats.CIRCLE)){
            return new CircleShape();
        }else if (shapeType.equals(Concats.SQUARE)){
            return new SquareShape();
        }
        return null;
    }
}
