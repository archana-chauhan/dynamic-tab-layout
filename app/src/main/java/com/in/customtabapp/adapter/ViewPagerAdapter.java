package com.in.customtabapp.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragmentArrayList;
    private ArrayList<String> tabArrayList;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior, ArrayList<Fragment> fragmentArrayList, ArrayList<String> tabArrayList) {
        super(fm, behavior);
        this.fragmentArrayList = fragmentArrayList;
        this.tabArrayList = tabArrayList;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabArrayList.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }
}
