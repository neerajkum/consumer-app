package com.example.siddarthshikhar.yogaapp;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class BookingConfirmation extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirmation);
        ActionBar bar=getSupportActionBar();
        bar.setDisplayShowCustomEnabled(true);
        bar.setDisplayShowTitleEnabled(false);
        LayoutInflater inflater=LayoutInflater.from(this);
        View v=inflater.inflate(R.layout.actionbarview, null);
        bar.setCustomView(v);
        TextView title=(TextView)v.findViewById(R.id.actbartitle);
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.action_bar_color)));
        title.setText("Booking Confirmation");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Create an Intent that will start the Menu-Activity.
                Intent mainIntent = new Intent(BookingConfirmation.this, MapsActivity.class);
                BookingConfirmation.this.startActivity(mainIntent);
                BookingConfirmation.this.finish();
            }
        }, 15000);
        counter=0;
    }
    int counter;
    public void onClick(View v){
        int id=v.getId();
        if(id==R.id.booking_confirm_outer_layout){
            if(counter==2){
                Intent mainIntent=new Intent(BookingConfirmation.this, MapsActivity.class);
                BookingConfirmation.this.startActivity(mainIntent);
                BookingConfirmation.this.finish();
            }
            else
                counter++;
        }
    }
}
