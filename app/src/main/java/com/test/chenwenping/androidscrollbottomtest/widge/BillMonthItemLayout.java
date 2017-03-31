package com.test.chenwenping.androidscrollbottomtest.widge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.test.chenwenping.androidscrollbottomtest.R;

/**
 * Created by chenwenping on 17/3/21.
 */

public class BillMonthItemLayout extends LinearLayout {
    private TextView monthDesc;
    public BillMonthItemLayout(Context context) {
        super(context);
    }

    public BillMonthItemLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private View setBillMonthItem(String desc, String id) {
        View billMonthItem = View.inflate(getContext(), R.layout.item_ly, null);
        /*billMonthItem.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //step,传递 id（月份）
            }
        });*/

        monthDesc = (TextView) billMonthItem.findViewById(R.id.bill_list_month_item_month_tx);
        monthDesc.setText(desc);

        return billMonthItem;
    }

    public void setData(int count) {
        for (int i = 0; i < count; i ++) {
            View view = setBillMonthItem(String.valueOf(i) + "月", String.valueOf(i));
            addView(view);
        }
    }



}
