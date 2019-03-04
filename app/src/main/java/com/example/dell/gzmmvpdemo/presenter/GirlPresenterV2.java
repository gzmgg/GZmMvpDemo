package com.example.dell.gzmmvpdemo.presenter;


import com.example.dell.gzmmvpdemo.bean.Girl;
import com.example.dell.gzmmvpdemo.model.GirlModelImpl;
import com.example.dell.gzmmvpdemo.model.IGirlModel;
import com.example.dell.gzmmvpdemo.views.IGirlView;

import java.util.List;

public class GirlPresenterV2 extends BasePresenter<IGirlView> {


    //Model的引用
    IGirlModel iGirlModel = new GirlModelImpl();

    public GirlPresenterV2() {
        super();
//		this.mReference = new WeakReference<T>(view);
    }

    public void feach(String name, String pwd) {

        if (iGirlModel != null && getView() != null) {
            //显示进度条
            if (getView() != null) {
                getView().showDialog();
            }
            iGirlModel.setCs(name, pwd);
//			SystemClock.sleep(2000);// Android的休眠，已忽略了中断的异常
            //加载数据
            iGirlModel.loadGirl(name, pwd, new IGirlModel.onGirlListener() {
                @Override
                public void onComplete(List<Girl> list) {
                    //返回数据
                    //显示到View层
                    if (getView() != null) {
                        getView().showGirls(list);
                    }
                }
            });

        }

    }

    public void getOtherData (String name , String pwd){

        if (iGirlModel != null && getView() != null) {
//
            iGirlModel.setCs1(name, pwd);
//			SystemClock.sleep(2000);// Android的休眠，已忽略了中断的异常
            //加载数据
            iGirlModel.loadGirl1(name, pwd, new IGirlModel.onGirlListener1() {
                @Override
                public void onComplete(List<Girl> list) {
                    //返回数据
                    //显示到View层
                    if (getView() != null) {
                        getView().showGirls1(list);
                    }
                }
            });

        }

    }
}
