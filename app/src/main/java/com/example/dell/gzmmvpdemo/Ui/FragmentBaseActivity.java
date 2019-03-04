package com.example.dell.gzmmvpdemo.Ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.gzmmvpdemo.presenter.BasePresenter;


public abstract class FragmentBaseActivity<V,P extends BasePresenter<V>> extends Fragment {
    protected P presenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        presenter = createPresenter();
        if (presenter != null) {
            presenter = createPresenter();
            presenter.attachView((V)this);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (presenter != null) {
            presenter.detachView();
        }
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
