package com.learnandroid;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(ApplicationName.APPLICATION_NAME);

        //called when the activity is first created
    }
    @Override
    protected void onStart(){
        super.onStart();

        //called when the activity is becoming visible

    }
    @Override
    protected void onResume(){
        super.onResume();

        //called when the activity will start interacting with the user

    }

    @Override
    protected void onPause(){
        super.onPause();

        //called when an activity is being paused

    }

    @Override
    protected void onStop(){
        super.onStop();

        //called when the activity is being stopped and is no loger visible to the user

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        //called when an activity being destroyed

    }






}
