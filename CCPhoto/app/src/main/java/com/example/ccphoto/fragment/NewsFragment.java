package com.example.ccphoto.fragment;


import android.os.Handler;
import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ccphoto.R;
import com.example.ccphoto.adapter.NewsAdapter;
import com.example.ccphoto.api.Api;
import com.example.ccphoto.api.ApiConfig;
import com.example.ccphoto.api.CCCallBack;
import com.example.ccphoto.entity.NewsEntity;
import com.example.ccphoto.listener.OnItemClickListener;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NewsFragment extends BaseFragment {

    private RecyclerView recyclerView;
    private RefreshLayout refreshLayout;
    private NewsAdapter newsAdapter;
    private List<NewsEntity> datas = new ArrayList<>();
    private LinearLayoutManager linearLayoutManager;
    private int pageNum = 1;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    newsAdapter.setDatas(datas);
                    newsAdapter.notifyDataSetChanged();
                    break;
            }
        }
    };

    public static NewsFragment newsInstance() {
        NewsFragment fragment = new NewsFragment();
        return fragment;
    }

    @Override
    protected int initLayout() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initView() {
        recyclerView = mRootView.findViewById(R.id.recyclerView);
        refreshLayout = mRootView.findViewById(R.id.refreshLayout);
    }

    @Override
    protected void initData() {
        linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        newsAdapter = new NewsAdapter(getActivity());
        recyclerView.setAdapter(newsAdapter);
        newsAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

            }
        });

        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                pageNum = 1;
                fetchNewsList(true);
            }
        });

        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                pageNum++;
                fetchNewsList(false);
            }
        });

        fetchNewsList(true);
    }

    private void fetchNewsList(boolean isRefresh) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("page", pageNum);
        params.put("limit", 20);
        Api.config(ApiConfig.NEWS_LIST, params).postRequest(getActivity(), new CCCallBack() {
            @Override
            public void onSuccess(String res) {
                Log.e("newsList", res);
                if (isRefresh) {
                    refreshLayout.finishRefresh(true);
                } else {
                    refreshLayout.finishLoadMore(true);
                }
            }

            @Override
            public void onFailure(Exception e) {
                if (isRefresh) {
                    refreshLayout.finishRefresh(true);
                } else {
                    refreshLayout.finishLoadMore(true);
                }
            }
        });
    }
}