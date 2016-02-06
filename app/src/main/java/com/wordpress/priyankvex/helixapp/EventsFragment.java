package com.wordpress.priyankvex.helixapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.wordpress.priyankvex.helixapp.DataHelpers.EventsSeed;

/**
 * Created by priyank on 6/2/16.
 * Fragment to show events
 */
public class EventsFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_events, container, false);
        GridView gridView = (GridView) rootView.findViewById(R.id.gridView);
        EventsGridAdapter adapter = new EventsGridAdapter(getActivity(), EventsSeed.getEvents());
        gridView.setAdapter(adapter);
        return rootView;
    }
}
