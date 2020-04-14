package com.example.a01_helloworldmodule;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class RabbitView extends View {
    public float positionX;
    public float positionY;
    public RabbitView(Context context) {
        super(context);
        positionX = 120;
        positionY = 150;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.mipmap.star);
        canvas.drawBitmap(bitmap, positionX, positionY, paint);
        if (bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }
}
