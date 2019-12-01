package com.example.mylab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CanvasView(this));
        Paint brush = new Paint();

        setContentView(R.layout.activity_main);
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
/*bitmap*/
        Bitmap bg = Bitmap.createBitmap(480, 800, Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(bg);
        canvas.drawRect(150, 200,250, 250, paint);
        canvas.drawRect(120, 250,280, 270, paint);
       /* canvas.translate(150, 10);*/

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        canvas.drawRect(100, 100, 300, 200, paint);

        LinearLayout ll = (LinearLayout)findViewById(R.id.linearLayout1);
        ll.setBackgroundDrawable(new BitmapDrawable(bg));


    }


    class CanvasView extends View {
        public CanvasView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint brush = new Paint();
            super.onDraw(canvas);
            int x = getWidth();
            int y = getHeight();
            int radius = 100;
            Paint paint = new Paint();
            canvas.translate(280, 560);

            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);


            Paint square = new Paint();
            canvas.translate(340, 380);


            square.setStyle(Paint.Style.FILL);
            paint.setColor(Color.GREEN);
            /*  canvas.drawPaint(square);*/

            canvas.drawRect(100, 100, 300, 300, paint);
            paint.setColor(Color.RED);
            canvas.drawCircle(200, 200, 100, paint);
            paint.setColor(Color.WHITE);
            paint.setTextSize(20);

            canvas.drawText("Olga MAgrytska" ,110,200, paint);
        }
    }





}






