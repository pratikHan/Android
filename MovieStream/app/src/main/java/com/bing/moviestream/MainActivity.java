package com.bing.moviestream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Slide> slides;
    ViewPager slidePager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slides = new ArrayList<>();
        slidePager = findViewById(R.id.slide_pager);
        slides.add(new Slide(R.drawable.a,"Spectre"));
        slides.add(new Slide(R.drawable.b,"Avengers"));

        slides.add(new Slide(R.drawable.g,"The Freedom"));
        slides.add(new Slide(R.drawable.e,"The WolfMan"));


        ViewPagerAdapter adapter = new ViewPagerAdapter(this,slides);
        slidePager.setAdapter(adapter);

    }
}
