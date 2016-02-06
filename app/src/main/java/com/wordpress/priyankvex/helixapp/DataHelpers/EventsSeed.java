package com.wordpress.priyankvex.helixapp.DataHelpers;

import com.wordpress.priyankvex.helixapp.Model.Event;
import com.wordpress.priyankvex.helixapp.R;

import java.util.ArrayList;

/**
 * Created by priyank on 6/2/16.
 * Seed to generate events data.
 */
public class EventsSeed {

    /**
     * Returns list of events
     * @return array list of events
     */
    public static ArrayList<Event> getEvents(){
        ArrayList<Event> events = new ArrayList<>();

        // Adding the first event
        Event event1 = new Event();
        event1.setEventName("Event Name 1");
        event1.setEventImage(R.drawable.logo2);

        Event event2 = new Event();
        event2.setEventName("Event Name 2");
        event2.setEventImage(R.drawable.logo2);

        Event event3 = new Event();
        event3.setEventName("Event Name 3");
        event3.setEventImage(R.drawable.logo2);

        Event event4 = new Event();
        event4.setEventName("Event Name 4");
        event4.setEventImage(R.drawable.logo2);

        Event event5 = new Event();
        event5.setEventName("Event Name 5");
        event5.setEventImage(R.drawable.logo2);

        Event event6 = new Event();
        event6.setEventName("Event Name 6");
        event6.setEventImage(R.drawable.logo2);

        Event event7 = new Event();
        event7.setEventName("Event Name 7");
        event7.setEventImage(R.drawable.logo2);

        Event event8 = new Event();
        event8.setEventName("Event Name 8");
        event8.setEventImage(R.drawable.logo2);

        events.add(event1);
        events.add(event2);
        events.add(event3);
        events.add(event4);
        events.add(event5);
        events.add(event6);
        events.add(event7);
        events.add(event8);

        return events;
    }
}
