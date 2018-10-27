package com.example.karla.te4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.View;

public class Square extends View {

    public Square(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawRGB(255,255,255);
        int ancho=canvas.getWidth();
        int left = 30;
        int right = 100;
        int top = 20;
        int bottom = 100;
        Paint pincel1=new Paint();

        pincel1.setColor(Color.BLACK);
        canvas.drawRect(left,top,right,bottom,pincel1);

    }
}
