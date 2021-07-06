package com.example.cardviewlab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item item = (Item) getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        TextView txtTitle = convertView.findViewById(R.id.txtTitle);
        TextView txtDescription = convertView.findViewById(R.id.txtDescription);
        ImageView image = convertView.findViewById(R.id.imgMain);

        txtTitle.setText(item.title);
        txtDescription.setText(item.date);
        image.setImageBitmap(item.image);

        return convertView;
    }
}
