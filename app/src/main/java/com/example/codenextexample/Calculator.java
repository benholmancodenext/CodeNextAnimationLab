package com.example.codenextexample;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Calculator extends Fragment {


    public Calculator() {
        // Required empty public constructor
    }

    public static Calculator newInstance() {
        return new Calculator();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        view.setBackgroundColor(Color.RED);

        return view;
    }

}
