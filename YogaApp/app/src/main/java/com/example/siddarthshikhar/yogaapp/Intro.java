package com.example.siddarthshikhar.yogaapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by INSPIRON 3521 on 6/21/2015.
 */
public class Intro extends Activity {

        ImageView v1;


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.intro);
            v1 = (ImageView) findViewById(R.id.view0);



        }

}
