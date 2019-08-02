package com.example.citybus;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class DatepickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    public interface DatePickerListener{
        void onDateSet(DatePicker datePicker, int year, int mount, int day);
    }
    DatePickerListener mListener;
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        try {
            mListener=  (DatePickerListener)context;
        }catch (Exception e){
            throw new ClassCastException(getActivity().toString()+"must implement datepicker");
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar cal =Calendar.getInstance();
        int year=cal.get(Calendar.YEAR);
        int mounth=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(),this, year,mounth,day);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        mListener.onDateSet(datePicker,i,i1,i2);

    }
}
