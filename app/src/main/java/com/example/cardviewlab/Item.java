package com.example.cardviewlab;

import android.graphics.Bitmap;

public class Item {
    public Bitmap image;
    public String title;
    public String date;

    public Item(Bitmap image, String title, String date){
        this.image = image;
        this.title = title;
        this.date = date;
    }
}
