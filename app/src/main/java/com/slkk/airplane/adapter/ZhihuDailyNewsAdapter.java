package com.slkk.airplane.adapter;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.slkk.airplane.bean.ZhihuDailyNews;
import com.slkk.airplane.interfaze.OnRecyclerViewOnClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/2/15.
 */

public class ZhihuDailyNewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final Context context;
    private final LayoutInflater inflater;
    private List<ZhihuDailyNews.Question> list = new ArrayList<ZhihuDailyNews.Question>();

    private static final int TYPE_NORMAL = 0;
    private static final int TYPE_FOOTER =1;
    public ZhihuDailyNewsAdapter(Context context, List<ZhihuDailyNews.Question> list) {
        this.context = context;
        this.list = list;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE_NORMAL:
                return new Nor
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void setItemClickListener(OnRecyclerViewOnClickListener listener) {

    }

    public class NormalViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public NormalViewHolder(View itemView, OnRecyclerViewOnClickListener listener) {
            itemView.findViewById(R.id.)
            super(itemView);

        }

        @Override
        public void onClick(View view) {

        }
    }
}
