package com.example.sicapin.itemObjectClass;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.sicapin.R;

public class item_artikel_kat_seni extends ArrayAdapter {

    private Activity context;
    private String[]  tv_lv ;
    private Integer[] ic_lv ;
    public item_artikel_kat_seni(@NonNull Activity context, String[] tv_lv, Integer[] ic_lv) {
        super(context, R.layout.lv_item_kat_artikel, tv_lv);

        this.context = context;
        this.ic_lv = ic_lv;
        this.tv_lv = tv_lv;
    }

    public View getView(int position, View view, ViewGroup parrent){

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.lv_item_kat_artikel, null, true);
        TextView textView = rowView.findViewById(R.id.lvtv);
        ImageView imageView = rowView.findViewById(R.id.lv_icon);

        textView.setText(tv_lv[position]);
        imageView.setImageResource(ic_lv[position]);

        return rowView;
    }
}
