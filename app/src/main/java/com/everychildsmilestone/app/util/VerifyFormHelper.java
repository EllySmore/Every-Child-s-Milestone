package com.everychildsmilestone.app.util;

import android.text.TextUtils;

import com.everychildsmilestone.app.R;

public class VerifyFormHelper {

    public enum FormState {
        VALID_FIELD(0),
        EMPTY_FIELD(R.string.error_empty_input),
        INVALID_FIELD(R.string.app_name);

        private final int mErrorStringResId;

        FormState(int errorStringResId) {
            this.mErrorStringResId = errorStringResId;
        }

        public int getErrorStringResId() {
            return mErrorStringResId;
        }
    }

    /**
     * Use for first, middle and last name input
     * @param name
     * @return
     */
    public static FormState verifyName(String name) {
        if (TextUtils.isEmpty(name)) {
            return FormState.EMPTY_FIELD;
        }


        //Todo: regex

        return FormState.VALID_FIELD;
    }

    public static FormState verifyDob(int month, int day, int year) {
        return null;
    }

    public static FormState verifyGender(String gender){
        //TODO: regex
        return FormState.VALID_FIELD;
    }

}
