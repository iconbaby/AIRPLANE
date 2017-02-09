package com.slkk.airplane.homepage;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.slkk.airplane.bean.ZhihuDailyNews;

import java.util.ArrayList;

/**
 * Created by dell on 2017/2/9.
 */

public class ZhihuDailyFragment  extends Fragment implements ZhihuDailyContract.View {
    public ZhihuDailyFragment() {}
    public static ZhihuDailyFragment newInstanne(){
        return new ZhihuDailyFragment();
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showResults(ArrayList<ZhihuDailyNews.Question> list) {

    }

    @Override
    public void showPickDialog() {

    }

    @Override
    public void setPresenter(ZhihuDailyContract.Presenter presenter) {

    }

    @Override
    public void initViews(View view) {

    }
}
