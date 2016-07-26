package com.draw.practice.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.draw.practice.utils.L;

/**
 * Created by xugang on 2016/7/19.
 * Describe 跟随手指划线
 */
public class DrawLineFollowFingerView extends View {
    private Paint mPaint;//绘制线条的Path
    private Path mPath;//记录用户绘制的Path

    private int mLastX;
    private int mLastY;

    public DrawLineFollowFingerView(Context context) {
        this(context, null);
    }

    public DrawLineFollowFingerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawLineFollowFingerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPath = new Path();
        mPaint = new Paint();
        mPaint.setColor(Color.GREEN);
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeWidth(20);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        int x = (int) event.getX();
        int y = (int) event.getY();

        switch (action) {
            case MotionEvent.ACTION_DOWN:
                mLastX = x;
                mLastY = y;
                mPath.moveTo(mLastX, mLastY);
                break;
            case MotionEvent.ACTION_MOVE:
                int dx = Math.abs(x - mLastX);
                int dy = Math.abs(y - mLastY);
                if (dx > 3 || dy > 3)
                    mPath.lineTo(x, y);
                mLastX = x;
                mLastY = y;
                break;
        }

        invalidate();
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        L.d("onDraw");
        canvas.drawPath(mPath, mPaint);
    }
}
