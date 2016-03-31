package com.everychildsmilestone.app.model;

import com.google.gson.annotations.SerializedName;

public enum MaritalStatus {

    @SerializedName("married")
    MARRIED,
    @SerializedName("single")
    SINGLE,
    @SerializedName("other")
    OTHER;

    @Override
    public String toString() {
        return name().toUpperCase();
    }
}
