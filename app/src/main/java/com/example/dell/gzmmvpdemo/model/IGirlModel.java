package com.example.dell.gzmmvpdemo.model;


import com.example.dell.gzmmvpdemo.bean.Girl;

import java.util.List;

public interface IGirlModel {
//	第一条数据
	void loadGirl(String name, String pwd, onGirlListener listener);
	interface onGirlListener{
		void onComplete(List<Girl> list);
	}

	void setCs(String name, String pwd);
//第二次数据
	void loadGirl1(String name, String pwd, onGirlListener1 listener);
	interface onGirlListener1{
		void onComplete(List<Girl> list);
	}
	void setCs1(String name, String pwd);
}
