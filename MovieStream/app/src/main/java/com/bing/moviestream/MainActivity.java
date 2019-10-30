package com.bing.moviestream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    List<Slide> slides;
    ViewPager slidePager;
    private TabLayout tab_indicator;
    private RecyclerView moviesRV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab_indicator = findViewById(R.id.indicator_tabs);
        moviesRV = findViewById(R.id.movies_rv);

        slides = new ArrayList<>();
        slidePager = findViewById(R.id.slide_pager);
        slides.add(new Slide(R.drawable.a,"Spectre"));
        slides.add(new Slide(R.drawable.b,"Avengers"));

        slides.add(new Slide(R.drawable.g,"The Freedom"));
        slides.add(new Slide(R.drawable.e,"The WolfMan"));

        ViewPagerAdapter adapter = new ViewPagerAdapter(this,slides);
        slidePager.setAdapter(adapter);

        //set Timer for Tabs
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MainActivity.SlideTimer(),7000,3000);

        tab_indicator.setupWithViewPager(slidePager,true);


        //setup for ViewPager



        List<Movie> mList = new ArrayList<>();
        mList.add(new Movie("The Kid",R.drawable.kid));
        mList.add(new Movie("Meters",R.drawable.meters));
        mList.add(new Movie("Mulan",R.drawable.mulan));
        mList.add(new Movie("Random",R.drawable.z));
        mList.add(new Movie("Great Road",R.drawable.o));

        MovieAdapter movieAdapter = new MovieAdapter(this,mList);
        moviesRV.setAdapter(movieAdapter);
        moviesRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));




    }


    class SlideTimer extends TimerTask{


        @Override
        public void run() {

            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (slidePager.getCurrentItem() < slides.size() -1){

                        slidePager.setCurrentItem(slidePager.getCurrentItem()+1);
                    }
                    else {
                        slidePager.setCurrentItem(0);
                    }
                }
            });
        }
    }
}
