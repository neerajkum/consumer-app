package com.example.siddarthshikhar.yogaapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by INSPIRON 3521 on 6/17/2015.
 */

public class Activity2 extends Activity {
    ImageView v1;
    ImageView v2;
    ImageView v3;
    ImageView v4;
    ImageView v5;
    ImageView v6;
    ImageView v7;
    ImageView v8;
    ImageView v9;
    ImageView v10;
    ImageView v11;
    ImageView v12;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello2);
        v1 = (ImageView) findViewById(R.id.view0);
        v2 = (ImageView) findViewById(R.id.view1);
        v3 = (ImageView) findViewById(R.id.view2);
        v4 = (ImageView) findViewById(R.id.view3);
        v5 = (ImageView) findViewById(R.id.view4);
        v6 = (ImageView) findViewById(R.id.view5);
        v7 = (ImageView) findViewById(R.id.view6);
        v8 = (ImageView) findViewById(R.id.view7);
        v9 = (ImageView) findViewById(R.id.view8);
        v10 = (ImageView) findViewById(R.id.view9);
        v11 = (ImageView) findViewById(R.id.view10);
        v12 = (ImageView) findViewById(R.id.view11);


    }
}
