package com.example.dell.gzmmvpdemo.views.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.gzmmvpdemo.R;
import com.example.dell.gzmmvpdemo.Ui.FragmentBaseActivity;
import com.example.dell.gzmmvpdemo.bean.Girl;
import com.example.dell.gzmmvpdemo.presenter.GirlPresenterV2;
import com.example.dell.gzmmvpdemo.views.IGirlView;

import java.util.List;


public class FragmentN extends FragmentBaseActivity<IGirlView, GirlPresenterV2> implements IGirlView, View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, null);
        return view;

    }

    @Override
    protected GirlPresenterV2 createPresenter() {
        return null;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showGirls(List<Girl> list) {

    }

    @Override
    public void showGirls1(List<Girl> list) {

    }
}
