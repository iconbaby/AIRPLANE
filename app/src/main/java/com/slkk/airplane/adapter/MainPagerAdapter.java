package com.slkk.airplane.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.slkk.airplane.homepage.DoubanContact;
import com.slkk.airplane.homepage.DoubanFragment;
import com.slkk.airplane.homepage.GuokrFragment;
import com.slkk.airplane.homepage.ZhihuDailyFragment;

/**
 * Created by dell on 2017/2/14.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {
    private String[] titles;
    private final Context context;

    private ZhihuDailyFragment zhihuDailyFragment;
    private GuokrFragment guokrFragment;
    private DoubanFragment doubanFragment;

    public ZhihuDailyFragment getZhihuDailyFragment() {
        return zhihuDailyFragment;
    }

    public GuokrFragment getGuokrFragment() {
        return guokrFragment;
    }

    public DoubanFragment getDoubanFragment() {
        return doubanFragment;
    }

    public MainPagerAdapter(FragmentManager fm, Context context,
                            ZhihuDailyFragment zhihuDailyFragment,
                            GuokrFragment guokrFragment,
                            DoubanFragment doubanFragment) {
        super(fm);
        this.context = context;
        titles = new String[]{"知乎日报", "果壳精选", "豆瓣一刻"};
        this.zhihuDailyFragment = zhihuDailyFragment;
        this.guokrFragment = guokrFragment;
        this.doubanFragment = doubanFragment;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return guokrFragment;
        } else if (position == 2) {
            return doubanFragment;
        }

        return zhihuDailyFragment;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
