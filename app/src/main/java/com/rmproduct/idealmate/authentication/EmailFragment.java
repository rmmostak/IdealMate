package com.rmproduct.idealmate.authentication;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.rmproduct.idealmate.MainActivity;
import com.rmproduct.idealmate.R;

public class EmailFragment extends Fragment {

    EditText email;
    Button thatOne;
    ViewPager viewPager;

    public EmailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_email, container, false);
        viewPager=getActivity().findViewById(R.id.viewPager);
        email=view.findViewById(R.id.email);
        thatOne=view.findViewById(R.id.thatOne);

        thatOne.setOnClickListener(v ->{
            Intent intent = new Intent(v.getContext(), MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            ActivityOptions options = ActivityOptions.makeCustomAnimation(v.getContext(), R.anim.fade_in, R.anim.fade_out);
            startActivity(intent, options.toBundle());
        });

        return view;
    }
}