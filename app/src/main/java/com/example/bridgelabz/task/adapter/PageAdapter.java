package com.example.bridgelabz.task.adapter;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by bridgelabz on 14/11/16.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    List<String> title;

    public PageAdapter(FragmentManager fm, List<String> title) {
        super(fm);
        this.title = title;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return MyFragment.newInstance(position,title.get(position));
    }



    @Override
    public int getCount() {
        return title.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "page"+position;
    }
}
