package com.wordpress.priyankvex.helixapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.wordpress.priyankvex.helixapp.DataHelpers.EventsSeed;
import com.wordpress.priyankvex.helixapp.Model.Event;

import java.util.ArrayList;

/**
 * Created by priyank on 6/2/16.
 * Fragment to show events
 */
public class EventsFragment extends Fragment{

    private GridView gridViewEvents;
    private ArrayList<Event> mEvents;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_events, container, false);
        gridViewEvents = (GridView) rootView.findViewById(R.id.gridView);
        mEvents = EventsSeed.getEvents();
        EventsGridAdapter adapter = new EventsGridAdapter(getActivity(), mEvents);
        gridViewEvents.setAdapter(adapter);
        gridViewEvents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), EventActivity.class);
                i.putExtra("eventCode", position);
                startActivity(i);
            }
        });
        return rootView;
    }
}
