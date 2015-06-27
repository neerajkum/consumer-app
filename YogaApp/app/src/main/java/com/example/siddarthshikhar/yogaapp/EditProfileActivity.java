package com.example.siddarthshikhar.yogaapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class EditProfileActivity extends ActionBarActivity {

    SharedPreferences sp;
    SharedPreferences.Editor editor;
    EditText name,age,gender,height,weight,phone,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        ActionBar bar=getSupportActionBar();
        bar.setDisplayShowCustomEnabled(true);
        bar.setDisplayShowTitleEnabled(false);
        LayoutInflater inflater=LayoutInflater.from(this);
        View v=inflater.inflate(R.layout.actionbarview, null);
        bar.setCustomView(v);
        TextView title=(TextView)v.findViewById(R.id.actbartitle);
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.action_bar_color)));
        title.setText("Edit Profile");

        name=(EditText)findViewById(R.id.edit_profile_name);
        name.setText(getSharedPreferences("profilename", 0).getString("name", null));
        age=(EditText)findViewById(R.id.edit_profile_age);
        age.setText(getSharedPreferences("profileage", 0).getString("age", null));
        gender=(EditText)findViewById(R.id.edit_profile_gender);
        gender.setText(getSharedPreferences("profilegender", 0).getString("gender", null));
        height=(EditText)findViewById(R.id.edit_profile_height);
        height.setText(getSharedPreferences("profileheight", 0).getString("height", null));
        weight=(EditText)findViewById(R.id.edit_profile_weight);
        weight.setText(getSharedPreferences("profileweight",0).getString("weight",null));
        phone=(EditText)findViewById(R.id.edit_profile_phone);
        phone.setText(getSharedPreferences("profilephone",0).getString("phone",null));
        email=(EditText)findViewById(R.id.edit_profile_email);
        email.setText(getSharedPreferences("profileemail",0).getString("email",null));
    }
    public void onClick(View v){
        int id=v.getId();
        if(id==R.id.edit_profile_save){
            sp=getSharedPreferences("profilename", 0);
            editor=sp.edit();
            editor.putString("name",name.getText().toString());
            editor.commit();
            sp=getSharedPreferences("profileage", 0);
            editor=sp.edit();
            editor.putString("age",age.getText().toString());
            editor.commit();
            sp=getSharedPreferences("profilegender", 0);
            editor=sp.edit();
            editor.putString("gender",gender.getText().toString());
            editor.commit();
            sp=getSharedPreferences("profileheight", 0);
            editor=sp.edit();
            editor.putString("height",height.getText().toString());
            editor.commit();
            sp=getSharedPreferences("profileweight", 0);
            editor=sp.edit();
            editor.putString("weight",weight.getText().toString());
            editor.commit();
            sp=getSharedPreferences("profilephone", 0);
            editor=sp.edit();
            editor.putString("phone",phone.getText().toString());
            editor.commit();
            sp=getSharedPreferences("profileemail", 0);
            editor=sp.edit();
            editor.putString("email",email.getText().toString());
            editor.commit();
        }
        else if(id==R.id.edit_profile_discard){
        }
        startActivity(new Intent(this, MapsActivity.class));
    }
}
