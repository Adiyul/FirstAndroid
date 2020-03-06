package com.belajar.adi.fraudetection.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.belajar.adi.fraudetection.Adapter.DaftarBelanjaAdapter;
import com.belajar.adi.fraudetection.Model.DaftarBelanja;
import com.belajar.adi.fraudetection.R;

import java.util.ArrayList;

/**
 * Created by lenovo on 2/18/2020.
 */

public class KeranjangFragment extends Fragment {


    View rootView;
    private ArrayList<DaftarBelanja> DaftarBelanjaArrayList;
    private RecyclerView recyclerView;
    private DaftarBelanjaAdapter daftarBelanjaAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView =  inflater.inflate(R.layout.fragment_keranjang, container, false);
        //init data
        addData();
        //inisiasi recyclerview = ngisi object rv
        recyclerView  = rootView.findViewById(R.id.rv_keranjang);
        daftarBelanjaAdapter = new DaftarBelanjaAdapter(DaftarBelanjaArrayList);
        layoutManager = new LinearLayoutManager(rootView.getContext()); //only fragment, activity (Class.this)
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(daftarBelanjaAdapter);
        return rootView;
    }

    void addData(){
        DaftarBelanjaArrayList = new ArrayList<>();
        DaftarBelanjaArrayList.add(new DaftarBelanja("Gergaji", "Rp 30.000", "3"));
        DaftarBelanjaArrayList.add(new DaftarBelanja("Ps 3", "Rp 3.550.000", "1"));
        DaftarBelanjaArrayList.add(new DaftarBelanja("Sepatu Vans", "Rp 2.200.000", "2"));
        DaftarBelanjaArrayList.add(new DaftarBelanja("Kaos Deus", "Rp 420.000", "1"));
        DaftarBelanjaArrayList.add(new DaftarBelanja("Dimas Maulana", "1414370309", "123456789"));
        DaftarBelanjaArrayList.add(new DaftarBelanja("Fadly Yonk", "1214234560", "987654321"));
        DaftarBelanjaArrayList.add(new DaftarBelanja("Ariyandi Nugraha", "1214230345", "987648765"));
        DaftarBelanjaArrayList.add(new DaftarBelanja("Aham Siswana", "1214378098", "098758124"));
        DaftarBelanjaArrayList.add(new DaftarBelanja("Dimas Maulana", "1414370309", "123456789"));
        DaftarBelanjaArrayList.add(new DaftarBelanja("Fadly Yonk", "1214234560", "987654321"));
        DaftarBelanjaArrayList.add(new DaftarBelanja("Ariyandi Nugraha", "1214230345", "987648765"));
        DaftarBelanjaArrayList.add(new DaftarBelanja("Aham Siswana", "1214378098", "098758124"));


    }

}
