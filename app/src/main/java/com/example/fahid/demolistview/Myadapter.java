package com.example.fahid.demolistview;

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

import java.util.List;




/**
 * Created by FAHID on 9/1/2018.
 */

public class Myadapter extends ArrayAdapter<Model> {

    List<Model> modelList;
    Context context;
    int resource;


    public Myadapter(Context context, int resource,  List<Model> modelList) {
        super(context, resource, modelList);
        this.context=context;
        this.resource=resource;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(resource,null,false);
        TextView textView=view.findViewById(R.id.text1);
        TextView textView1=view.findViewById(R.id.text2);
        ImageView imageView=view.findViewById(R.id.image);

        Model model=modelList.get(position);

        imageView.setImageDrawable(context.getResources().getDrawable(model.getImage()));
        textView.setText(model.getName());
        textView1.setText(model.getDivision());



      return view;
    }
}
