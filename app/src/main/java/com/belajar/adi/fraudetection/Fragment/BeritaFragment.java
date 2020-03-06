package com.belajar.adi.fraudetection.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.belajar.adi.fraudetection.Adapter.SliderItemAdapter;
import com.belajar.adi.fraudetection.Model.SliderItem;
import com.belajar.adi.fraudetection.R;

import java.util.ArrayList;

/**
 * Created by lenovo on 2/18/2020.
 */

public class BeritaFragment extends Fragment {


    View rootView;
    private ArrayList<SliderItem> sliderItemArrayList;
    private RecyclerView recyclerView;
    private SliderItemAdapter sliderItemAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_berita, container, false);

        addData();

        recyclerView  = rootView.findViewById(R.id.rv_berita);
        sliderItemAdapter = new SliderItemAdapter(sliderItemArrayList);
        layoutManager = new GridLayoutManager(rootView.getContext(),4); //only fragment, activity (Class.this)
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(sliderItemAdapter);
        return rootView;

    }

    void addData() {
        sliderItemArrayList = new ArrayList<>();
        sliderItemArrayList.add(new SliderItem("1", "1414370309", getResources().getDrawable(R.drawable.item_one)));
        sliderItemArrayList.add(new SliderItem("2", "1214234560", getResources().getDrawable(R.drawable.item_two)));
        sliderItemArrayList.add(new SliderItem("3", "1214230345", getResources().getDrawable(R.drawable.item_three)));
        sliderItemArrayList.add(new SliderItem("4", "1214378098", getResources().getDrawable(R.drawable.item_four)));
    }

}
