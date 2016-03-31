package com.everychildsmilestone.app.util;

import com.squareup.otto.Bus;

public class AppBus {

    private static AppBus sInstance;

    private Bus mBus;

    public AppBus() {
    }

    public static AppBus getInstance() {
        if (sInstance == null) {
            sInstance = new AppBus();
        }
        return sInstance;
    }


    public Bus getBus() {
        if (mBus == null) {
            mBus = new Bus();
        }
        return mBus;
    }
}
