package com.sarang.screen_restaurantlist;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.torang_core.data.model.Restaurant;

import java.util.ArrayList;

class RestaurantListRvAdt extends RecyclerView.Adapter<RestaurantListVH> {
    ArrayList<Restaurant> restaurants = new ArrayList<>();

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        if (restaurants == null)
            return;
        
        this.restaurants = restaurants;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RestaurantListVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return RestaurantListVH.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantListVH holder, int position) {
        holder.setRestaurant(restaurants.get(position));
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }
}
