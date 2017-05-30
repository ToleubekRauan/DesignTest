package com.example.rauan.designtest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Rauan on 030 30.05.2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{
    int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Slider2Fragment tab1 = new Slider2Fragment();
                return tab1;
            case 1:
                Slider1Fragment tab2 = new Slider1Fragment();
                return tab2;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
