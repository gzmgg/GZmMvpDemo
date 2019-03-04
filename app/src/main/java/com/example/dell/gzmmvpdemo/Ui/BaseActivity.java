package com.example.dell.gzmmvpdemo.Ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dell.gzmmvpdemo.presenter.BasePresenter;


public abstract class BaseActivity<V,P extends BasePresenter<V>> extends AppCompatActivity {
    protected P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.attachView((V)this);
    }
    /**
     * 创建一个与之关联的Presenter
     * @return
     */
    protected abstract P  createPresenter();
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        presenter.detachView();
//    }
}
