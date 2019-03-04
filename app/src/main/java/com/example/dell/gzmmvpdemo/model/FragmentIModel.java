package com.example.dell.gzmmvpdemo.model;


import com.example.dell.gzmmvpdemo.bean.Girl;

import java.util.List;

public interface FragmentIModel {

    //	第一条数据
    void loadGirl(String name, String pwd, FragmentIModel.onGirlListener listener);
    interface onGirlListener{
        void onComplete(List<Girl> list);
    }

}
