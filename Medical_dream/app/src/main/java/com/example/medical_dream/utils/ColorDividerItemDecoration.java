package com.example.medical_dream.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;



/**
 * Created by liguixiao on 2019/10/12.
 */

public class ColorDividerItemDecoration extends RecyclerView.ItemDecoration{
    private int mDividerHeight = 30;

    private Paint mPaint;

    public ColorDividerItemDecoration(int color, int dividerHeight) {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(color);
        this.mDividerHeight = dividerHeight;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

//        //第一个ItemView不需要在上面绘制分割线
        if (parent.getChildAdapterPosition(view) != 0){
            outRect.top = mDividerHeight;
        }
       // outRect.top = mDividerHeight;
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);

        int childCount = parent.getChildCount();

        for ( int i = 0; i < childCount; i++ ) {
            View view = parent.getChildAt(i);

            int index = parent.getChildAdapterPosition(view);
            //第一个ItemView不需要绘制
           /* if ( index == 0 ) {
                continue;
            }*/

            float dividerTop = view.getTop() - mDividerHeight;
            float dividerLeft = parent.getPaddingLeft();
            float dividerBottom = view.getTop();
            float dividerRight = parent.getWidth() - parent.getPaddingRight();

            c.drawRect(dividerLeft,dividerTop,dividerRight,dividerBottom,mPaint);
        }
    }
}
