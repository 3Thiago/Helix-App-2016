package com.wordpress.priyankvex.helixapp.Model;

/**
 * Created by priyank on 6/2/16.
 * Model to store event info.
 */
public class Event {

    private String eventName;
    private int eventImage;
    private int eventId;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getEventImage() {
        return eventImage;
    }

    public void setEventImage(int eventImage) {
        this.eventImage = eventImage;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
}
