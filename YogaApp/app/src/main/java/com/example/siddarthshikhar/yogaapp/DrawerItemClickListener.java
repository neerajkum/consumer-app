package com.example.siddarthshikhar.yogaapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by INSPIRON 3521 on 6/23/2015.
 */
public class DrawerItemClickListener implements ListView.OnItemClickListener {
    Context c;
    DrawerLayout currDrawer;
    ListView currDrawerList;
    int compare;
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        switch (position){
            case 0:
                intent = new Intent(c, MyProfile.class);
                c.startActivity(intent);
                break;
            case 1:
                if(compare==1){
                    currDrawer.closeDrawer(currDrawerList);
                    break;
                }
                intent = new Intent(c, MapsActivity.class);
                c.startActivity(intent);
                break;
            case 2:
                if(compare==2){
                    currDrawer.closeDrawer(currDrawerList);
                    break;
                }
                intent = new Intent(c, MyScheduleActivity.class);
                c.startActivity(intent);
                break;
            case 3:
                intent = new Intent(c, ReportActivity.class);
                c.startActivity(intent);
                break;
            case 4:
                intent = new Intent(c, AboutUsActivity.class);
                c.startActivity(intent);
                break;
        }
    }
}
