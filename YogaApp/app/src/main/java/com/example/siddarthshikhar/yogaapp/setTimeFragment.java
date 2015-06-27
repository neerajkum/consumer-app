package com.example.siddarthshikhar.yogaapp;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by Siddarth Shikhar on 6/11/2015.
 */
public class setTimeFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
    timePicked listener;
    public interface timePicked
    {
        public void populateSetTime(int hourOfDay, int minute);
    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current time as the default values for the picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute, DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // Do something with the time chosen by the user
        listener.populateSetTime(hourOfDay,minute);
    }
}