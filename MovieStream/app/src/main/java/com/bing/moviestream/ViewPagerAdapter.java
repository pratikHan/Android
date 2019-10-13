package com.bing.moviestream;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    Context mcontext;
    List<Slide> slides;

    public ViewPagerAdapter(Context context, List<Slide> slides) {
        this.mcontext = context;
        this.slides = slides;
    }

    @Override
    public int getCount() {
        return slides.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }


}
