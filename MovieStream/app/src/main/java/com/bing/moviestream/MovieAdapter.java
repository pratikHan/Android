package com.bing.moviestream;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MViewHolder> {


    Context context;
    List<Movie> movieList;

    public MovieAdapter(Context context, List<Movie> movies){

        this.context = context;
        this.movieList = movies;
    }

    @NonNull
    @Override
    public MViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_movie,parent,false);

        return new MViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MViewHolder holder, int position) {

        holder.thumbnail.setImageResource(movieList.get(position).getThumbnail());
        holder.textTitle.setText(movieList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }


    public class MViewHolder extends ViewHolder{

        private TextView textTitle;
        private ImageView thumbnail;




        public MViewHolder(@NonNull View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.item_movie_title);
            thumbnail = itemView.findViewById(R.id.item_movie_thumbnail);

        }
    }
}
