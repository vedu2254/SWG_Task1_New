package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class studyMaterialsAdapter extends ArrayAdapter {
    List<String> listTitle;
    List<String> listURL;


    Context context;


    public studyMaterialsAdapter(@NonNull Context context, List<String> title, List<String> url) {
        super(context, R.layout.pds_resources, title);

        this.listTitle=title;
        this.listURL=url;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(context).inflate(R.layout.pds_resources,parent,false);
//        ImageView imageView=view.findViewById(R.id.imageView);
        TextView textView3=view.findViewById(R.id.textView3);

        textView3.setText(listTitle.get(position));


        return view;

    }
}
