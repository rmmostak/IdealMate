package com.rmproduct.idealmate.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rmproduct.idealmate.authentication.BirthDateFragment;
import com.rmproduct.idealmate.authentication.EmailFragment;
import com.rmproduct.idealmate.authentication.GenderFragment;
import com.rmproduct.idealmate.authentication.MemberShipFragment;
import com.rmproduct.idealmate.authentication.NameFragment;
import com.rmproduct.idealmate.authentication.TargetAudFragment;

public class JoinAdapter extends FragmentPagerAdapter {

    public JoinAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MemberShipFragment();
            case 1:
                return new GenderFragment();
            case 2:
                return new TargetAudFragment();
            case 3:
                return new BirthDateFragment();
            case 4:
                return new NameFragment();
            case 5:
                return new EmailFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 6;
    }
}
