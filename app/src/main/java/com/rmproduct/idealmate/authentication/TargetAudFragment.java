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

public class TargetAudFragment extends Fragment {

    Button men, women, everyone;
    ViewPager viewPager;

    public TargetAudFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_target_aud, container, false);
        viewPager = getActivity().findViewById(R.id.viewPager);
        men = view.findViewById(R.id.men);
        women = view.findViewById(R.id.women);
        everyone = view.findViewById(R.id.everyone);

        men.setOnClickListener(v -> viewPager.setCurrentItem(3));
        women.setOnClickListener(v -> viewPager.setCurrentItem(3));
        everyone.setOnClickListener(v -> viewPager.setCurrentItem(3));

        return view;
    }
}