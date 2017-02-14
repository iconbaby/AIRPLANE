package com.slkk.airplane.homepage;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.slkk.airplane.R;
import com.slkk.airplane.adapter.MainPagerAdapter;

import java.util.Random;

/**
 * Created by skll on 2017/2/10.
 */

public class MainFragment extends Fragment {
    private Context context;
    private ZhihuDailyFragment zhihuDailyFragment;
    private GuokrFragment guokrFragment;
    private DoubanFragment doubanFragment;
    private ZhihuDailyPresenter zhihuDailyPresenter;
    private GuokrPresenter guokrPresenter;
    private DoubanPresenter doubanPresenter;
    private TabLayout tabLayout;
    private MainPagerAdapter mainPagerAdapter;


    public MainFragment() {

    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context = getActivity();
        if (savedInstanceState != null) {
            FragmentManager manager = getChildFragmentManager();
            zhihuDailyFragment = (ZhihuDailyFragment) manager.getFragment(savedInstanceState, "zhihu");
            guokrFragment = (GuokrFragment) manager.getFragment(savedInstanceState, "guokr");
            doubanFragment = (DoubanFragment) manager.getFragment(savedInstanceState, "douban");
        } else {
            zhihuDailyFragment = ZhihuDailyFragment.newInstanne();
            guokrFragment = GuokrFragment.newInstance();
            doubanFragment = DoubanFragment.newInstance();
        }
        zhihuDailyPresenter = new ZhihuDailyPresenter(context, zhihuDailyFragment);
        guokrPresenter = new GuokrPresenter(context, guokrFragment);
        doubanPresenter = new DoubanPresenter(context, doubanFragment);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        initViews(view);

        setHasOptionsMenu(true);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);
                if (tab.getPosition() == 1) {
                    fab.hide();
                } else {
                    fab.show();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return view;
    }

    private void initViews(View view) {
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);


        ViewPager viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        viewPager.setOffscreenPageLimit(3);

        mainPagerAdapter = new MainPagerAdapter(getChildFragmentManager(), context, zhihuDailyFragment, guokrFragment, doubanFragment);

        viewPager.setAdapter(mainPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_feel_lucky) {
            feelLucky();
        }
        return true;
    }

    private void feelLucky() {
        Random random = new Random();
        int type = random.nextInt(3);
        switch (type) {
            case 0:
                zhihuDailyPresenter.feelLcuky();
                break;
            case 1:
                guokrPresenter.feelLcuky();
                break;
            default:
                doubanPresenter.feelLcuky();
                break;
        }
    }

    public MainPagerAdapter getAdapter() {
        return mainPagerAdapter;
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        FragmentManager manager = getChildFragmentManager();
        manager.putFragment(outState, "zhihu", zhihuDailyFragment);
        manager.putFragment(outState, "guokr", guokrFragment);
        manager.putFragment(outState, "douban", doubanFragment);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.main, menu);
    }
}
