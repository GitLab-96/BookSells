package com.example.booksells;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


public class OldBooksFragment extends Fragment {

    public ViewPager oldmyviewPager;
    public oldTeastAccessAdapter oldmyteastAccessAdapter;
    public TabLayout oldMyTabLayout;

    public OldBooksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_old_books, container, false);

        oldmyviewPager = view.findViewById(R.id.old_main_tab_Pager);
        oldmyteastAccessAdapter = new oldTeastAccessAdapter(getChildFragmentManager());
        oldmyviewPager.setAdapter(oldmyteastAccessAdapter);

        oldMyTabLayout = view.findViewById(R.id.old_main_tabs);
        oldMyTabLayout.setupWithViewPager(oldmyviewPager );






        return view;
    }

}
