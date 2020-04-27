package com.learn.jdbc.lifeEverydayModel;

import java.time.LocalDate;

public class EveryDay {

    private int id;
    private LocalDate date;
    private String activity;
    private int  duration;

    public EveryDay(){
    }

    public EveryDay(int id, LocalDate today, String activity, int duration) {
        this.id =id;
        this.date = date;
        this.activity = activity;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getToday() {
        return date;
    }

    public void setToday(LocalDate date) {
        this.date = date;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.format("EveryDay [today=%s, id=%s, activity=%s]", id, date, activity, duration);
    }
}
