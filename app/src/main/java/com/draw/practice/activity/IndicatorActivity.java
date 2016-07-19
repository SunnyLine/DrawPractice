package com.draw.practice.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.draw.practice.R;
import com.draw.practice.adapter.ViewPagerAdapter;
import com.draw.practice.widget.CircleIndicatorView;

public class IndicatorActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ViewPager vp;
    private CircleIndicatorView indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicator);
        vp = (ViewPager) findViewById(R.id.vp);
        indicator = (CircleIndicatorView) findViewById(R.id.indicator);
        vp.setAdapter(new ViewPagerAdapter(this));
        indicator.setViewPager(vp);
        indicator.setPageSelected(0);
        vp.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        indicator.setPageSelected(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
