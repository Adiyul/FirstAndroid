package com.belajar.adi.fraudetection.Model;

import android.graphics.drawable.Drawable;

/**
 * Created by lenovo on 2/22/2020.
 */

public class SliderItem {

    private String id;
    private String nama;
    private Drawable img;

    public SliderItem(String id, String nama, Drawable img) {
        this.id = id;
        this.nama = nama;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }
}
