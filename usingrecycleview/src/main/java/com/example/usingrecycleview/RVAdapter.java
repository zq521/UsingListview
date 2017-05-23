package com.example.usingrecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoqiang on 2017/5/23.
 */

public class RVAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<User> users = new ArrayList<>();


    public RVAdapter(Context context) {
        this.context = context;
        users.add(new User("小明","男",10));
        users.add(new User("小明","男",10));
        users.add(new User("小明","男",10));
        users.add(new User("小明","男",10));
        users.add(new User("小明","男",10));
        users.add(new User("小明","男",10));
        users.add(new User("小明","男",10));
        users.add(new User("小明","男",10));
        users.add(new User("小明","男",10));
    }

    public Context getContext() {
        return context;

    }

    @Override
    public RVAdapterVirewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RVAdapterVirewHolder(LayoutInflater.from(getContext()).inflate(R.layout.rv_item, null));

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RVAdapterVirewHolder rvHolder = (RVAdapterVirewHolder) holder;
        User user = users.get(position);
        rvHolder.getTvName().setText(user.getName());
        rvHolder.getTvDesc().setText("性别：" + user.getGender() + "年龄" + user.getAge());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
