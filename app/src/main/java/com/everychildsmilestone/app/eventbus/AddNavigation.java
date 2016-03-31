package com.everychildsmilestone.app.eventbus;

public class AddNavigation {

    private NavigationType mNavigationType;

    public AddNavigation(
            NavigationType navigationType) {
        mNavigationType = navigationType;
    }

    public NavigationType getNavigationType() {
        return mNavigationType;
    }

}
