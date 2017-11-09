package com.dengbin.healthybracelet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item>
{
    public ItemAdapter(Context context, List<Item> itemList)
    {
        // 因为textView为自定义,故不需要布局资源ID,故省略textViewResourceId(理论上可以为任意值，故传入0)
        super(context, 0, itemList);
    }

    @Override
    // 提供列表项视图
    public View getView(int position, View convertView, ViewGroup parent)
    {

        // 获得当前位置word数据
        Item currentItem = getItem(position);

        // 重复使用的现有列表项视图
        View listItemView = convertView;
        // 若不存在，则从指定的layout布局膨胀创建新的列表项视图
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.adapter, parent, false);
        }

        // 更新文本
        TextView textView = (TextView) listItemView.findViewById(R.id.itemText);
        textView.setText(currentItem.getText());


        return listItemView;
    }

}

