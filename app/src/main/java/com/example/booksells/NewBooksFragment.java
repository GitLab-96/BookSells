package com.example.booksells;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class NewBooksFragment extends Fragment {
    private ViewPager myviewPager;
    private TeastAccessAdapter myteastAccessAdapter;
    private TabLayout myTabLayout;

    public NewBooksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_new_books, container, false);

        myviewPager = view.findViewById(R.id.main_tab_Pager);
        myteastAccessAdapter = new TeastAccessAdapter(getChildFragmentManager());
        myviewPager.setAdapter(myteastAccessAdapter);

        myTabLayout = view.findViewById(R.id.main_tabs);
        myTabLayout.setupWithViewPager(myviewPager );









        return view;
    }

}
