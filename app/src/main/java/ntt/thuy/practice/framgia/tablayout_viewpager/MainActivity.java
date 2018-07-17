package ntt.thuy.practice.framgia.tablayout_viewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import static ntt.thuy.practice.framgia.tablayout_viewpager.Constants.FIRST_PAGE;
import static ntt.thuy.practice.framgia.tablayout_viewpager.Constants.SECOND_PAGE;
import static ntt.thuy.practice.framgia.tablayout_viewpager.Constants.THIRD_PAGE;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();
    }

    private void initializeView() {
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        FragmentManager fragmentManager = getSupportFragmentManager();
        PagerAdapter adapter = new PagerAdapter(MainActivity.this, fragmentManager);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setTabsFromPagerAdapter(adapter);

        setupTabIcons();
    }

    private void setupTabIcons() {
        mTabLayout.getTabAt(FIRST_PAGE).setIcon(R.mipmap.ic_launcher_round);
        mTabLayout.getTabAt(SECOND_PAGE).setIcon(R.mipmap.ic_launcher_round);
        mTabLayout.getTabAt(THIRD_PAGE).setIcon(R.mipmap.ic_launcher_round);
    }

}
