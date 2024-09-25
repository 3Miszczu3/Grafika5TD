package com.example.grafika;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Kwadraty extends View {
    public Kwadraty(Context context) {
        super(context);
    }

    public Kwadraty(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Kwadraty(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Kwadraty(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        int szer = getWidth(), wys = getHeight();
        int r=200;

        Paint p = new Paint();
        p.setColor(Color.WHITE);
        canvas.drawRect(0,0,szer-1,wys-1,p);
        p.setTextSize(100);
        p.setTextAlign(Paint.Align.RIGHT);
        p.setColor(Color.BLUE);
        canvas.drawText("Kw",szer-20,wys/2,p );

        p.setStyle(Paint.Style.FILL);
        p.setColor(Color.BLUE);

        canvas.drawRect(szer/2-r, wys/2-r,szer/2+r,wys/2+r,p);
        p.setColor(Color.RED);
        canvas.drawCircle(szer/2,wys/2,r,p);
        super.onDraw(canvas);
    }
}
