package com.example.ccphoto.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import com.example.ccphoto.R;
import com.example.ccphoto.entity.TabBarEntity;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CommonTabLayout tabBar;

    private String[] tabTitles = {"首页", "资讯", "我的"};
    private int[] tabUnSelectIcons = {R.mipmap.home_unselect, R.mipmap.collect_unselect, R.mipmap.my_unselect};
    private int[] tabSelectedIcons = {R.mipmap.home_selected, R.mipmap.collect_selected, R.mipmap.my_selected};

    private ArrayList<Fragment> mainFragmentList = new ArrayList<>();
    private ArrayList<CustomTabEntity> tabEntityList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        this.viewPager = findViewById(R.id.viewpager);
        this.tabBar = findViewById(R.id.tabBar);

        for (int i = 0; i < this.tabTitles.length; i++) {
            String title = this.tabTitles[i];
            this.tabEntityList.add(new TabBarEntity(tabTitles[i], tabSelectedIcons[i], tabUnSelectIcons[i]));
        }
        this.tabBar.setTabData(this.tabEntityList);
    }
}