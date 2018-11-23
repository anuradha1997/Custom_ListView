package com.example.anuradha.custom_listview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by anuradha on 3/18/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    String text[];
    Integer image[];
    Activity activity;

    public CustomAdapter(Activity activity,String text[],Integer image[]) {
        super(activity,R.layout.customize_layout,text);
        this.text=text;
        this.image=image;
        this.activity=activity;
    }
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        LayoutInflater inflator=activity.getLayoutInflater();
        View v=inflator.inflate(R.layout.customize_layout,null);
        ImageView imageview= (ImageView) v.findViewById(R.id.img);
        TextView textview= (TextView) v.findViewById(R.id.tv1);
        imageview.setImageResource(image[position]);
        textview.setText(text[position]);
        return v;
    }
}
