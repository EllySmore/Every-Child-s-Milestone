package com.everychildsmilestone.app.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class AppSettings {

    private static final String sFileName = "AppSettings";

    private static final String KEY_USER_IS_LOGGED_IN = "KEY_USER_IS_LOGGED_IN";


    private SharedPreferences mSharedPreferences;

    private AppSettings(Context context) {
        mSharedPreferences = context.getSharedPreferences(sFileName, Context.MODE_PRIVATE);
    }

    public static AppSettings getDefault(Context context) {
        return new AppSettings(context);
    }

    public boolean isUserLoggedIn() {
        return mSharedPreferences.getBoolean(KEY_USER_IS_LOGGED_IN, false);
    }

    @SuppressLint("CommitPrefEdits")
    public void setUserIsLoggedIn(boolean loggedIn) {
        mSharedPreferences.edit().putBoolean(KEY_USER_IS_LOGGED_IN, loggedIn).commit();
    }

}
