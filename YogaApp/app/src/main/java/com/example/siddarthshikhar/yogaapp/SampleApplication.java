package com.example.siddarthshikhar.yogaapp;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by INSPIRON 3521 on 6/24/2015.
 */
public class SampleApplication extends Application {

    public void onCreate() {
        Parse.initialize(this, "vkDGBvv3XKgdtZ5SQTPQyqCvqHUfJOaRNIeSzeGd", "3Oqs5RqQC19Kg3qGvFzibDpQteNUXVRwq6NzYFRL");
    }
}
