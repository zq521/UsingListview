package com.example.zhaoqiang.usinglistview;

import android.widget.TextView;

/**
 * Created by zhaoqiang on 2017/5/23.
 */

public class MyAdapterViewHolder {
    private TextView tv_name,tv_dec;

    public MyAdapterViewHolder(TextView tv_name, TextView tv_dec) {
        this.tv_name = tv_name;
        this.tv_dec = tv_dec;
    }

    public TextView getTv_name() {
        return tv_name;
    }

    public TextView getTv_dec() {
        return tv_dec;
    }
}
