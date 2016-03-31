package com.everychildsmilestone.app.ui;

import com.everychildsmilestone.app.R;
import com.everychildsmilestone.app.commons.BaseActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class SettingsActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        replaceSupportFragment(getContainerId(), SettingsFragment.newInstance(), null);
    }

}
