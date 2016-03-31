package com.everychildsmilestone.app.model.person;

import com.google.gson.annotations.SerializedName;

public enum Gender {

    @SerializedName("female")
    FEMALE,
    @SerializedName("male")
    MALE,
    @SerializedName("other")
    OTHER;

    @Override
    public String toString() {
        return name().toUpperCase();
    }

    public Gender fromString(String s) {
        for (Gender gender : values()) {
            if (s.equalsIgnoreCase(gender.toString())) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Gender type is not supported: " + s);
    }
}
