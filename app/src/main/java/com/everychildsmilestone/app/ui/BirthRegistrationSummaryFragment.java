package com.everychildsmilestone.app.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.everychildsmilestone.app.R;

/**
 * The next screen of Birth Registration
 */
public class BirthRegistrationSummaryFragment extends Fragment {

    public static BirthRegistrationSummaryFragment newInstance() {
        return new BirthRegistrationSummaryFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_birth_registration, container, false);
        return rootView;
    }
}
