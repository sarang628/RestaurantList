package com.sarang.screen_restaurantlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;

import com.sarang.screen_restaurantlist.databinding.RestaurantListFragmentBinding;

public class RestaurantListFragment extends Fragment {

    private RestaurantListViewModel mViewModel;
    private RestaurantListFragmentBinding mBinding;

    public static RestaurantListFragment newInstance() {
        return new RestaurantListFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.restaurant_list_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding = RestaurantListFragmentBinding.bind(view);
        mBinding.rvRestaurantList.setAdapter(new RestaurantListRvAdt());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RestaurantListViewModel.class);
    }

    private RestaurantListRvAdt getAdapter() {
        return (RestaurantListRvAdt) mBinding.rvRestaurantList.getAdapter();
    }

    public static void go(FragmentManager fragmentManager, int layoutId) {
        fragmentManager.beginTransaction()
                .add(layoutId, new RestaurantListFragment())
                .addToBackStack(RestaurantListFragment.class.getSimpleName())
                .commit();
    }

}
