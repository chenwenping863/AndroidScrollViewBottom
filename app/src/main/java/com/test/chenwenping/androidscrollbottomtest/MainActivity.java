package com.test.chenwenping.androidscrollbottomtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.test.chenwenping.androidscrollbottomtest.widge.BillMonthItemLayout;
import com.test.chenwenping.androidscrollbottomtest.widge.SmartScrollView;

public class MainActivity extends AppCompatActivity {
    private SmartScrollView mSmartScrollView;
    private TextView mtv;
    private TextView mTextView;
    private BillMonthItemLayout mBillMonthItemLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtv = (TextView) findViewById(R.id.text_view);
        mTextView = (TextView) findViewById(R.id.content);
        mTextView.setText("dsd");
        mTextView.setTextSize(20);

        mSmartScrollView = (SmartScrollView) findViewById(R.id.smart_scroll_view);
        mBillMonthItemLayout = (BillMonthItemLayout) findViewById(R.id.item_layout_view);
        mBillMonthItemLayout.setData(100);
        mSmartScrollView.setScrollViewBottomListener(new SmartScrollView.ScrollViewBottomListener() {
            @Override
            public void onScrollViewBottomListener(boolean isBottom) {
                if (isBottom) {
                    mBillMonthItemLayout.setData(50);
                }
            }
        });
    }
}
