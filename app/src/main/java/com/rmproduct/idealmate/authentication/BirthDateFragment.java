package com.rmproduct.idealmate.authentication;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.rmproduct.idealmate.R;

public class BirthDateFragment extends Fragment {

    EditText birthDay;
    Button thatIt;
    ViewPager viewPager;

    public BirthDateFragment() {
        // Required empty public constructor
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_birth_date, container, false);
        viewPager = getActivity().findViewById(R.id.viewPager);
        birthDay = view.findViewById(R.id.birthDay);
        thatIt = view.findViewById(R.id.thatIt);
        birthDay.setFocusable(false);
        birthDay.setOnClickListener(v -> {
            DatePickerDialog dialog = new DatePickerDialog(v.getContext());
            int month = dialog.getDatePicker().getMonth() + 1;
            int day = dialog.getDatePicker().getDayOfMonth();
            int year = dialog.getDatePicker().getYear();
            birthDay.setText(month + "/" + day + "/" + year);
            dialog.show();
        });

        thatIt.setOnClickListener(v -> viewPager.setCurrentItem(4));

        return view;
    }
}