package com.example.ccphoto.fragment;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ccphoto.R;
import com.scwang.smartrefresh.layout.api.RefreshLayout;

import java.util.ArrayList;
import java.util.List;

public class VideoFragment extends BaseFragment {

    private int categoryId;
    private RecyclerView recyclerView;

    private RefreshLayout refreshLayout;
    private int pageNum = 1;

    private List datas = new ArrayList<>();


    public VideoFragment() {
    }

    public static VideoFragment newInstance(int categoryId) {
        VideoFragment fragment = new VideoFragment();
        fragment.categoryId = categoryId;
        return fragment;
    }

    @Override
    protected int initLayout() {
        return R.layout.fragment_video;
    }

    @Override
    protected void initView() {
        this.refreshLayout = mRootView.findViewById(R.id.refreshLayout);
        this.recyclerView = mRootView.findViewById(R.id.recyclerView);
    }

    @Override
    protected void initData() {

    }
}