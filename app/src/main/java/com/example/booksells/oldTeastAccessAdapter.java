package com.example.booksells;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class oldTeastAccessAdapter extends FragmentPagerAdapter {


    public oldTeastAccessAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                OldSchoolBook oldSchoolBook = new OldSchoolBook();
                return oldSchoolBook ;

            case 1:
                OldCollageBook oldCollageBook = new OldCollageBook();
                return  oldCollageBook;

            case 2:
                OldUniversityBook oldUniversityBook = new OldUniversityBook();
                return  oldUniversityBook;
            case 3:
                OldMadrasahBook oldMadrasahBook = new OldMadrasahBook();
                return  oldMadrasahBook;

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
