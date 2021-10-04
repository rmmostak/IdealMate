package com.rmproduct.idealmate.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.rmproduct.idealmate.R;
import com.rmproduct.idealmate.SettingActivity;

public class ProfileFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        ImageButton settings = root.findViewById(R.id.settings);

        settings.setOnClickListener(v -> startActivity(new Intent(v.getContext(), SettingActivity.class)));

        return root;
    }
}