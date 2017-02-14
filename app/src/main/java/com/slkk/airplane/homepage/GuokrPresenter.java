package com.slkk.airplane.homepage;

import android.content.Context;

import com.slkk.airplane.bean.StringModelImpl;

/**
 * Created by skll on 2017/2/9.
 */

public class GuokrPresenter implements GuokrContract.Presenter {

    private Context context;
    private StringModelImpl model;
    private GuokrContract.View view;


    public GuokrPresenter(Context context, GuokrContract.View view) {
        this.context = context;
        this.view = view;
        view.setPresenter(this);
        model = new StringModelImpl(context);
    }


    @Override
    public void loadPosts(long data, boolean clearing) {

    }

    @Override
    public void refresh() {

    }

    @Override
    public void loadMore(long data) {

    }

    @Override
    public void startReading(int position) {

    }

    @Override
    public void feelLcuky() {

    }

    @Override
    public void start() {

    }
}
