package com.everychildsmilestone.app.ui;

import com.everychildsmilestone.app.R;
import com.everychildsmilestone.app.util.VerifyFormHelper;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

/**
 * User input form for birth registration
 */
public class BirthRegistrationFormFragment extends Fragment {

    //Bundle extras
    public static final String EXTRA_FIRST_NAME = "EXTRA_FIRST_NAME";

    public static final String EXTRA_MIDDLENAME = "EXTRA_MIDDLENAME";

    public static final String EXTRA_LAST_NAME = "EXTRA_LAST_NAME";

    public static final String EXTRA_DOB = "EXTRA_DOB";

    public static final String EXTRA_GENDER = "EXTRA_GENDER";

    //Views
    private View mRootView;

    private EditText mFirstname;

    private EditText mLastname;

    private EditText mMiddleName;

    private EditText mGender;

    private TextView mDob;

    private Button mCancelButton;

    private Button mNextButton;

    public static BirthRegistrationFormFragment newInstance() {
        return new BirthRegistrationFormFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_birth_registration, container, false);
        initView();
        initListeners();
        return mRootView;
    }

    public void initView() {
        //TODO: Parent forum
        mFirstname = (EditText) mRootView.findViewById(R.id.input_child_firstname);
        mLastname = (EditText) mRootView.findViewById(R.id.input_child_lastname);
        mMiddleName = (EditText) mRootView.findViewById(R.id.input_child_middlename);
        mGender = (EditText) mRootView.findViewById(R.id.input_child_gender);
        mDob = (TextView) mRootView.findViewById(R.id.input_child_dob);
        mCancelButton = (Button) mRootView.findViewById(R.id.cancel_button);
        mNextButton = (Button) mRootView.findViewById(R.id.next_button);

    }

    public void initListeners() {
        //Get Current Date
        final Calendar calendar = Calendar.getInstance();

        mDob.setOnClickListener(v -> {
            DatePickerDialog dialog = new DatePickerDialog(
                    getActivity(),
                    (view, year, monthOfYear, dayOfMonth) -> {
                        //TODO: Use square picker
                    },
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH));
            dialog.show();
        });

        mNextButton.setOnClickListener(v -> {
            //TODO: Validate forum and move to summary screen
        });

        mCancelButton.setOnClickListener(v -> getActivity().onBackPressed());
    }

    public void verifyAllInput() {
    }

    public boolean verifyFirstName(EditText editText) {
        VerifyFormHelper.FormState form = VerifyFormHelper
                .verifyName(mFirstname.getText().toString().trim());
        handleFormState(editText, form);
        return form == VerifyFormHelper.FormState.VALID_FIELD;
    }

    public void handleFormState(EditText editText, VerifyFormHelper.FormState state) {
        switch (state) {
            case VALID_FIELD:
                //noop
                break;
            case INVALID_FIELD:
                editText.setError(getString(state.getErrorStringResId()));
                break;
            case EMPTY_FIELD:
                editText.setError(getString(state.getErrorStringResId()));
                break;
            default:
        }
    }
}
