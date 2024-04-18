package com.example.planetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PlanetcstmAdapter extends ArrayAdapter<Planet> {
    ArrayList<Planet> planetArrayList;
    Context context;

    public PlanetcstmAdapter( ArrayList<Planet> planetArrayList, Context context) {
        super(context,R.layout.lstviewlayout, planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planet = getItem(position);

        MyViewHolder myViewHolder = null;
        final View result;

        if (convertView == null) {
            myViewHolder = new MyViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lstviewlayout, parent, false);
            myViewHolder.planetText = (TextView) convertView.findViewById(R.id.planetsName);
            myViewHolder.moonText = (TextView) convertView.findViewById(R.id.noOfMoons);
            myViewHolder.planetImage = (ImageView) convertView.findViewById(R.id.planetsImage);
            result = convertView;
            convertView.setTag(myViewHolder);
        }
        else {

            Toast.makeText(context, "Help", Toast.LENGTH_SHORT).show();
        }

        return convertView;

    }

    private static class MyViewHolder{
        TextView planetText,moonText;
        ImageView planetImage;
    }
}
