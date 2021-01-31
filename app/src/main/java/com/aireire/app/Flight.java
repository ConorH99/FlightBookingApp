package com.aireire.app;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="flights")
public class Flight {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public String departure;
    public String destination;
    public int day;
    public int month;
    public int year;
    public int hour;
    public int minute;

    public Flight(final String departure, final String destination, final int day,
                     final int month, final int year, final int hour, final int minute) {

        this.departure = departure;
        this.destination = destination;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }
}
