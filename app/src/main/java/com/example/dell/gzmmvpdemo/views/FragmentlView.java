package com.example.dell.gzmmvpdemo.views;


import com.example.dell.gzmmvpdemo.bean.Girl;

import java.util.List;


/**
 * 视图层接口
 * @author yuxue
 *
 */
public interface FragmentlView {
	//加载的提示
	void showDialog();
	//显示
	void showGirls(List<Girl> list);

	void showGirls1(List<Girl> list);

}
