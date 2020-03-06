package com.belajar.adi.fraudetection.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.belajar.adi.fraudetection.Model.ItemHome;
import com.belajar.adi.fraudetection.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by lenovo on 2/18/2020.
 */
public class HomeFragment extends Fragment {

    LinearLayout btn_ticket_pisa, btn_ticket_torri,
            btn_ticket_pagoda, btn_ticket_candi,
            btn_ticket_sphinx, btn_ticket_monas;
    ImageView photo_home_user;
    TextView user_balance,nama_lengkap,bio;
    String USERNAME_KEY = "usernamekey";
    String username_key = "";
    String username_key_new = "";
    View rootView;

    List<ItemHome> listMenu = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView =  inflater.inflate(R.layout.fragment_home, container, false);

        btn_ticket_pisa = rootView.findViewById(R.id.btn_ticket_pisa);
        btn_ticket_torri = rootView.findViewById(R.id.btn_ticket_torri);
        btn_ticket_pagoda = rootView.findViewById(R.id.btn_ticket_pagoda);
        btn_ticket_candi = rootView.findViewById(R.id.btn_ticket_candi);
        btn_ticket_sphinx = rootView.findViewById(R.id.btn_ticket_sphinx);
        btn_ticket_monas = rootView.findViewById(R.id.btn_ticket_monas);

        photo_home_user = rootView.findViewById(R.id.photo_home_user);
        user_balance = rootView.findViewById(R.id.user_balance);
        nama_lengkap = rootView.findViewById(R.id.nama_lengkap);
        bio = rootView.findViewById(R.id.bio);
        initDataMenu();
        // nah disini lu baru bisa generate menu yg 6 tadi
        // tapi lu bikin item nya dulu item layout

        return rootView;

    }

    private void initDataMenu(){
        listMenu.add(new ItemHome("Pisa", "ini isi url gambar nya"));
        listMenu.add(new ItemHome("Torri", "ini isi url gambar nya"));
        listMenu.add(new ItemHome("Pagoda", "ini isi url gambar nya"));
        listMenu.add(new ItemHome("dll", "ini isi url gambar nya"));
        listMenu.add(new ItemHome("dll", "ini isi url gambar nya"));
        listMenu.add(new ItemHome("dll", "ini isi url gambar nya"));
    }
}

