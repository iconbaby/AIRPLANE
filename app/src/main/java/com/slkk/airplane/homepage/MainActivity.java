package com.slkk.airplane.homepage;


import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.slkk.airplane.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private MainFragment mainFragment;
    private BookMarksFragment bookMarksFragment;
    private final String ACTION_BOOKMARKS = "com.slkk.homepage.BookMarksFragment";
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        if (!mainFragment.isAdded()) {
            getSupportFragmentManager().beginTransaction().add(R.id.layout_fragment, mainFragment).commit();
        }
        if (!bookMarksFragment.isAdded()) {
            getSupportFragmentManager().beginTransaction().add(R.id.layout_fragment, bookMarksFragment).commit();
        }

        String action = getIntent().getAction();
        if (action.equals(ACTION_BOOKMARKS)) {
            showBookmarksFragment();
        } else {
            showMainFragment();
        }
    }

    private void showMainFragment() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.show(mainFragment);
        fragmentTransaction.hide(bookMarksFragment);
        fragmentTransaction.commit();
        toolbar.setTitle(R.string.app_name);

    }

    private void showBookmarksFragment() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.show(bookMarksFragment);
        fragmentTransaction.hide(mainFragment);
        fragmentTransaction.commit();
        toolbar.setTitle(R.string.book_marks);

    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.open_drawer_toggle,
                R.string.close_drawer_toggle);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.nav_home:
                showMainFragment();
                break;
            case R.id.nav_bookmarks:
                showBookmarksFragment();
                break;
            case R.id.nav_change_theme:
                break;
            case R.id.nav_settings:
                break;

        }

        return false;
    }
}
