package com.putuguna.staggeredgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCar;
    private StaggeredGridLayoutManager mGridViewLayoutManager;
    private CarAdapter mAdapter;

    private List<CarModel> carModelList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCar = (RecyclerView) findViewById(R.id.recyclerview_car);

        carModelList.add(new CarModel(R.drawable.apv, "APV","150 Juta",5,"YES"));
        carModelList.add(new CarModel(R.drawable.avanza, "AVANZA","170 Juta",2,"NO"));
        carModelList.add(new CarModel(R.drawable.jazzrs, "JAZZ RS","200 Juta",3,"YES"));
        carModelList.add(new CarModel(R.drawable.bmw, "BMW","500 Juta",2,"NO"));
        carModelList.add(new CarModel(R.drawable.inova, "INOVA","180 Juta",5,"NO"));
        carModelList.add(new CarModel(R.drawable.karimun, "KARIMUN","120 Juta",7,"YES"));
        carModelList.add(new CarModel(R.drawable.splash, "SPLASH","100 Juta",2,"NO"));
        carModelList.add(new CarModel(R.drawable.swift, "SWIFT","140 Juta",4,"NO"));
        carModelList.add(new CarModel(R.drawable.kapsul, "KJG KAPSUL","150 Juta",3,"YES"));

        mAdapter = new CarAdapter(carModelList, this);

        recyclerViewCar.setHasFixedSize(true);
        mGridViewLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        mGridViewLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        recyclerViewCar.setLayoutManager(mGridViewLayoutManager);
        recyclerViewCar.setAdapter(mAdapter);
        SpacesItemDecorationGridView decoration = new SpacesItemDecorationGridView(10);
        recyclerViewCar.addItemDecoration(decoration);

    }
}
