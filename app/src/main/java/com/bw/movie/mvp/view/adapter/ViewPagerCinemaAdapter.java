package com.bw.movie.mvp.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ViewPagerCinemaAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;

    public ViewPagerCinemaAdapter(FragmentManager fm) {
        super(fm);
    }

    public ViewPagerCinemaAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
