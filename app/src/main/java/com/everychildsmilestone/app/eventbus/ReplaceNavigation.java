package com.everychildsmilestone.app.eventbus;

public class ReplaceNavigation {

    private NavigationType mNavigationType;

    public ReplaceNavigation(NavigationType navigationType) {
        mNavigationType = navigationType;
    }

    public NavigationType getNavigationType() {
        return mNavigationType;
    }
}
