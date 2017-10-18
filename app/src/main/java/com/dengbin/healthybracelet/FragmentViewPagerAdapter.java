package com.dengbin.healthybracelet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentViewPagerAdapter extends FragmentPagerAdapter
{

    public FragmentViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        if (position == 0)
        {
            return new PulseWaveFragment();
        }
        else if (position == 1)
        {
            return new HeartRateFragment();
        }
        else if (position == 2)
        {
            return new BloodPressureFragment();
        }
        else
        {
            return new BloodOxygenFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        if (position == 0)
        {
            return "脉搏波";
        }
        else if (position == 1)
        {
            return "心率";
        }
        else if (position == 2)
        {
            return "血压";
        }
        else
        {
            return "血氧";
        }
    }

    @Override
    public int getCount()
    {
        return 4;
    }
}
