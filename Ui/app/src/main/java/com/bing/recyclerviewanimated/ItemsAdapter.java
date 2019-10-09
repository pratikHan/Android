package com.bing.recyclerviewanimated;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> {

    Context mContext;
    List<Item> list_items;

    public ItemsAdapter(Context context, List<Item> itemList) {
        this.mContext = context;
        this.list_items= itemList;
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View layout;
       layout = LayoutInflater.from(mContext).inflate(R.layout.item_news,parent, false);

       return new ItemsViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {

        //set animation properties
        holder.photo.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_animation));

        holder.mContainer.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_scale_animation));


        holder.title.setText(list_items.get(position).getTitle());
        holder.description.setText(list_items.get(position).getDescription());
        holder.date.setText(list_items.get(position).getDate());
        holder.photo.setImageResource(list_items.get(position).getUserPhoto());

    }

    @Override
    public int getItemCount() {
        return list_items.size();
    }

    public class ItemsViewHolder extends RecyclerView.ViewHolder {

        TextView title,description,date;
        ImageView photo;
        RelativeLayout mContainer;

        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);

            mContainer = itemView.findViewById(R.id.relativeLayout);
            title = itemView.findViewById(R.id.textViewTitle);
            description = itemView.findViewById(R.id.textViewDescription);
            date = itemView.findViewById(R.id.textViewDate);
            photo = itemView.findViewById(R.id.imageViewUser);


        }
    }
}
