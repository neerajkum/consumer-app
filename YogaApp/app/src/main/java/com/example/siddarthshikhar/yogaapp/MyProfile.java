package com.example.siddarthshikhar.yogaapp;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MyProfile extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        ActionBar bar=getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(true);
        bar.setDisplayShowCustomEnabled(true);
        bar.setDisplayShowTitleEnabled(false);
        LayoutInflater inflater=LayoutInflater.from(this);
        View v=inflater.inflate(R.layout.actionbarview, null);
        bar.setCustomView(v);
        TextView title=(TextView)v.findViewById(R.id.actbartitle);
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.action_bar_color)));
        title.setText("My Profile");

        TextView temp=(TextView)findViewById(R.id.my_profile_name);
        temp.setText(getSharedPreferences("profilename", 0).getString("name", null));
        temp=(TextView)findViewById(R.id.my_profile_age);
        temp.setText(getSharedPreferences("profileage",0).getString("age",null));
        temp=(TextView)findViewById(R.id.my_profile_gender);
        temp.setText(getSharedPreferences("profilegender",0).getString("gender",null));
        temp=(TextView)findViewById(R.id.my_profile_height);
        temp.setText(getSharedPreferences("profileheight",0).getString("height",null));
        temp=(TextView)findViewById(R.id.my_profile_weight);
        temp.setText(getSharedPreferences("profileweight",0).getString("weight",null));
        temp=(TextView)findViewById(R.id.my_profile_mobile);
        temp.setText(getSharedPreferences("profilephone",0).getString("phone",null));
        temp=(TextView)findViewById(R.id.my_profile_email);
        temp.setText(getSharedPreferences("profileemail",0).getString("email",null));
    }
    public void onClick(View v){
        int id=v.getId();
        if(id==R.id.my_profile_edit){
            startActivity(new Intent(this, EditProfileActivity.class));
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
