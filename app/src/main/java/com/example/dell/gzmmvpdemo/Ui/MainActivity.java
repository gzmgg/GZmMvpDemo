package com.example.dell.gzmmvpdemo.Ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.gzmmvpdemo.R;
import com.example.dell.gzmmvpdemo.adapter.GirlAdapter;
import com.example.dell.gzmmvpdemo.adapter.MyAdapter;
import com.example.dell.gzmmvpdemo.bean.Girl;
import com.example.dell.gzmmvpdemo.presenter.GirlPresenterV2;
import com.example.dell.gzmmvpdemo.views.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<IGirlView, GirlPresenterV2> implements IGirlView, View.OnClickListener {
    ListView listView;
    private TextView tv;

    //	GirlPresenter girlPresenter=new GirlPresenter<IGirlView>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //girlPresenter.attachView(this);
//        presenter.feach("传过去的数据:", "123");
    }

    private void initView() {
        tv = (TextView) findViewById(R.id.tv);
        listView = (ListView) findViewById(R.id.listview);
        tv.setOnClickListener(this);
    }

    @Override
    public void showDialog() {
    }

    @Override
    public void showGirls(List<Girl> list) {
//        listView.setAdapter(new MyAdapter(this, list));

    }

    @Override
    public void showGirls1(List<Girl> list) {

        Toast.makeText(this, "走了", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected GirlPresenterV2 createPresenter() {
        return new GirlPresenterV2();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //girlPresenter.detachView();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.tv:
                presenter.getOtherData("传过去的数据第二次数据:", "123");
                break;
        }
    }
}
