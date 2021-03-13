package com.example.smileyface;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class smiley extends View {

    Paint paint;
    Rect rect;

    public smiley(Context context) {

        super(context);
        paint = new Paint();
        rect = new Rect();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);

        int x = getWidth() / 2;
        int y = getHeight() / 2;
        int r = 350;
        canvas.drawCircle(x, y, r, paint);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(x - 220, y - 70, 50, paint);
        canvas.drawCircle(x + 200, y - 70, 50, paint);

        int radius = 200;
        RectF oval = new RectF(x - radius, y - radius, x + radius, y + radius);
        canvas.drawArc(oval, 45, 90, false, paint);
        paint.setColor(Color.WHITE);

        int width=100;
        int halfWidth = width / 2;
        Path path = new Path();
        path.moveTo(x, y - halfWidth); // Top
        path.lineTo(x - halfWidth, y + halfWidth); // Bottom left
        path.lineTo(x + halfWidth, y + halfWidth); // Bottom right
        path.lineTo(x, y - halfWidth); // Back to Top
        path.close();
        canvas.drawPath(path, paint);
        paint.setColor(Color.WHITE);

       /* int width=100;
        int halfWidth = width / 2;
        Path path = new Path();
            path.moveTo(x, y - halfWidth); // Top
            path.lineTo(x - halfWidth, y + halfWidth); // Bottom left
            path.lineTo(x + halfWidth, y + halfWidth); // Bottom right
            path.lineTo(x, y - halfWidth); // Back to Top
            path.close();

            canvas.drawPath(path, paint);
            paint.setColor(Color.WHITE);
            drawTriangle(canvas, paint, 100, 100, 100);
        }

    private void drawTriangle(Canvas canvas, Paint paint, int i, int i1, int width) {
    }*/


       /* path.moveTo(x - 20, y - 20); // Top
        path.lineTo(x + 20, y - 20); // Bottom left
        path.lineTo(x + 20, y + 50); // Bottom right
        path.lineTo(x - 20, y + 50); // Back to Top
        path.lineTo(x - 20, y - 20); // Back to Top
        path.close();
        canvas.drawPath(path, paint);
        paint.setColor(Color.WHITE);
         int halfWidth = 500/2;

        path.moveTo(x-15, y-15 ); // Top
        path.lineTo(x - halfWidth, y + halfWidth); // Bottom left
        path.lineTo(x + halfWidth, y + halfWidth); // Bottom right
        path.lineTo(x, y - halfWidth); // Back to Top
        path.close();
        canvas.drawPath(path, paint);


        /* paint.setColor(Color.BLUE);
        paint.setStrokeWidth(5);
        int halfWidth1 = 250;
        //int halfWidth2=350;
        int x1 = 500;
        int y1 = 500;
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

        canvas.drawPath(path2, paint);*/
    }
}






