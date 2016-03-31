package com.everychildsmilestone.app.model.medicalhistoy;

import com.google.gson.annotations.SerializedName;

import com.everychildsmilestone.app.model.person.Person;

import org.joda.time.DateTime;

public class VisitLog {

    @SerializedName("date_visited")
    private String mDateVisited;

    @SerializedName("mid_wife")
    private Person mMidWife;

    public DateTime getDateVisited() {
        return DateTime.parse(mDateVisited);
    }

    public Person getMidWife() {
        return mMidWife;
    }

}
