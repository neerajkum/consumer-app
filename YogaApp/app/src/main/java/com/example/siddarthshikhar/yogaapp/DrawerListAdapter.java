package com.example.siddarthshikhar.yogaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by INSPIRON 3521 on 6/23/2015.
 */
public class DrawerListAdapter extends ArrayAdapter<String> {
    Context context;
    LayoutInflater l;
    String[] list;

    public DrawerListAdapter(Context context, int resource, String[] objects,LayoutInflater l) {
        super(context, resource,objects);
        this.context=context;
        this.list=objects;
        this.l=l;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if(v==null)
            v=l.inflate(R.layout.drawer_individual_item,null);
        TextView drawIndItem=(TextView)v.findViewById(R.id.drawer_item_text);
        drawIndItem.setText(list[position]);
        ImageView temp=(ImageView)v.findViewById(R.id.drawer_item_icon);
        if(position==0)
            temp.setImageResource(R.drawable.myprofile);
        if(position==1)
            temp.setImageResource(R.drawable.bookclasssss);
        if(position==2)
            temp.setImageResource(R.drawable.scedule);
        if(position==3)
            temp.setImageResource(R.drawable.report);
        if(position==4)
            temp.setImageResource(R.drawable.aboutus);
        return v;
    }
}
