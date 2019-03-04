package com.example.dell.gzmmvpdemo.presenter;



import com.example.dell.gzmmvpdemo.bean.Girl;
import com.example.dell.gzmmvpdemo.model.FragmentIModel;
import com.example.dell.gzmmvpdemo.model.FragmentModel;
import com.example.dell.gzmmvpdemo.views.FragmentlView;

import java.util.List;

public class FragmentPresenterV2 extends BasePresenter<FragmentlView>{

    //Model的引用
    FragmentIModel iGirlModel = new FragmentModel();
//    IGirlModel iGirlModel = new GirlModelImpl();
    public FragmentPresenterV2() {
        super();
//		this.mReference = new WeakReference<T>(view);
    }

    public void feach(String name, String pwd) {

        if (iGirlModel != null && getView() != null) {
            //显示进度条
            if (getView() != null) {
                getView().showDialog();
            }
//
            iGirlModel.loadGirl(name,pwd, new FragmentIModel.onGirlListener() {
                @Override
                public void onComplete(List<Girl> list) {
                    //显示到View层
                    if (getView() != null) {
                        getView().showGirls(list);
                    }
                }
            });

//			SystemClock.sleep(2000);// Android的休眠，已忽略了中断的异常
            //加载数据
//            iGirlModel.loadGirl(name, pwd, new FragmentIModel.onGirlListener(){
//                @Override
//                public void onComplete(List<Girl> list) {
//                    //返回数据
//                    //显示到View层
//                    if (getView() != null) {
//                        getView().showGirls(list);
//                    }
//                }
//            });

        }

    }

}
