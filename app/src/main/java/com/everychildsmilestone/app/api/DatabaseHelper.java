package com.everychildsmilestone.app.api;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.everychildsmilestone.app.api.DatabaseContract.COLUMN_FIRST_NAME;
import static com.everychildsmilestone.app.api.DatabaseContract.COLUMN_HOME_PHONE;
import static com.everychildsmilestone.app.api.DatabaseContract.COLUMN_LAST_NAME;
import static com.everychildsmilestone.app.api.DatabaseContract.COLUMN_MIDDLE_NAME;
import static com.everychildsmilestone.app.api.DatabaseContract.COLUMN_MOBILE_PHONE;
import static com.everychildsmilestone.app.api.DatabaseContract.COLUMN_OCCUPATION;
import static com.everychildsmilestone.app.api.DatabaseContract._ID;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "MileStone";

    public static final String TABLE_NAME_PERSON = "person";

    private static final String TEXT_TYPE = " TEXT";

    private static final String COMMA_SEP = ",";


    void createPersonTable(SQLiteDatabase database) {
        String seq =
                "CREATE TABLE IF NOT EXIST " + TABLE_NAME_PERSON + " (" +
                        _ID + " INTEGER PRIMARY KEY," +
                        COLUMN_FIRST_NAME + TEXT_TYPE + COMMA_SEP +
                        COLUMN_LAST_NAME + TEXT_TYPE + COMMA_SEP +
                        COLUMN_MIDDLE_NAME + TEXT_TYPE + COMMA_SEP +
                        COLUMN_OCCUPATION + TEXT_TYPE + COMMA_SEP +
                        COLUMN_HOME_PHONE + TEXT_TYPE + COMMA_SEP +
                        COLUMN_MOBILE_PHONE + TEXT_TYPE + COMMA_SEP +
                        " )";
        database.execSQL(seq);

    }

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.delete(getDatabaseName(), null, null);
        onCreate(db);
    }
}
