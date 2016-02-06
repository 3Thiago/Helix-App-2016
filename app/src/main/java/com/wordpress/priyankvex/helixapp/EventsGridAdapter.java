package com.wordpress.priyankvex.helixapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wordpress.priyankvex.helixapp.Model.Event;

import java.util.ArrayList;

/**
 * Created by priyank on 6/2/16.
 */
public class EventsGridAdapter extends BaseAdapter{

    Context mContext;
    ArrayList<Event> mEvents;
    LayoutInflater mInflater;

    public EventsGridAdapter(Context context, ArrayList<Event> events) {

        this.mContext = context;
        this.mEvents = events;
        this.mInflater = (LayoutInflater)context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mEvents.size();
    }

    @Override
    public Object getItem(int position) {
        return mEvents.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder
    {
        TextView textViewEvent;
        ImageView imageViewEvent;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        Event event = mEvents.get(position);
        ViewHolder holder;

        if (convertView == null){
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item_events_grid, parent, false);
            holder.imageViewEvent = (ImageView) convertView.findViewById(R.id.imageViewEvent);
            holder.textViewEvent = (TextView) convertView.findViewById(R.id.textViewEvent);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder)convertView.getTag();
        }

        holder.textViewEvent.setText(event.getEventName());
        holder.imageViewEvent.setImageResource(event.getEventImage());

        return convertView;
    }

}
