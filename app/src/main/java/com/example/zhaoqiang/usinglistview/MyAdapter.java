package com.example.zhaoqiang.usinglistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.zhaoqiang.usinglistview.R.id.tv_dec;
import static com.example.zhaoqiang.usinglistview.R.id.tv_name;

/**
 * Created by zhaoqiang on 2017/5/23.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<User> items = new ArrayList<>();
    private MyAdapterViewHolder holder;

    public MyAdapter(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public MyAdapter() {
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public User getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_list_item, null);
            holder = new MyAdapterViewHolder(
                    (TextView) convertView.findViewById(tv_name)
                    , (TextView) convertView.findViewById(tv_dec));
            convertView.setTag(holder);
        } else {
            holder = (MyAdapterViewHolder) convertView.getTag();
        }

        User user = getItem(position);
        holder.getTv_name().setText(user.getName());
        holder.getTv_dec().setText("性别：" + user.getGender() + "年龄" + user.getAge());


        return convertView;

    }


    public void add(User item) {
        items.add(item);
        notifyDataSetChanged();
    }

}
