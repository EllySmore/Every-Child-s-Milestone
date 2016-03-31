package com.everychildsmilestone.app.model;

import com.google.gson.annotations.SerializedName;

import com.everychildsmilestone.app.model.person.Address;
import com.everychildsmilestone.app.model.person.EmergencyContact;
import com.everychildsmilestone.app.model.person.Gender;

import org.joda.time.DateTime;

public class BaseUser {

    @SerializedName("id")
    protected String mId;

    @SerializedName("first_name")
    protected String mFirstName;

    @SerializedName("middle_name")
    protected String mMiddleName;

    @SerializedName("last_name")
    protected String mLastName;

    @SerializedName("occupation")
    protected String mOccupation;

    @SerializedName("mobile_phone_number")
    protected String mMobilePhoneNumber;

    @SerializedName("home_phone_number")
    protected String mHomePhoneNumber;

    @SerializedName("marital_status")
    protected MaritalStatus mMaritalStatus;

    @SerializedName("date_of_birth")
    protected String mDateOfBirth;

    @SerializedName("address")
    protected Address mAddress;

    @SerializedName("emergency_contact")
    protected EmergencyContact mEmergencyContact;

    @SerializedName("gender")
    protected Gender mGender;

    protected String getId() {
        return mId;
    }

    public DateTime getDateOfBirth() {
        return DateTime.parse(mDateOfBirth);
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getMiddleName() {
        return mMiddleName;
    }

    public String getLastName() {
        return mLastName;
    }

    public Address getAddress() {
        return mAddress;
    }

    public String getOccupation() {
        return mOccupation;
    }

    public String getMobilePhoneNumber() {
        return mMobilePhoneNumber;
    }

    public String getHomePhoneNumber() {
        return mHomePhoneNumber;
    }

    public MaritalStatus getMaritalStatus() {
        return mMaritalStatus;
    }

    public EmergencyContact getEmergencyContact() {
        return mEmergencyContact;
    }

    public Gender getGender() {
        return mGender;
    }

    public void setId(String id) {
        mId = id;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public void setMiddleName(String middleName) {
        mMiddleName = middleName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public void setOccupation(String occupation) {
        mOccupation = occupation;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        mMobilePhoneNumber = mobilePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        mHomePhoneNumber = homePhoneNumber;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        mMaritalStatus = maritalStatus;
    }

    public void setDateOfBirth(String dateOfBirth) {
        mDateOfBirth = dateOfBirth;
    }

    public void setAddress(Address address) {
        mAddress = address;
    }

    public void setEmergencyContact(
            EmergencyContact emergencyContact) {
        mEmergencyContact = emergencyContact;
    }

    public void setGender(Gender gender) {
        mGender = gender;
    }



}
