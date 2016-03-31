package com.everychildsmilestone.app.ui;

import com.everychildsmilestone.app.R;
import com.everychildsmilestone.app.eventbus.NavigationType;
import com.everychildsmilestone.app.eventbus.ReplaceNavigation;
import com.everychildsmilestone.app.util.AppBus;
import com.everychildsmilestone.app.util.AppSettings;
import com.jakewharton.rxbinding.view.RxView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.TimeUnit;

import rx.android.schedulers.AndroidSchedulers;

public class LoginFragment extends Fragment {

    private EditText mUsername;

    private EditText mPassword;

    private Button mLoginButton;

    public static Fragment newInstance() {
        return new LoginFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_login, container, false);
        mUsername = (EditText) rootview.findViewById(R.id.input_username);
        mPassword = (EditText) rootview.findViewById(R.id.input_password);
        mLoginButton = (Button) rootview.findViewById(R.id.btn_login);
        RxView.clicks(mLoginButton)
                .debounce(500, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .filter(aVoid -> validateUsername() && validatePassword())
                .subscribe(aVoid -> {
                    AppSettings.getDefault(getActivity()).setUserIsLoggedIn(true);
                    launchNavigationScreen();
                }, throwable -> {

                });
        return rootview;
    }

    private void launchNavigationScreen() {
        AppBus.getInstance().getBus()
                .post(new ReplaceNavigation(NavigationType.HOME));
    }

    //TODO: Better error handling and UI
    private boolean validateUsername() {
        String inputValue = mUsername.getEditableText().toString();
        final boolean isValid = inputValue.equals("admin");
        if (!isValid) {
            mUsername.setError("Invalid username");
        }
        return isValid;
    }

    private boolean validatePassword() {
        String inputValue = mPassword.getEditableText().toString();

        final boolean isValid = inputValue.equals("password");
        if (!isValid) {
            mPassword.setError("Invalid password.");
        }
        return isValid;
    }
}
