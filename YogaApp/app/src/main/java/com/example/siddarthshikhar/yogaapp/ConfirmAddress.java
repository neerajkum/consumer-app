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
import android.widget.EditText;
import android.widget.TextView;


public class ConfirmAddress extends ActionBarActivity {
    EditText editedAddress;
    TextView alreadySelectedAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_address);
        ActionBar bar=getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(true);
        bar.setDisplayShowCustomEnabled(true);
        bar.setDisplayShowTitleEnabled(false);
        LayoutInflater inflater=LayoutInflater.from(this);
        View v=inflater.inflate(R.layout.actionbarview, null);
        bar.setCustomView(v);
        TextView title=(TextView)v.findViewById(R.id.actbartitle);
        bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.action_bar_color)));
        title.setText("Confirm Address");


        Intent i=getIntent();
        Bundle b=i.getExtras();
        String s=b.getString("address");
        alreadySelectedAddress=(TextView)findViewById(R.id.already_selected_address);
        alreadySelectedAddress.setText(s);
        editedAddress=(EditText)findViewById(R.id.edit_selected_address);
    }
    public void onClick(View v){
        int id=v.getId();
        if(id==R.id.confirm_edited_address){
            Intent i=new Intent(this, BookClass.class);
            i.putExtra("address",editedAddress.getText().toString()+","+alreadySelectedAddress.getText().toString());
            startActivity(i);
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
