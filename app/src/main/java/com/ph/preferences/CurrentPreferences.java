package com.ph.preferences;

//Singleton pattern
public class CurrentPreferences extends Preferences{

    //Logger
    private final String LOG_TAG = this.getClass().getSimpleName();

    //static member
    private static final CurrentPreferences current_preferences = new CurrentPreferences();

    //Default private constructor
    private CurrentPreferences() {}

    //Getters
    public static CurrentPreferences getInstance() {
        return current_preferences;
    }

    @Override
    public Preferences loadPreferences() {
        return null;
    }

    public void resetToDefault() {

    }
}
