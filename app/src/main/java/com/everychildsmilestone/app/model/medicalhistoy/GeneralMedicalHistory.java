package com.everychildsmilestone.app.model.medicalhistoy;

import com.google.gson.annotations.SerializedName;

public class GeneralMedicalHistory {

    @SerializedName("additional_note")
    private String mAdditionalNote;

    @SerializedName("primary_disease")
    private String mPrimaryDisease;

    @SerializedName("secondary_disease")
    private String mSecondaryDisease;

    public String getAdditionalNote() {
        return mAdditionalNote;
    }

    public String getPrimaryDisease() {
        return mPrimaryDisease;
    }

    public String getSecondaryDisease() {
        return mSecondaryDisease;
    }
}
