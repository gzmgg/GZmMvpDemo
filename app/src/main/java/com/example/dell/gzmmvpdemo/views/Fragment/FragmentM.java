package com.example.dell.gzmmvpdemo.views.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.dell.gzmmvpdemo.R;
import com.example.dell.gzmmvpdemo.Ui.FragmentBaseActivity;
import com.example.dell.gzmmvpdemo.adapter.GirlAdapter;
import com.example.dell.gzmmvpdemo.adapter.MyAdapter;
import com.example.dell.gzmmvpdemo.bean.Girl;
import com.example.dell.gzmmvpdemo.presenter.GirlPresenterV2;
import com.example.dell.gzmmvpdemo.views.IGirlView;

import java.util.ArrayList;
import java.util.List;


public class FragmentM extends FragmentBaseActivity<IGirlView, GirlPresenterV2> implements IGirlView, View.OnClickListener {

    private TextView tv;
    private ListView listView;
    private List<String> myData = new ArrayList<>();
    private TextView tv1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main3, null);

//        tv = (TextView) view.findViewById(R.id.tv);
        listView = (ListView) view.findViewById(R.id.listview);
        tv1 = (TextView) view.findViewById(R.id.tv1);
        presenter.feach("传过去的数据:", "123");
//        tv.setOnClickListener(this);
        return view;

    }


    @Override
    protected GirlPresenterV2 createPresenter() {
        return new GirlPresenterV2();
    }


    @Override
    public void onClick(View view) {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showGirls(List<Girl> lists) {

        if (lists.size() > 0) {
            listView.setAdapter(new GirlAdapter(getActivity(), lists));
//            不能走
//                       Toast.makeText(getActivity(), ""+lists, Toast.LENGTH_SHORT).show();
//            adapter=new MyAdapter(stuList,MainActivity.this);
//            listView.setAdapter(adapter);

//能走
//            for (int i = 0; i < lists.size(); i++) {
//
////                tv1.setText(lists.get(0).getContent() + "");
//                myData.add(lists.get(i).getContent());
//            }
//            listView.setAdapter(new MyAdapter(getActivity(),myData));

        }
    }


    @Override
    public void showGirls1(List<Girl> list) {

    }
}
