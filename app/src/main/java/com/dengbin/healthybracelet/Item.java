package com.dengbin.healthybracelet;

public class Item
{
    private String mText;
    private int mDrawableResourceID;

    public Item(String tText, int tDrawableResourceID)
    {
        mText = tText;
        mDrawableResourceID = tDrawableResourceID;
    }

    public String getText()
    {
        return mText;
    }

    public int getDrawableResourceID()
    {
        return mDrawableResourceID;
    }
}
