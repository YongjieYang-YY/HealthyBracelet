package com.dengbin.healthybracelet;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HealthyFragment extends Fragment
{
    private Activity rootActivity;
    private View rootView;
    private ArrayList<Item> mList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        //确定根Activity和根View
        rootActivity = getActivity();
        rootView = inflater.inflate(R.layout.fragment_curve, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.curveTitle);
        textView.setText("脉搏波");

        //添加列表项
        ListAdd();

        //列表视图绑定适配器
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(new ItemAdapter(getActivity(), mList));

        return rootView;
    }

    @Override
    public void onStop()
    {
        super.onStop();
    }

    private void ListAdd()
    {
        mList.add(new Item("脉率："));
        mList.add(new Item("血压："));
        mList.add(new Item("血氧："));
        mList.add(new Item("呼吸："));

        for (int i = 0; i < 10; i++)
        {
            mList.add(new Item("！！健康！！"));
        }
    }
}
