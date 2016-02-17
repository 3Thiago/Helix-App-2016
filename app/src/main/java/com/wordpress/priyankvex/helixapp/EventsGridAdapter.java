package com.wordpress.priyankvex.helixapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.wordpress.priyankvex.helixapp.Model.Event;

import java.util.ArrayList;

/**
 * Created by priyank on 6/2/16.
 */
public class EventsGridAdapter extends BaseAdapter{

    Context mContext;
    ArrayList<Event> mEvents;
    LayoutInflater mInflater;
    private DisplayImageOptions options;

    public EventsGridAdapter(Context context, ArrayList<Event> events) {

        this.mContext = context;
        this.mEvents = events;
        this.mInflater = (LayoutInflater)context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.spinner)
                .showImageForEmptyUri(R.drawable.spinner)
                .showImageOnFail(R.drawable.spinner)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .considerExifParams(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();
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
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder)convertView.getTag();
        }

        holder.textViewEvent = (TextView) convertView.findViewById(R.id.textViewEvent);
        holder.textViewEvent.setText(event.getEventName());
        ImageLoader.getInstance()
                .displayImage("drawable://" + event.getEventImage(), holder.imageViewEvent, options);

        return convertView;
    }

}
