package com.slkk.airplane.homepage;

import android.content.Context;

import com.google.gson.Gson;
import com.slkk.airplane.bean.StringModelImpl;
import com.slkk.airplane.utils.DateFormatter;

/**
 * Created by dell on 2017/2/9.
 */

public class ZhihuDailyPresenter implements ZhihuDailyContract.Presenter {
    private Context context;
    private ZhihuDailyContract.View view;
    private StringModelImpl model;
    private DateFormatter formatter = new DateFormatter();
    private Gson gson = new Gson();

    public ZhihuDailyPresenter(Context context, ZhihuDailyContract.View view) {
        this.context = context;
        this.view = view;
        this.view.setPresenter(this);
        model = new StringModelImpl(context);

    }

    //请求数据
    @Override
    public void loadPosts(long data, boolean clearing) {

    }

    //刷新数据
    @Override
    public void refresh() {

    }

    //加载更多
    @Override
    public void loadMore(long data) {

    }

    //显示详情
    @Override
    public void startReading(int position) {

    }

    //随便看看
    @Override
    public void feelLcuky() {

    }

    //获取数据并改变界面显示
    @Override
    public void start() {

    }
}
