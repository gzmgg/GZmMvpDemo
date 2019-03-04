package com.example.dell.gzmmvpdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.dell.gzmmvpdemo.R;
import com.example.dell.gzmmvpdemo.bean.Girl;

import java.util.List;

public class GirlAdapter extends BaseAdapter {
    private final LayoutInflater inflater;
    List<Girl> list;
    Context context;
    private TextView tvs;

    public GirlAdapter(Context context, List<Girl> list) {
        inflater = LayoutInflater.from(context);
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//		ViewHolder holder = null;
//		if (convertView == null) {
//			holder = new ViewHolder();
        View views = inflater.inflate(R.layout.home_add, null);
        tvs = (TextView) views.findViewById(R.id.tvs);
        tvs.setText(list.get(position).getContent()+"");
//			convertView = LayoutInflater.from(parent.getContext()).inflate(
//					R.layout.item_v1, parent, false);
//			holder.head = (ImageView) convertView.findViewById(R.id.head);
//			holder.content = (TextView) convertView.findViewById(R.id.content);
//			convertView.setTag(holder);
//		} else {
//			holder = (ViewHolder) convertView.getTag();
//		}
//		Girl girl = list.get(position);
//		holder.head.setImageResource(girl.getHead());
//		holder.content.setText(girl.getContent());
        return views;
    }

    static class ViewHolder {
        TextView content;
        ImageView head;
    }
}
