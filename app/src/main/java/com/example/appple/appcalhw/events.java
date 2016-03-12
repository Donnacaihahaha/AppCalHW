package com.example.appple.appcalhw;

/**
 * Created by appple on 3/11/16.
 */
public class events {
    private Long id;
    private String eventname;
    private java.util.Date date;

    public events() {
    }

    public events(long id) {
        this.id = id;
    }

    public events(long id, String eventname, java.util.Date date) {
        this.id = id;
        this.eventname = eventname;
        this.date = date;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEventname() {
        return this.eventname;
    }

    public void setEventname(String name) {
        this.eventname = name;
    }

    public java.util.Date getDate() {
        return this.date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }



}


