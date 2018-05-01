package com.example.ca.mycharlotte3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class EventsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_screen);
    }

    public void send_EventScreen (View view){

        Intent EventsScreen = new Intent(this,EventsScreen.class);
        startActivity(EventsScreen);
    }

}
