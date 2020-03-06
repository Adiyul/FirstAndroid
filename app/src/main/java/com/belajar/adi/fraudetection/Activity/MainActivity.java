package com.belajar.adi.fraudetection.Activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.belajar.adi.fraudetection.Fragment.AccountFragment;
import com.belajar.adi.fraudetection.Fragment.BeritaFragment;
import com.belajar.adi.fraudetection.Fragment.HomeFragment;
import com.belajar.adi.fraudetection.Fragment.KeranjangFragment;
import com.belajar.adi.fraudetection.R;

public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set content view, ini juga bisa diganti pake  layout yg lain kalo dalam kasus tertentu
        setContentView(R.layout.activity_main);
        //for hide bottom navigationbar when keyboard appear
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);

        //define bottomNav
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        //set click listener, untuk menerima response dan menjalankan perintah ketika di click
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        //default halaman
        loadFragment(new HomeFragment());
    }


    //buat load fragment dinamis
    private boolean loadFragment(Fragment fragment){
        if(fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment).commit();//jadi cukup kaya gini
            return  true;

        }
        return false;
    }

    // daftar isi perintah yang akan di eksekusi ketika item2 atau menu2 yang ada
    //di bottomNavigation di click
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.nav_home: loadFragment(new HomeFragment());
                            break;
                        case R.id.nav_berita: loadFragment(new BeritaFragment());
                            break;
                        case R.id.nav_keranjang: loadFragment(new KeranjangFragment());
                            break;
                        case R.id.nav_account: loadFragment(new AccountFragment());
                            break;
                    }
                    return false;
                }
            };
}
