package com.everychildsmilestone.app.model;

public class BirthRegistrationForm {

    private String mFirstname;
    private String mLastname;
    private String mMiddlename;
    private String mGender;
    private String mBirthDate;

    public BirthRegistrationForm(Builder builder) {
        this.mFirstname = builder.firstname;
        this.mLastname = builder.lastname;
        this.mMiddlename = builder.middlename;
        this.mGender = builder.gender;
        this.mBirthDate = builder.birthdate;
    }

    public class Builder {
        private String firstname;
        private String lastname;
        private String middlename;
        private String gender;
        private String birthdate;

        public Builder() {
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setMiddlename(String middlename) {
            this.middlename = middlename;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setBirthdate(String birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public String getMiddlename() {
            return middlename;
        }

        public String getGender() {
            return gender;
        }

        public String getBirthdate() {
            return birthdate;
        }

        public BirthRegistrationForm create() {
            return new BirthRegistrationForm(this);
        }
    }

    public String getFirstname() {
        return mFirstname;
    }

    public String getLastname() {
        return mLastname;
    }

    public String getMiddlename() {
        return mMiddlename;
    }

    public String getGender() {
        return mGender;
    }

    public String getBirthDate() {
        return mBirthDate;
    }
}
