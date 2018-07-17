package ntt.thuy.practice.framgia.tablayout_viewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import static ntt.thuy.practice.framgia.tablayout_viewpager.Constants.FIRST_PAGE;
import static ntt.thuy.practice.framgia.tablayout_viewpager.Constants.PAGE_NUMBER;
import static ntt.thuy.practice.framgia.tablayout_viewpager.Constants.SECOND_PAGE;
import static ntt.thuy.practice.framgia.tablayout_viewpager.Constants.THIRD_PAGE;

/**
 * Created by thuy on 17/07/2018.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    private Context mContext;

    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case FIRST_PAGE:
                fragment = new FirstFragment();
                break;
            case SECOND_PAGE:
                fragment = new SecondFragment();
                break;
            case THIRD_PAGE:
                fragment = new ThirdFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title= "";
        switch (position){
            case FIRST_PAGE:
                title = mContext.getResources().getString(R.string.first_page_title);
                break;
            case SECOND_PAGE:
                title = mContext.getResources().getString(R.string.second_page_title);
                break;
            case THIRD_PAGE:
                title = mContext.getResources().getString(R.string.third_page_title);
                break;
        }
        return title;
    }
}
