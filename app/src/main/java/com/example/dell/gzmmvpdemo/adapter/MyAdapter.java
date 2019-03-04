package com.example.dell.gzmmvpdemo.adapter;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.dell.gzmmvpdemo.R;
import com.example.dell.gzmmvpdemo.Ui.MainActivity;
import com.example.dell.gzmmvpdemo.bean.Girl;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private final FragmentActivity activity;
    private final List<String> myData;
    private final LayoutInflater inflater;
    private TextView tvs;

    public MyAdapter(FragmentActivity activity, List<String> myData) {
        inflater = LayoutInflater.from(activity);
        this.activity =activity;
        this.myData = myData;
    }

    @Override
    public int getCount() {
        return myData.size();
    }

    @Override
    public Object getItem(int i) {

        return myData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View views = inflater.inflate(R.layout.home_add, null);
        tvs = (TextView) views.findViewById(R.id.tvs);
        tvs.setText(myData.get(position)+"");
        return views;
    }
}
