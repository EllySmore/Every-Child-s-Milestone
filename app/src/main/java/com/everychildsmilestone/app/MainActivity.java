package com.everychildsmilestone.app;

import com.everychildsmilestone.app.commons.BaseActivity;
import com.everychildsmilestone.app.eventbus.AddNavigation;
import com.everychildsmilestone.app.eventbus.ReplaceNavigation;
import com.everychildsmilestone.app.ui.BirthRegistrationFormFragment;
import com.everychildsmilestone.app.ui.LoginFragment;
import com.everychildsmilestone.app.util.AppSettings;
import com.squareup.otto.Subscribe;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (AppSettings.getDefault(this).isUserLoggedIn()) {
            replaceSupportFragment(getContainerId(), MainFragment.newInstance(),
                    MainFragment.class.getSimpleName());
        } else {
            replaceSupportFragment(getContainerId(), LoginFragment.newInstance(),
                    LoginFragment.class.getSimpleName());
        }
    }

    @Subscribe
    public void replaceScreenEvent(ReplaceNavigation event) {
        switch (event.getNavigationType()) {
            case HOME:
                replaceSupportFragment(getContainerId(), MainFragment.newInstance(),
                        MainFragment.class.getSimpleName());
                break;
            case LOGIN:
                replaceSupportFragment(getContainerId(), LoginFragment.newInstance(),
                        LoginFragment.class.getSimpleName());
                break;
            case BIRTH_REGISTRATION_FORM:
                replaceSupportFragment(getContainerId(),
                        BirthRegistrationFormFragment.newInstance(),
                        BirthRegistrationFormFragment.class.getSimpleName());
                break;
            default:

        }
    }

    @Subscribe
    public void addScreenEvent(AddNavigation event) {
        switch (event.getNavigationType()) {
            case HOME:
                replaceSupportFragment(getContainerId(), MainFragment.newInstance(),
                        MainFragment.class.getSimpleName());
                break;
            case LOGIN:
                replaceSupportFragment(getContainerId(), LoginFragment.newInstance(),
                        LoginFragment.class.getSimpleName());
                break;
            case BIRTH_REGISTRATION_FORM:
                replaceSupportFragment(getContainerId(),
                        BirthRegistrationFormFragment.newInstance(),
                        BirthRegistrationFormFragment.class.getSimpleName());
                break;
            default:

        }
    }

}
