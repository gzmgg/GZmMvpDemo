package com.example.dell.gzmmvpdemo.model;


import com.example.dell.gzmmvpdemo.R;
import com.example.dell.gzmmvpdemo.bean.Girl;

import java.util.ArrayList;
import java.util.List;

public class GirlModelImpl implements IGirlModel {




	@Override
	public void loadGirl(String name, String pwd, onGirlListener listener) {
		//加载数据
		List<Girl> list=new ArrayList<Girl>();
		list.add(new Girl(R.drawable.image1, "你是我的小苹果image1"));
		list.add(new Girl(R.drawable.image2, "你是我的小苹果image2"));
		list.add(new Girl(R.drawable.image3, "你是我的小苹果image3"));
		list.add(new Girl(R.drawable.image4, "你是我的小苹果image4"));
		list.add(new Girl(R.drawable.image5, "你是我的小苹果image5"));
		list.add(new Girl(R.drawable.image6, "你是我的小苹果image6"));
		list.add(new Girl(R.drawable.image7, "你是我的小苹果image7"));
		list.add(new Girl(R.drawable.image8, "你是我的小苹果image8"));
		list.add(new Girl(R.drawable.image8, name+pwd+""));
		//返回数据
		listener.onComplete(list);
	}

	@Override
	public void setCs(String name, String pwd) {

	}

	@Override
	public void loadGirl1(String name, String pwd, onGirlListener1 listener) {
		List<Girl> list=new ArrayList<Girl>();
		list.add(new Girl(R.drawable.image8, name+pwd+""));
		listener.onComplete(list);
	}

	@Override
	public void setCs1(String name, String pwd) {

	}

}
