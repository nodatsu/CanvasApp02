package com.example.canvasapp02;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    private Paint paint;

    // コンストラクタ(初期設定)
    public MyView(Context con) {
        super(con);

        paint = new Paint();
    }

    // 描画の処理
    @Override
    protected void onDraw(Canvas canvas) {

        // 背景
        canvas.drawColor(Color.GRAY);

        // 円
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(300, 500, 50, paint);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(300, 600, 50, paint);

        // 矩形
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(400, 800, 600, 1000, paint);

    }

}
