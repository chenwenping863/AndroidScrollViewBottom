package com.test.chenwenping.androidscrollbottomtest.widge;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by chenwenping on 17/3/30.
 */

public class SmartScrollView extends ScrollView {

    public SmartScrollView(Context context) {
        super(context);
    }

    public SmartScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SmartScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
        if(scrollY != 0 && null != mScrollViewBottomListener){
            mScrollViewBottomListener.onScrollViewBottomListener(clampedY);
        }
    }

    public interface ScrollViewBottomListener {
        void onScrollViewBottomListener(boolean isBottom);
    }

    private ScrollViewBottomListener mScrollViewBottomListener;

    public void setScrollViewBottomListener(ScrollViewBottomListener scrollViewBottomListener) {
        mScrollViewBottomListener = scrollViewBottomListener;
    }

}
