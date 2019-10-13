package com.yessy.utsyessy.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yessy.utsyessy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MinumanFragment extends Fragment {


    public MinumanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_minuman, container, false);
    }

}
