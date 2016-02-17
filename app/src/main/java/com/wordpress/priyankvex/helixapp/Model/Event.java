package com.wordpress.priyankvex.helixapp.Model;

/**
 * Created by priyank on 6/2/16.
 * Model to store event info.
 */
public class Event {

    private String eventName;
    private int eventImage;
    private int eventId;
    private String eventSubTitle;
    private String eventDetails;
    private String levelNote;
    private String levelOne;
    private String levelTwo;
    private String levelThree;
    private String levelFour;
    private String registrationLink;
    private String moreInfoLink;

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

    public String getEventSubTitle() {
        return eventSubTitle;
    }

    public void setEventSubTitle(String eventSubTitle) {
        this.eventSubTitle = eventSubTitle;
    }

    public String getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
    }

    public String getLevelNote() {
        return levelNote;
    }

    public void setLevelNote(String levelNote) {
        this.levelNote = levelNote;
    }

    public String getLevelOne() {
        return levelOne;
    }

    public void setLevelOne(String levelOne) {
        this.levelOne = levelOne;
    }

    public String getLevelTwo() {
        return levelTwo;
    }

    public void setLevelTwo(String levelTwo) {
        this.levelTwo = levelTwo;
    }

    public String getLevelThree() {
        return levelThree;
    }

    public void setLevelThree(String levelThree) {
        this.levelThree = levelThree;
    }

    public String getRegistrationLink() {
        return registrationLink;
    }

    public void setRegistrationLink(String registrationLink) {
        this.registrationLink = registrationLink;
    }

    public String getMoreInfoLink() {
        return moreInfoLink;
    }

    public void setMoreInfoLink(String moreInfoLink) {
        this.moreInfoLink = moreInfoLink;
    }

    public String getLevelFour() {
        return levelFour;
    }

    public void setLevelFour(String levelFour) {
        this.levelFour = levelFour;
    }
}
