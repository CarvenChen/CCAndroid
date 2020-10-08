package com.example.ccphoto.fragment;


import com.example.ccphoto.R;
import com.flyco.tablayout.SlidingTabLayout;

public class HomeFragment extends BaseFragment {

    private androidx.viewpager.widget.ViewPager viewPager;
    private SlidingTabLayout slidingTabLayout;

    public HomeFragment() {
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    protected int initLayout() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {
        this.viewPager = mRootView.findViewById(R.id.fixedViewPaper);
        this.slidingTabLayout = mRootView.findViewById(R.id.slidingTabLayout);
    }

    @Override
    protected void initData() {

    }
}