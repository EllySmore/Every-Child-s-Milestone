package com.everychildsmilestone.app.api;

import android.provider.BaseColumns;

public final class DatabaseContract implements BaseColumns {

    public DatabaseContract() {
    }

    public static final String COLUMN_ID = "_id";

    public static final String COLUMN_FIRST_NAME = "firstname";

    public static final String COLUMN_MIDDLE_NAME = "middlename";

    public static final String COLUMN_LAST_NAME = "lastname";

    public static final String COLUMN_OCCUPATION = "occupation";

    public static final String COLUMN_MOBILE_PHONE = "mobilephonenumber";

    public static final String COLUMN_HOME_PHONE = "homephonenumber";

    public static final String COLUMN_MARITAL_STATUS = "maritalstatus";

    public static final String COLUMN_DOB = "dateofbirth";

    public static final String COLUMN_ADDRESS = "address";

    public static final String COLUMN_EMERGENCY_CONTACT = "emergencycontact";

    public static final String COLUMN_GENDER = "gender";
}
