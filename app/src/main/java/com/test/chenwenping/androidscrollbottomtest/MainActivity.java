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
        setContentView(R.layout.activity_main);
        mtv = (TextView) findViewById(R.id.text_view);
        mTextView = (TextView) findViewById(R.id.content);
        mTextView.setText("dsd");
        mTextView.setTextSize(20);
      mTextView.setText("Skip to content\n" +
                "This repository\n" +
                "Search\n" +
                "Pull requests\n" +
                "Issues\n" +
                "Gist\n" +
                " @chenwenping863\n" +
                " Sign out\n" +
                " Unwatch 1\n" +
                "  Star 0\n" +
                " Fork 0 chenwenping863/AndroidScrollViewBottom\n" +
                " Code  Issues 0  Pull requests 0  Projects 0  Wiki  Pulse  Graphs  Settings\n" +
                "Quick setup — if you’ve done this kind of thing before\n" +
                " Set up in Desktop\tor\t\n" +
                " HTTPS\n");
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
