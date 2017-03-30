package com.test.chenwenping.androidscrollbottomtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.test.chenwenping.androidscrollbottomtest.widge.SmartScrollView;

public class MainActivity extends AppCompatActivity {
    private SmartScrollView mSmartScrollView;
    private TextView mtv;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mtv = (TextView) findViewById(R.id.text_view);
        mTextView = (TextView) findViewById(R.id.tx);
        mTextView.setTextSize(20);
        mTextView.setText("");
        setContentView(R.layout.activity_main);
        mSmartScrollView = (SmartScrollView) findViewById(R.id.smart_scroll_view);
        mSmartScrollView.setScrollViewBottomListener(new SmartScrollView.ScrollViewBottomListener() {
            @Override
            public void onScrollViewBottomListener(boolean isBottom) {
                if (isBottom) {
                    mtv.setText("Bottom");
                }
            }
        });
    }
}
