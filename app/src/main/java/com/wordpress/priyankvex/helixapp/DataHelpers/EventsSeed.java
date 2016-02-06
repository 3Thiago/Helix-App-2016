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
        event1.setEventId(1);
        event1.setEventName("App Development");
        event1.setEventImage(R.drawable.mobileapp);

        Event event2 = new Event();
        event2.setEventId(2);
        event2.setEventName("My Smart City Jabalpur");
        event2.setEventImage(R.drawable.smart_city);

        Event event3 = new Event();
        event3.setEventId(3);
        event3.setEventName("Build A Business");
        event3.setEventImage(R.drawable.startup);

        Event event4 = new Event();
        event4.setEventId(4);
        event4.setEventName("Round Table Conclave");
        event4.setEventImage(R.drawable.panel);

        Event event5 = new Event();
        event5.setEventId(5);
        event5.setEventName("Photography");
        event5.setEventImage(R.drawable.photography);

        Event event6 = new Event();
        event6.setEventId(6);
        event6.setEventName("Code Conclave");
        event6.setEventImage(R.drawable.code_event);

        Event event7 = new Event();
        event7.setEventId(7);
        event7.setEventName("Mock Campus");
        event7.setEventImage(R.drawable.job);

        Event event8 = new Event();
        event8.setEventId(8);
        event8.setEventName("Mock UPSC");
        event8.setEventImage(R.drawable.upsc);

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
