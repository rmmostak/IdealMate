package com.rmproduct.idealmate.authentication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.rmproduct.idealmate.R;

public class NameFragment extends Fragment {

    EditText name;
    Button thatMe;
    ViewPager viewPager;

    public NameFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_name, container, false);
        viewPager = getActivity().findViewById(R.id.viewPager);
        name = view.findViewById(R.id.firstName);
        thatMe = view.findViewById(R.id.thatMe);
        thatMe.setOnClickListener(v -> viewPager.setCurrentItem(5));

        return view;
    }
}