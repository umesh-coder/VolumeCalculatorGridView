package com.example.volumecalculator;

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

public class CustomVolumeAdapter extends ArrayAdapter<ShapeModel> {
    private ArrayList<ShapeModel> shapeModelArrayList;
    Context context;

    public CustomVolumeAdapter(ArrayList<ShapeModel> shapeModelArrayList, Context context) {
        super(context, R.layout.grid_item_layout,shapeModelArrayList);
        this.shapeModelArrayList = shapeModelArrayList;
        this.context = context;
    }

    private static class VolumeViewHolder {
        ImageView shapeImg;
        TextView shapeName;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ShapeModel shapeModels= getItem(position);

        VolumeViewHolder volumeViewHolder;

        if(convertView ==null){
        volumeViewHolder=new VolumeViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grid_item_layout,parent,false);

            volumeViewHolder.shapeName = (TextView) convertView.findViewById(R.id.shapeName);
            volumeViewHolder.shapeImg = (ImageView) convertView.findViewById(R.id.shapeImg);


            convertView.setTag(volumeViewHolder);

        }else {

            volumeViewHolder = (VolumeViewHolder) convertView.getTag();

        }

        //getting data from model

        volumeViewHolder.shapeName.setText(shapeModels.getShapeName());
        volumeViewHolder.shapeImg.setImageResource(shapeModels.getShapeImg());

        return convertView;
    }
}
