package com.example.usingrecycleview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by zhaoqiang on 2017/5/23.
 */

public class RVAdapterVirewHolder extends RecyclerView.ViewHolder {
    private TextView tvName,tvDesc;

    public RVAdapterVirewHolder(View itemView) {
        super(itemView);
        tvName= (TextView) itemView.findViewById(R.id.tvName);
        tvDesc= (TextView) itemView.findViewById(R.id.tvDesc);
    }

    public TextView getTvName() {
        return tvName;
    }

    public TextView getTvDesc() {
        return tvDesc;
    }
}
