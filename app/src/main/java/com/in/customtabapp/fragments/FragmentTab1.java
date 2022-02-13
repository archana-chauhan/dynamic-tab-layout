package com.in.customtabapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.in.customtabapp.R;

public class FragmentTab1 extends Fragment {

    TextView tvTabItem;
    String title = "";

    public FragmentTab1(String title) {
        this.title = title;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        tvTabItem = view.findViewById(R.id.tvTabItem);
        tvTabItem.setText("Not " + title + " yet.");
        return view;
    }
}
