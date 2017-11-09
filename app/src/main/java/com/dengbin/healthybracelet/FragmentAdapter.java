package com.dengbin.healthybracelet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends android.support.v4.app.FragmentPagerAdapter
{

    public FragmentAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        if (position == 0)
        {
            return new HealthyFragment();
        }
        else if (position == 1)
        {
            return new SportFragment();
        }
        else if (position == 2)
        {
            return new SleepFragment();
        }
        else
        {
            return new MyFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        if (position == 0)
        {
            return "健康";
        }
        else if (position == 1)
        {
            return "运动";
        }
        else if (position == 2)
        {
            return "睡眠";
        }
        else
        {
            return "我的";
        }
    }

    @Override
    public int getCount()
    {
        return 4;
    }
}
