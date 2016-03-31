package com.everychildsmilestone.app.commons;

import com.everychildsmilestone.app.R;
import com.everychildsmilestone.app.util.AppBus;
import com.squareup.otto.Bus;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;

public abstract class BaseActivity extends AppCompatActivity {

    protected Bus mEventBus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mEventBus = AppBus.getInstance().getBus();
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            mEventBus.register(this);
        } catch (Exception e) {
            Log.d("milestone", e.getMessage());
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        try {
            mEventBus.unregister(this);
        } catch (Exception e) {
            Log.d("milestone", e.getMessage());
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                    getSupportFragmentManager().popBackStack();
                } else {
                    finish();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    public void addFragment(int containerId, Fragment fragment, String backstackname) {
        android.app.FragmentTransaction ft = getFragmentManager()
                .beginTransaction();
        ft.add(containerId, fragment);
        if (!TextUtils.isEmpty(backstackname)) {
            ft.addToBackStack(backstackname);
        }
        ft.commit();
    }

    protected void addSupportFragment(int containerId, android.support.v4.app.Fragment fragment,
            String backstackname) {
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction();
        ft.add(containerId, fragment);
        ft.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        if (!TextUtils.isEmpty(backstackname)) {
            ft.addToBackStack(backstackname);
        }
        ft.commit();
    }


    public void replaceFragment(int containerId, Fragment fragment, String backstackname) {
        android.app.FragmentTransaction ft = getFragmentManager()
                .beginTransaction();
        ft.add(containerId, fragment);
        if (!TextUtils.isEmpty(backstackname)) {
            ft.replace(containerId, fragment, backstackname);
        } else {
            ft.replace(containerId, fragment);
        }
        ft.commit();
    }

    public void replaceSupportFragment(int containerId, android.support.v4.app.Fragment fragment,
            String backstackname) {
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction();
        ft.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        if (!TextUtils.isEmpty(backstackname)) {
            ft.replace(containerId, fragment, backstackname);
            ft.addToBackStack(backstackname);
        } else {
            ft.replace(containerId, fragment);
        }
        ft.commit();
    }

    public int getContainerId() {
        return R.id.content_frame;
    }

}
