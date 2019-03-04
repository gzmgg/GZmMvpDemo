package com.example.dell.gzmmvpdemo.Ui;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.widget.ListView;


import com.example.dell.gzmmvpdemo.R;
import com.example.dell.gzmmvpdemo.adapter.GirlAdapter;
import com.example.dell.gzmmvpdemo.adapter.MyPagerAdapter;
import com.example.dell.gzmmvpdemo.bean.Girl;
import com.example.dell.gzmmvpdemo.presenter.FragmentPresenterV2;
import com.example.dell.gzmmvpdemo.views.Fragment.FragmentM;
import com.example.dell.gzmmvpdemo.views.Fragment.FragmentN;
import com.example.dell.gzmmvpdemo.views.FragmentlView;

import java.util.ArrayList;
import java.util.List;

public class FragmentActivity extends BaseActivity<FragmentlView,FragmentPresenterV2>implements FragmentlView {


    private ViewPager vp;
    private FragmentM fragmentM;
    private FragmentN fragmentN;
    private List<Fragment> fragmentList = new ArrayList<>();
    private MyPagerAdapter adapter;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //girlPresenter.attachView(this);
        vp = (ViewPager)findViewById(R.id.vp);
        listview = (ListView) findViewById(R.id.listview);
        FragmentManager fragmentManager=this.getSupportFragmentManager();
        fragmentM = new FragmentM();
        fragmentN = new FragmentN();
        //填充数据
        fragmentList.add(fragmentM);
        fragmentList.add(fragmentN);

        adapter = new MyPagerAdapter(fragmentManager,fragmentList);
        vp.setAdapter(adapter);

        presenter.feach("传过去的数据:", "123");
    }

    @Override
    protected FragmentPresenterV2 createPresenter() {
        return new FragmentPresenterV2();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showGirls(List<Girl> list) {
//        listview.setAdapter(new GirlAdapter(this, list));
    }

    @Override
    public void showGirls1(List<Girl> list) {

    }
}
