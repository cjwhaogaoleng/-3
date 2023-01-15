package com.example.myupapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private List<Bean> upData;
    private Context context;

    public MyAdapter(List<Bean> upData, Context context) {
        this.upData = upData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return upData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) {
            convertView=LayoutInflater.from(context).inflate(R.layout.updata_item_headandname,parent,false);
        }
        TextView textView=convertView.findViewById(R.id.tv);
        ImageView imageView = convertView.findViewById(R.id.iv);
        textView.setText(upData.get(position).getName());

        //imageView.setImageResource(R.drawable.up_head);



        Log.e("leo", "getView: "+position );
        return convertView;

    }
}
