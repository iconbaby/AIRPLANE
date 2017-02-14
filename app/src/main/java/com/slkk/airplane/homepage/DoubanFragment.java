package com.slkk.airplane.homepage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.slkk.airplane.bean.DoubanMomentNews;

import java.util.ArrayList;
import java.util.zip.DeflaterOutputStream;

/**
 * Created by skll on 2017/2/9.
 */

public class DoubanFragment extends Fragment implements DoubanContact.View {
    private DoubanContact.Presenter presenter;
    public DoubanFragment() {
    }

    public static DoubanFragment newInstance() {
        return new DoubanFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
    public void showResults(ArrayList<DoubanMomentNews.posts> list) {

    }

    @Override
    public void showPickDialog() {

    }

    @Override
    public void setPresenter(DoubanContact.Presenter presenter) {
        if (presenter != null) {
            this.presenter = presenter;
        }
    }

    @Override
    public void initViews(View view) {

    }
}
