package com.wordpress.priyankvex.helixapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wordpress.priyankvex.helixapp.DataHelpers.EventsSeed;
import com.wordpress.priyankvex.helixapp.Model.Event;

import mehdi.sakout.fancybuttons.FancyButton;

/**
 * Created by @priyankvex on 17/2/16.
 * Activity to display the event info.
 */
public class EventActivity extends AppCompatActivity{

    private ImageView imageViewEvent;
    private TextView textViewSubTitle;
    private TextView textViewDetails;
    private TextView textViewLevelNote;
    private View viewLevels;
    private View viewLine4;
    private TextView textViewLevelOne;
    private TextView textViewLevelTwo;
    private TextView textViewLevelThree;
    private TextView textViewLevelFour;
    private FancyButton buttonMoreInfo;

    private Event mEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        int eventId = getIntent().getIntExtra("eventId", -1);
        mEvent = EventsSeed.getEventbyId(eventId);
        findViews();
        setData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_event, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_register){
            // start register activity
        }
        return super.onOptionsItemSelected(item);
    }

    private void findViews(){
        imageViewEvent = (ImageView) findViewById(R.id.imageViewEvent);
        textViewSubTitle = (TextView) findViewById(R.id.textViewSubTitle);
        textViewDetails = (TextView) findViewById(R.id.textViewEventInfo);
        textViewLevelNote = (TextView) findViewById(R.id.textViewLevelNote);
        viewLevels = findViewById(R.id.layoutLevels);
        viewLine4 = findViewById(R.id.line4);
        textViewLevelOne = (TextView) findViewById(R.id.textViewLevelOne);
        textViewLevelTwo = (TextView) findViewById(R.id.textViewLevelTwo);
        textViewLevelThree = (TextView) findViewById(R.id.textViewLevelThree);
        textViewLevelFour = (TextView) findViewById(R.id.textViewLevelFour);
        buttonMoreInfo = (FancyButton) findViewById(R.id.buttonMoreInfo);
    }

    private void setData(){
        imageViewEvent.setImageResource(mEvent.getEventImage());
        textViewSubTitle.setText(mEvent.getEventSubTitle());
        textViewDetails.setText(mEvent.getEventDetails());
        textViewLevelNote.setText(mEvent.getLevelNote());
        if (mEvent.getLevelOne().equals("")){
            // No level data
            viewLevels.setVisibility(View.GONE);
        }
        else{
            // Level data present
            textViewLevelOne.setText("Level 1\n" + mEvent.getLevelOne());
            textViewLevelTwo.setText("Level 2\n" + mEvent.getLevelTwo());
            textViewLevelThree.setText("Level 3\n" + mEvent.getLevelThree());
            if (mEvent.getLevelFour().equals("")){
                viewLine4.setVisibility(View.GONE);
                textViewLevelFour.setVisibility(View.GONE);
            }
            else{
                textViewLevelFour.setText("Level 4\n" + mEvent.getLevelFour());
            }
        }
        buttonMoreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the browser intent
            }
        });
    }

}
