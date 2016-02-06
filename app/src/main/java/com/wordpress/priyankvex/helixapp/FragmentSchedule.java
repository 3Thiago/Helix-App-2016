package com.wordpress.priyankvex.helixapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by priyank on 6/2/16.
 * Fragment to display event schedule
 */
public class FragmentSchedule extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_schedule, container, false);
        return rootView;
    }

}
