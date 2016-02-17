package com.wordpress.priyankvex.helixapp.DataHelpers;

import com.wordpress.priyankvex.helixapp.Model.Event;
import com.wordpress.priyankvex.helixapp.R;

import java.util.ArrayList;

/**
 * Created by priyank on 6/2/16.
 * Seed to generate events data.
 */
public class EventsSeed {


    public static String registerationLink = "https://docs.google.com/forms/d/16oJHtBey5Jnu6C0_06rayXXNl0dY-YshMC0CnIgMncM/formResponse";
    public static Event event1;
    public static Event event2;
    public static Event event3;
    public static Event event4;
    public static Event event5;
    public static Event event6;
    public static Event event7;
    public static Event event8;

    /**
     * Returns list of events
     * @return array list of events
     */
    public static ArrayList<Event> getEvents(){
        ArrayList<Event> events = new ArrayList<>();

        // Adding the first event
        event1 = new Event();
        event1.setEventId(1);
        event1.setEventName("App Development");
        event1.setEventImage(R.drawable.mobileapp);
        event1.setEventSubTitle("Bring out the creator in you");
        event1.setEventDetails("This is an application development competition. Participants can have individual participation or group participation. The winner will be decided by beta testing of the app, i.e., the participant(s) will have to promote his/her/their app so that people install it on their devices and give their reviews or rating.");
        event1.setLevelNote("Level Registrations will close on the day before the starting of level 1");
        event1.setMoreInfoLink("https://drive.google.com/file/d/0B5iiTEqAQuR5Z1IwTUotQmZmODA");
        event1.setLevelOne("Submission of SDLC and judgment- 22th feb.");
        event1.setLevelTwo("Live demo of working of the App(terminal run) - 1st March.");
        event1.setLevelThree("Live demo of working of the App(terminal run) - 1st March.");
        event1.setLevelFour("");

        event2 = new Event();
        event2.setEventId(2);
        event2.setEventName("My Smart City Jabalpur");
        event2.setEventImage(R.drawable.smart_city);
        event2.setEventSubTitle("Your ideas. Your smart city");
        event2.setEventDetails("A platform for the aspiring engineers to paint the canvas of their city with their innovative ideas. Ideas, which can promote economic opportunities, better governance and provide physical, social & economical infrastructure in Jabalpur");
        event2.setLevelNote("Level Registrations will close on the day before the starting of level 1");
        event2.setMoreInfoLink("https://drive.google.com/file/d/0B5iiTEqAQuR5NFBDbm13aDNjc3M");
        event2.setLevelOne("Submission of idea (ppt) and judgement - 24th February");
        event2.setLevelTwo("Iteration and enhancements submission and judgement- 3rd March");
        event2.setLevelThree("12th/13th March (during the event at JEC)");
        event2.setLevelFour("");

        event3 = new Event();
        event3.setEventId(3);
        event3.setEventName("Build A Business");
        event3.setEventImage(R.drawable.startup);
        event3.setEventSubTitle("Ready. Get set. \"Start Up.\"");
        event3.setEventDetails("Time to portray your ideas to the world. In the spirit of promoting entrepreneurship in our society, we aim at giving young entrepreneurs a platform to showcase their business ideas that generate a social impact with financial sustainability. Inspired by the recent Startup India mission of our Prime Minister, we put young minds to a scaffold through this competition by letting them explore their local/global market and grab the opportunities in our country which currently has the third largest number of startups in the world and an immensely fast growing economy.");
        event3.setLevelNote("Level Registrations will close on the day before the starting of level 1");
        event3.setMoreInfoLink("https://drive.google.com/file/d/0B5iiTEqAQuR5NXh6b3hxM3NTTFU");
        event3.setLevelOne("Submission of idea (ppt) and judgement - 23rd February.");
        event3.setLevelTwo("Iteration and enhancements submission and judgement- 2nd March");
        event3.setLevelThree("Teams are required to complete a task given in Level 2. – 12th/13th March (during the event at JEC)");
        event3.setLevelFour("");

        event4 = new Event();
        event4.setEventId(4);
        event4.setEventName("Round Table Conclave");
        event4.setEventImage(R.drawable.panel);
        event4.setEventSubTitle("Your opinion MATTERS!");
        event4.setEventDetails("This event will host a number of renowned personalities as our panelists. They will exchange their ideas and discussvarious technological aspects, by asking questions or reacting to the opinions of other panel members. This will be followed by a question and answer session by the students. This event is directed towards providing a useful way to trigger an exchange of viewpoints among experts for the awareness and upliftment of our society.");
        event4.setLevelNote("");
        event4.setMoreInfoLink("");
        event4.setLevelOne("");
        event4.setLevelTwo("");
        event4.setLevelThree("");
        event4.setLevelFour("");


        event5 = new Event();
        event5.setEventId(5);
        event5.setEventName("Humans of JEC");
        event5.setEventImage(R.drawable.photography);
        event5.setEventSubTitle("A pictorial story of life at JEC.");
        event5.setEventDetails("The quintessence of a scenario lies in the eyes of the one who pictures it from one's own imagination. And there is no better way of demonstrating that beauty than capturing it through the eyes of your camera lens.\n" +
                "Helix gives you a chance to bring out your unique visions to the world through the art of photography. Let the silence speak, let the stills move into life.");
        event5.setLevelNote("The Photo Contest begins at 12:00am Feb 11, 2016 and ends at 12:00am on March 11, 2016. Entries submitted before or after the Entry Period will not be eligible. All images must be submitted though Email: helix@jecjabalpur.ac.in or through our Facebook Page www.facebook.com/helixjec, including all required fields.");
        event5.setMoreInfoLink("https://drive.google.com/file/d/0B5iiTEqAQuR5TFpEcTVCdGUtcE0");
        event5.setLevelOne("");
        event5.setLevelTwo("");
        event5.setLevelThree("");
        event5.setLevelFour("");

        event6 = new Event();
        event6.setEventId(6);
        event6.setEventName("Code Conclave");
        event6.setEventImage(R.drawable.code_event);
        event6.setEventSubTitle("Be Greedy ! Be Brutal !");
        event6.setEventDetails("Code Conclave embraces the real scrutiny of your programming prowess. Fortify yourself to race against time. You will be tested for your competence in your programming, coordination and ability to visualise in the peak of time.");
        event6.setLevelNote("");
        event6.setMoreInfoLink("https://drive.google.com/file/d/0B5iiTEqAQuR5QlFrSDBWLUd4eHM");
        event6.setLevelOne("Eliminator - 25th February");
        event6.setLevelTwo("Knock Out – 29th Febuary");
        event6.setLevelThree("Coding Finale - 12th/13th March (during the event at JEC)");
        event6.setLevelFour("");

        event7 = new Event();
        event7.setEventId(7);
        event7.setEventName("Mock Campus");
        event7.setEventImage(R.drawable.job);
        event7.setEventSubTitle("You are HIRED!");
        event7.setEventDetails("Mock Campus will provide a platform to the students for their SWOT analysis in terms of their preparation for the upcoming campus drives. The mock campus simulates exactly the company recruitment process with the same vigor and rigour. This mock will have a written test, interview and group discussion.");
        event7.setLevelNote("");
        event7.setMoreInfoLink("https://drive.google.com/file/d/0B5iiTEqAQuR5WWJFaHE3VjVzdDA");
        event7.setLevelOne("Written Test- 4th March 2016");
        event7.setLevelTwo("Group Discussion - 7th March 2016");
        event7.setLevelThree("Case Study/ Picture Perception/ Pseudo Codes Decoding / Video Synthesis/ - 9th March 2016");
        event7.setLevelFour("Technical/ Management/ HR interviews - 11th /12th /13th March");

        event8 = new Event();
        event8.setEventId(8);
        event8.setEventName("Mock UPSC");
        event8.setEventImage(R.drawable.upsc);
        event8.setEventSubTitle("The Administrator!");
        event8.setEventDetails("Mock UPSC will test the aspirants preparing for civil services and avail them with an opportunity to judge their preparations at all three stages. This event will comprise of the preliminary test, mains and personal interview (by a panel of senior IAS/IPS).");
        event8.setLevelNote("");
        event8.setMoreInfoLink("https://drive.google.com/file/d/0B5iiTEqAQuR5VGlLRXdBeWZXOFE");
        event8.setLevelOne("Prelims - 6th March");
        event8.setLevelTwo("Mains - 10th March");
        event8.setLevelThree("Personal Interview 12th/13th March(during the event at JEC)");
        event8.setLevelFour("");

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

    public static Event getEventbyId(int id){
        Event event = null;
        switch (id){
            case 1:
                event = event1;
                break;
            case 2:
                event = event2;
                break;
            case 3:
                event = event3;
                break;
            case 4:
                event = event4;
                break;
            case 5:
                event = event5;
                break;
            case 6:
                event = event6;
                break;
            case 7:
                event = event7;
                break;
            case 8:
                event = event8;
                break;
        }
        return event;
    }
}
