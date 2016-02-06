package com.wordpress.priyankvex.helixapp.DataHelpers;

import com.wordpress.priyankvex.helixapp.Model.ScheduleItem;

import java.util.ArrayList;

/**
 * Created by priyank on 7/2/16.
 */
public class ScheduleSeed {

    /**
     * Returns the schedule
     * @return array list of schedule
     */
    public static ArrayList<ScheduleItem> getSchedule(){
        ArrayList<ScheduleItem> scheduleItems = new ArrayList<>();

        ScheduleItem si1 = new ScheduleItem();
        si1.setTitle("App Development");
        si1.setDate("11th March 2015");
        si1.setTime("12:00 AM");

        ScheduleItem si2 = new ScheduleItem();
        si2.setTitle("App Development");
        si2.setDate("11th March 2015");
        si2.setTime("12:00 AM");

        ScheduleItem si3 = new ScheduleItem();
        si3.setTitle("App Development");
        si3.setDate("11th March 2015");
        si3.setTime("12:00 AM");

        ScheduleItem si4 = new ScheduleItem();
        si4.setTitle("App Development");
        si4.setDate("11th March 2015");
        si4.setTime("12:00 AM");

        ScheduleItem si5 = new ScheduleItem();
        si5.setTitle("App Development");
        si5.setDate("11th March 2015");
        si5.setTime("12:00 AM");

        ScheduleItem si6 = new ScheduleItem();
        si6.setTitle("App Development");
        si6.setDate("11th March 2015");
        si6.setTime("12:00 AM");

        ScheduleItem si7 = new ScheduleItem();
        si7.setTitle("App Development");
        si7.setDate("11th March 2015");
        si7.setTime("12:00 AM");

        ScheduleItem si8 = new ScheduleItem();
        si8.setTitle("App Development");
        si8.setDate("11th March 2015");
        si8.setTime("12:00 AM");

        scheduleItems.add(si1);
        scheduleItems.add(si2);
        scheduleItems.add(si3);
        scheduleItems.add(si4);
        scheduleItems.add(si5);
        scheduleItems.add(si6);
        scheduleItems.add(si7);
        scheduleItems.add(si8);

        return scheduleItems;
    }
}
