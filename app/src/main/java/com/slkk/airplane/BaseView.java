package com.slkk.airplane;

import android.view.View;

/**
 * Created by dell on 2017/2/9.
 */

public interface BaseView<T> {
    //为view设置presenter
    void setPresenter(T presenter);
    //初始化界面控件
    void initViews(View view );
}
