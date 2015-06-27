package com.example.siddarthshikhar.yogaapp;

/**
 * Created by INSPIRON 3521 on 6/18/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity {


    private static int splashInterval = 3000;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splashz);
        sp=getSharedPreferences("profilename", 0);
        editor=sp.edit();
        editor.putString("name", "Siddarth");
        editor.commit();
        sp=getSharedPreferences("profileage", 0);
        editor=sp.edit();
        editor.putString("age","19");
        editor.commit();
        sp=getSharedPreferences("profilegender", 0);
        editor=sp.edit();
        editor.putString("gender","Male");
        editor.commit();
        sp=getSharedPreferences("profileheight", 0);
        editor=sp.edit();
        editor.putString("height","180 cm");
        editor.commit();
        sp=getSharedPreferences("profileweight", 0);
        editor=sp.edit();
        editor.putString("weight","70 kgs");
        editor.commit();
        sp=getSharedPreferences("profilephone", 0);
        editor=sp.edit();
        editor.putString("phone","9968954953");
        editor.commit();
        sp=getSharedPreferences("profileemail", 0);
        editor=sp.edit();
        editor.putString("email","siddarthshikhar@gmail.com");
        editor.commit();


        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(Splash.this, SignUpOrLoginActivity.class);
                startActivity(i);



                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    };

}