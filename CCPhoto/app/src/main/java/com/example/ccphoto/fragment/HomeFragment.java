package com.example.ccphoto.fragment;

import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.ccphoto.R;
import com.example.ccphoto.adapter.HomeAdapter;
import com.example.ccphoto.api.Api;
import com.example.ccphoto.api.ApiConfig;
import com.example.ccphoto.api.CCCallBack;
import com.example.ccphoto.entity.CategoryEntity;
import com.example.ccphoto.entity.VideoCategoryResponse;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeFragment extends BaseFragment {

    private ViewPager viewPager;
    private SlidingTabLayout slidingTabLayout;

    private String[] mTitles;
    private ArrayList<Fragment> mFragment = new ArrayList<>();


    public HomeFragment() {
    }

    public static HomeFragment newInstance() {
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }

    @Override
    protected int initLayout() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {
        viewPager = mRootView.findViewById(R.id.fixedViewPaper);
        slidingTabLayout = mRootView.findViewById(R.id.slidingTabLayout);
    }

    @Override
    protected void initData() {
        getVideoCategoryList();
    }

    private void getVideoCategoryList() {
        HashMap<String, Object> params = new HashMap<>();
        Api.config(ApiConfig.VIDEO_CATEGORY_LIST, params).getRequest(getActivity(), new CCCallBack() {
            @Override
            public void onSuccess(String res) {

                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.e("适配分类列表", res);
                        VideoCategoryResponse response = new Gson().fromJson(res, VideoCategoryResponse.class);
                        if (response != null && response.getCode() == 0) {
                            List<CategoryEntity> cateList = response.getPage().getList();
                            if (cateList != null && cateList.size() > 0) {
                                mTitles = new String[cateList.size()];
                                for (int i = 0; i < cateList.size(); i++) {
                                    CategoryEntity cateItem = cateList.get(i);
                                    mTitles[i] = cateItem.getCategoryName();
                                    mFragment.add(VideoFragment.newInstance(cateItem.getCategoryId()));
                                }
                                viewPager.setOffscreenPageLimit(mFragment.size());
                                viewPager.setAdapter(new HomeAdapter(getFragmentManager(), mTitles, mFragment));
                                slidingTabLayout.setViewPager(viewPager);
                            }
                        }
                    }
                });
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }
}
