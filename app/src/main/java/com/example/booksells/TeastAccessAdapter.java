package com.example.booksells;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class TeastAccessAdapter extends FragmentPagerAdapter {



    public TeastAccessAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                NewSchoolBooks newSchoolBooks = new NewSchoolBooks();
                return newSchoolBooks ;

            case 1:
                NewCollageBook newCollageBook = new NewCollageBook();
                return  newCollageBook;

            case 2:
                NewUniversityBook newUniversityBook = new NewUniversityBook();
                return  newUniversityBook;
            case 3:
                NewMadrasahBook newMadrasahBook = new NewMadrasahBook();
                return  newMadrasahBook;

            default:
                return null;
        }

    }


    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position){

            case 0:

                return  "School Books";

            case 1:

                return  "Collage Books";

            case 2:

                return  "University Books";
            case 3:

                return  "Madrasah Books";

            default:
                return null;
        }
    }
}
