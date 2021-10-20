package com.rmproduct.idealmate.authentication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.rmproduct.idealmate.R;

public class GenderFragment extends Fragment {

    Button man, woman, others;
    ViewPager viewPager;
    boolean check = false;

    public GenderFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gender, container, false);
        viewPager = getActivity().findViewById(R.id.viewPager);
        man = view.findViewById(R.id.man);
        woman = view.findViewById(R.id.woman);
        others = view.findViewById(R.id.others);

        man.setOnClickListener(v -> viewPager.setCurrentItem(2));
        woman.setOnClickListener(v -> viewPager.setCurrentItem(2));
        others.setOnClickListener(v -> viewPager.setCurrentItem(2));

        return view;
    }
}