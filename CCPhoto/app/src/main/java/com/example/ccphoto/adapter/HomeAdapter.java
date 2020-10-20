package com.example.ccphoto.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class HomeAdapter extends FragmentPagerAdapter {
    private String[] mTitles;
    private ArrayList<Fragment> mFragment;

    public HomeAdapter(@NonNull FragmentManager fm, String[] titles, ArrayList<Fragment> fragments) {
        super(fm);

        this.mTitles = titles;
        this.mFragment = fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragment.get(position);
    }

    @Override
    public int getCount() {
        return mFragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
