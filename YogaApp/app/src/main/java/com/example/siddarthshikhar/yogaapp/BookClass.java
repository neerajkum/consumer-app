package com.example.siddarthshikhar.yogaapp;

import android.app.DialogFragment;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class BookClass extends ActionBarActivity implements setTimeFragment.timePicked,DayPickerDialog.dayPicked{
    ArrayList mSelectedItems;
    TextView starttime,endtime,sunday,monday,tuesday,wednesday,thursday,friday,saturday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_class);
        mSelectedItems=new ArrayList();
        ActionBar bar=getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(true);
        bar.setDisplayShowCustomEnabled(true);
        bar.setDisplayShowTitleEnabled(false);
        LayoutInflater inflater=LayoutInflater.from(this);
        View v=inflater.inflate(R.layout.actionbarview, null);
        bar.setCustomView(v);
        TextView title=(TextView)v.findViewById(R.id.actbartitle);
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.action_bar_color)));
        title.setText("Book Class");
        starttime=(TextView)findViewById(R.id.book_class_start_time);
        endtime=(TextView)findViewById(R.id.book_class_end_time);
        sunday=(TextView)findViewById(R.id.sunday);
        monday=(TextView)findViewById(R.id.monday);
        tuesday=(TextView)findViewById(R.id.tuesday);
        wednesday=(TextView)findViewById(R.id.wednesday);
        thursday=(TextView)findViewById(R.id.thursday);
        friday=(TextView)findViewById(R.id.friday);
        saturday=(TextView)findViewById(R.id.saturday);

        EditText finalAdd=(EditText)findViewById(R.id.final_address);
        finalAdd.setText(getIntent().getExtras().getString("address"));
    }
    public void populateSetTime(int hourOfDay, int minute) {
        String hours="",mins="";
        if(minute!=0 && minute!=15 && minute!=30 && minute!=45){
            if(minute<=7)
                minute=0;
            else if(minute>=8 && minute<=22)
                minute=15;
            else if(minute>=23 && minute<=37)
                minute=30;
            else if(minute>=38 && minute<=52)
                minute=45;
            else{
                if(hourOfDay==23)
                    minute=45;
                else {
                    hourOfDay++;
                    minute = 0;
                }
            }
            Toast.makeText(this,"Time rounded off to nearest suitable time",Toast.LENGTH_SHORT).show();
        }
        if(hourOfDay<10)
            hours+="0"+hourOfDay;
        else
            hours+=hourOfDay;
        if(minute<10)
            mins+="0"+minute;
        else
            mins+=minute;
        starttime.setText("Starts At "+hours + ":" + mins+" hrs");
        hourOfDay++;
        hours="";
        if(hourOfDay<10)
            hours+="0"+hourOfDay;
        else
            hours+=hourOfDay;
        endtime.setText("Ends At "+hours + ":" + mins+" hrs");
    }
    public void onClick(View v){
        int id=v.getId();
        if(id==R.id.book_class_day_picker){
            DayPickerDialog newFragment=new DayPickerDialog();
            newFragment.listener=this;
            newFragment.temp=mSelectedItems;
            newFragment.show(getFragmentManager(),"DayPicker");
        }
        else if(id==R.id.book_class_start_time){
            DialogFragment newFragment = new setTimeFragment();
            setTimeFragment temp=(setTimeFragment)newFragment;
            temp.listener=this;
            newFragment.show(getFragmentManager(), "TimePicker");
        }
        else if(id==R.id.book_class_confirm){
            startActivity(new Intent(this, BookingConfirmation.class));
        }
    }
    @Override
    public void populatedays(ArrayList selectedItems) {
        mSelectedItems=new ArrayList();
        this.mSelectedItems=selectedItems;
        sunday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglewhitebackgr));
        monday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglewhitebackgr));
        tuesday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglewhitebackgr));
        wednesday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglewhitebackgr));
        thursday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglewhitebackgr));
        friday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglewhitebackgr));
        saturday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglewhitebackgr));
        for(int i=0;i<selectedItems.size();i++){
            int x=(Integer)selectedItems.get(i);
            switch (x){
                case 0:
                    sunday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebluebackgr));
                    break;
                case 1:
                    monday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebluebackgr));
                    break;
                case 2:
                    tuesday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebluebackgr));
                    break;
                case 3:
                    wednesday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebluebackgr));
                    break;
                case 4:
                    thursday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebluebackgr));
                    break;
                case 5:
                    friday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebluebackgr));
                    break;
                case 6:
                    saturday.setBackgroundDrawable(getResources().getDrawable(R.drawable.rectanglebluebackgr));
                    break;
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
