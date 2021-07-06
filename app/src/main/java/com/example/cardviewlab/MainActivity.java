package com.example.cardviewlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap defaultImage;
        defaultImage =
                BitmapFactory.decodeResource(getResources(), R.mipmap.cookie_foreground);

        items =   new ArrayList<Item>();
        for (int i = 0 ; i< 50; ++i){
            items.add(new Item(
                    defaultImage,
                    String.format("Title-%d",i),
                    new SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault()).format(new Date())
            ));
        }

        ItemAdapter adapter = new ItemAdapter(this,items);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}