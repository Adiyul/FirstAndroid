package com.belajar.adi.fraudetection.Model;

/**
 * Created by lenovo on 2/20/2020.
 */

public class ItemHome {
    String title;
    String url;

    public ItemHome(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
