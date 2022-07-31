package com.sarang.screen_restaurantlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sarang.screen_restaurantlist.databinding.ItemRestaurantBinding;
import com.example.torang_core.data.model.Restaurant;

class RestaurantListVH extends RecyclerView.ViewHolder {
    ItemRestaurantBinding itemRestaurantBinding;

    public RestaurantListVH(@NonNull ItemRestaurantBinding itemRestaurantBinding) {
        super(itemRestaurantBinding.getRoot());
        this.itemRestaurantBinding = itemRestaurantBinding;
    }

    public static RestaurantListVH create(ViewGroup parent) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        ItemRestaurantBinding binding = ItemRestaurantBinding.inflate(inflator, parent, false);
        return new RestaurantListVH(binding);
    }

    public void setRestaurant(final Restaurant restaurant) {
        itemRestaurantBinding.setRestaurant(restaurant);
        itemRestaurantBinding.ivRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}
