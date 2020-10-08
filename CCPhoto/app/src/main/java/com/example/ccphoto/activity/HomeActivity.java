package com.example.ccphoto.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.ccphoto.R;
import com.example.ccphoto.adapter.MyPagerAdapter;
import com.example.ccphoto.entity.TabBarEntity;
import com.example.ccphoto.fragment.HomeFragment;
import com.example.ccphoto.fragment.MyFragment;
import com.example.ccphoto.fragment.NewsFragment;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

public class HomeActivity extends BaseActivity {

    private ViewPager viewPager;
    private CommonTabLayout tabBar;

    private String[] tabTitles = {"首页", "资讯", "我的"};
    private int[] tabUnSelectIcons = {R.mipmap.home_unselect, R.mipmap.collect_unselect, R.mipmap.my_unselect};
    private int[] tabSelectedIcons = {R.mipmap.home_selected, R.mipmap.collect_selected, R.mipmap.my_selected};

    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private ArrayList<CustomTabEntity> tabEntityList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int initLayout() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView() {
        this.viewPager = findViewById(R.id.viewpager);
        this.tabBar = findViewById(R.id.tabBar);
    }

    @Override
    protected void initData() {
        this.mFragments.add(new HomeFragment());
        this.mFragments.add(new NewsFragment());
        this.mFragments.add(new MyFragment());

        for (int i = 0; i < this.tabTitles.length; i++) {
            String title = this.tabTitles[i];
            this.tabEntityList.add(new TabBarEntity(tabTitles[i], tabSelectedIcons[i], tabUnSelectIcons[i]));
        }
        this.tabBar.setTabData(this.tabEntityList);
        this.tabBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });

//        this.viewPager.setOffscreenPageLimit(mFragments.size());
        this.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabBar.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), this.tabTitles, this.mFragments));
    }
}