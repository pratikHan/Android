package com.bing.moviestream;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View slideLayout =  layoutInflater.inflate(R.layout.slide_item,null);


        ImageView slideImg = slideLayout.findViewById(R.id.slide_imageView);
        TextView slideImageText = slideLayout.findViewById(R.id.slide_title);
        slideImg.setImageResource(slides.get(position).getImage());
        slideImageText.setText(slides.get(position).getTitle());

        container.addView(slideLayout);


        return slideLayout;
    }


}
