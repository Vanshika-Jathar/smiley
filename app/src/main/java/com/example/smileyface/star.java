package com.example.smileyface;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public  class star extends View
{
    Paint paint;


    public star(Context context)
    {
        super(context);
        paint = new Paint();

    }
        @Override
        protected void onDraw (Canvas canvas) {
            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(5);
            int halfWidth1 = 250;
            //int halfWidth2=350;
            int x1 = 375;
            int y1 = 425;
            Path path1 = new Path();
            Path path2 = new Path();
            path1.moveTo(x1, y1 + halfWidth1); // Top
            path1.lineTo(x1 + halfWidth1, y1 - 125);
            path1.lineTo(x1 - halfWidth1, y1 - 125);
            path1.moveTo(x1, y1 + halfWidth1);
            path2.moveTo(x1, y1 - halfWidth1); // Top
            path2.lineTo(x1 - halfWidth1, y1 + 125);
            path2.lineTo(x1 + halfWidth1, y1 + 125);
            path2.moveTo(x1, y1 - halfWidth1);
            canvas.drawPath(path1, paint);

            canvas.drawPath(path2, paint);
        }

    }




