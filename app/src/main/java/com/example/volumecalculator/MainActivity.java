package com.example.volumecalculator;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    GridView gridView;
    ArrayList<ShapeModel> shapeModelArrayList;

    CustomVolumeAdapter customVolumeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.volume_grid_view);
        shapeModelArrayList = new ArrayList<>();


        ShapeModel s1 = new ShapeModel(R.drawable.sphere,"Sphere");
        ShapeModel s2 = new ShapeModel(R.drawable.cylinder,"Cylinder");
        ShapeModel s3 = new ShapeModel(R.drawable.cube,"Cube");
        ShapeModel s4 = new ShapeModel(R.drawable.prism,"Prism");

        shapeModelArrayList.add(s1);
        shapeModelArrayList.add(s2);
        shapeModelArrayList.add(s3);
        shapeModelArrayList.add(s4);

        customVolumeAdapter = new CustomVolumeAdapter(shapeModelArrayList,getApplicationContext());

        gridView.setAdapter(customVolumeAdapter);

        gridView.setNumColumns(2);




    }
}