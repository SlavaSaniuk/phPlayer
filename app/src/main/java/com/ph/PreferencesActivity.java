package com.ph;

import android.content.DialogInterface;
import android.os.Bundle;

import com.ph.preferences.CurrentPreferences;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

public class PreferencesActivity extends AppCompatActivity {

    //Class variables
    private CurrentPreferences current_preferences;
    private final String LOG_TAG = this.getClass().getSimpleName(); //Logger tag

    //Constructor
    public PreferencesActivity() {
        super();

        //Get current preferences object
        this.current_preferences = CurrentPreferences.getInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void showResetPreferencesAlertDialog(View view) {

        //Create alert dialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle("Reset to default preferences?");
        dialog.setMessage(R.string.sDialog_boolean_instruction);

        dialog.setPositiveButton("Ok", (DialogInterface inter, int which) -> {
            Log.d(LOG_TAG, "Reset to default preferences: true");
            this.current_preferences.resetToDefault();
        });

        dialog.setNegativeButton("Cancel", (DialogInterface inter, int which) -> Log.d(LOG_TAG, "Reset to default preferences: false"));

        //Show dialog
        dialog.show();
    }

}
