package com.in.customtabapp.activites;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.in.customtabapp.R;
import com.in.customtabapp.adapter.ViewPagerAdapter;
import com.in.customtabapp.fragments.FragmentTab1;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ArrayList<String> dynamicTabList = new ArrayList<>();
    ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        dynamicTabList.addAll(Arrays.asList("Applied", "Shortlisted", "Approved", "Rejected"));
        for (int i = 0; i < dynamicTabList.size(); i++) {
            fragmentArrayList.add(new FragmentTab1(dynamicTabList.get(i)));
        }
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, fragmentArrayList, dynamicTabList);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setTabIndicatorFullWidth(true);
        tabLayout.setTabTextColors(Color.parseColor("#3c3c3c"), Color.parseColor("#000000"));
        tabLayout.setupWithViewPager(viewPager, true);
    }
}