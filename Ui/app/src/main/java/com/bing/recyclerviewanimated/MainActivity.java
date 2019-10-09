package com.bing.recyclerviewanimated;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ItemsAdapter mAdapter;
    List<Item> itemList;
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.mRecyclerView);
        itemList = new ArrayList<>();


        itemList.add(new Item("Simple Title 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sed faucibus turpis in eu mi bibendum", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Simple Title 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Venus vs Mars", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Pellentesque habitant morbi tristique senectus et netus et malesuada. Et malesuada fames ac turpis.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Mars and Earth", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Scelerisque varius morbi enim nunc faucibus.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Jupiter", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eu lobortis elementum nibh tellus molestie nunc non blandit massa. Consectetur libero id faucibus nisl tincidunt eget nullam non nisi. Quam lacus suspendisse faucibus interdum posuere.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Elon Musk", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Algorithms", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Scelerisque varius morbi enim nunc faucibus.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Google Plus", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eu lobortis elementum nibh tellus molestie nunc non blandit massa. Consectetur libero id faucibus nisl tincidunt eget nullam non nisi. Quam lacus suspendisse faucibus interdum posuere.Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("January Kills", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Good Brothers", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Scelerisque varius morbi enim nunc faucibus.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Main MEthod Sucks", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eu lobortis elementum nibh tellus molestie nunc non blandit massa. Consectetur libero id faucibus nisl tincidunt eget nullam non nisi. Quam lacus suspendisse faucibus interdum posuere.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Ios", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Simple Title 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eu lobortis elementum nibh tellus molestie nunc non blandit massa. Consectetur libero id faucibus nisl tincidunt eget nullam non nisi. Quam lacus suspendisse faucibus interdum posuere.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Simple Title 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eu lobortis elementum nibh tellus molestie nunc non blandit massa. Consectetur libero id faucibus nisl tincidunt eget nullam non nisi. Quam lacus suspendisse faucibus interdum posuere.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Simple Title 5", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Simple Title 6", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Scelerisque varius morbi enim nunc faucibus.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Simple Title 7", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Simple Title 8", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Simple Title 9", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Scelerisque varius morbi enim nunc faucibus.", "02/08/2019", R.drawable.userphoto));
        itemList.add(new Item("Simple Title 0", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "02/08/2019", R.drawable.userphoto));


        mAdapter = new ItemsAdapter(this, itemList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}