package com.draw.practice.adapter;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.draw.practice.R;

/**
 * Created by xugang on 2016/7/15.
 * 选择设备页面ViewPager Adapter
 */
public class ViewPagerAdapter extends PagerAdapter {

    private LayoutInflater inflater;
    private int[] drawables = new int[]{R.drawable.login_bg, R.drawable.new_feature_1, R.drawable.new_feature_2, R.drawable.new_feature_3, R.drawable.new_feature_4};

    public ViewPagerAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return drawables.length;
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View imageLayout = inflater.inflate(R.layout.layout_image, view, false);
        ImageView imageView = (ImageView) imageLayout.findViewById(R.id.layoutImg);
        imageView.setImageResource(drawables[position]);
        view.addView(imageLayout, 0);
        return imageLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }
}

