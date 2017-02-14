package com.slkk.airplane.homepage;

import android.content.Context;

import com.slkk.airplane.bean.StringModelImpl;

/**
 * Created by skll on 2017/2/9.
 */

public class DoubanPresenter implements DoubanContact.Presenter {

    private Context context;
    private StringModelImpl model;
    private DoubanContact.View view;

    public DoubanPresenter(Context context, DoubanContact.View view) {
        this.context = context;
        this.view = view;
        view.setPresenter(this);
        model = new StringModelImpl(context);

    }
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
