package com.example.planetsapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<modelClass>{


   private ArrayList<modelClass> planetArrayList;
   Context context;

    public MyCustomAdapter( ArrayList<modelClass> planetArrayList, Context context) {
        super(context, R.layout.item_list_layout,planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context;
    }

    public static class MyViewHolder{
        TextView planetname;
        TextView countMoon;
        ImageView planetImg;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get the Planet object from the Current Position
        modelClass planet =getItem(position);

        //Inflate Layout
        MyViewHolder myViewHolder;
        final View result;

        if (convertView == null){
            myViewHolder = new MyViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView =inflater.inflate(R.layout.item_list_layout, parent, false);

            //finding Views

            myViewHolder.planetname=(TextView) convertView.findViewById(R.id.planetname);
            myViewHolder.countMoon=(TextView) convertView.findViewById(R.id.Mooncount);
            myViewHolder.planetImg=(ImageView) convertView.findViewById(R.id.image);

            result =convertView;
            convertView.setTag(myViewHolder);
        }
        else
        {
        myViewHolder = (MyViewHolder) convertView.getTag();
        result =convertView;

        }

        myViewHolder.planetname.setText(planet.getPlanetName());
        myViewHolder.countMoon.setText(planet.getCountMoon());
        myViewHolder.planetImg.setImageResource(planet.getPlanetImg());
        return result;

    }
}
