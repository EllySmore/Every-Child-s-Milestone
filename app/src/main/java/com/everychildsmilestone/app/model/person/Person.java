package com.everychildsmilestone.app.model.person;

import com.google.gson.annotations.SerializedName;

import com.everychildsmilestone.app.model.BaseUser;
import com.everychildsmilestone.app.model.MaritalStatus;
import com.everychildsmilestone.app.model.medicalhistoy.GeneralMedicalHistory;

import java.util.List;

public class Person extends BaseUser {

    @SerializedName("medical_history")
    private GeneralMedicalHistory mGeneralMedicalHistory;

    @SerializedName("children")
    private List<Person> mChildren;


    private Person(Builder builder) {
        setId(builder.mId);
        setFirstName(builder.mFirstName);
        setMiddleName(builder.mMiddleName);
        setLastName(builder.mLastName);
        setOccupation(builder.mOccupation);
        setMobilePhoneNumber(builder.mMobilePhoneNumber);
        setHomePhoneNumber(builder.mHomePhoneNumber);
        setMaritalStatus(builder.mMaritalStatus);
        setDateOfBirth(builder.mDateOfBirth);
        setAddress(builder.mAddress);
        setEmergencyContact(builder.mEmergencyContact);
        setGender(builder.mGender);
    }


    public GeneralMedicalHistory getGeneralMedicalHistory() {
        return mGeneralMedicalHistory;
    }

    public List<Person> getChildren() {
        return mChildren;
    }


    public static final class Builder {

        private String mId;

        private String mFirstName;

        private String mMiddleName;

        private String mLastName;

        private String mOccupation;

        private String mMobilePhoneNumber;

        private String mHomePhoneNumber;

        private MaritalStatus mMaritalStatus;

        private String mDateOfBirth;

        private Address mAddress;

        private EmergencyContact mEmergencyContact;

        private Gender mGender;

        public Builder() {
        }

        public Builder mId(String val) {
            mId = val;
            return this;
        }

        public Builder mFirstName(String val) {
            mFirstName = val;
            return this;
        }

        public Builder mMiddleName(String val) {
            mMiddleName = val;
            return this;
        }

        public Builder mLastName(String val) {
            mLastName = val;
            return this;
        }

        public Builder mOccupation(String val) {
            mOccupation = val;
            return this;
        }

        public Builder mMobilePhoneNumber(String val) {
            mMobilePhoneNumber = val;
            return this;
        }

        public Builder mHomePhoneNumber(String val) {
            mHomePhoneNumber = val;
            return this;
        }

        public Builder mMaritalStatus(MaritalStatus val) {
            mMaritalStatus = val;
            return this;
        }

        public Builder mDateOfBirth(String val) {
            mDateOfBirth = val;
            return this;
        }

        public Builder mAddress(Address val) {
            mAddress = val;
            return this;
        }

        public Builder mEmergencyContact(EmergencyContact val) {
            mEmergencyContact = val;
            return this;
        }

        public Builder mGender(Gender val) {
            mGender = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
