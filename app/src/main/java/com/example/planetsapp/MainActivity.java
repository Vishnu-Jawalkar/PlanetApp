package com.example.planetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<modelClass> planetArrayList;

    private static MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.List1);

        planetArrayList= new ArrayList<>();

        modelClass planet1 =new modelClass("Earth","1",R.drawable.earth);
        modelClass planet2 =new modelClass("Mercury","0",R.drawable.mercury);
        modelClass planet3 = new modelClass("Venus", "0",R.drawable.venus);
        modelClass planet4 = new modelClass("Mars","2 Moons",R.drawable.mars);
        modelClass planet5 = new modelClass("Jupiter", "79 Moons",R.drawable.jupiter);
        modelClass planet6 = new modelClass("Saturn","83 Moons",R.drawable.saturn);
        modelClass planet7 = new modelClass("Uranus","27 Moons", R.drawable.uranus);
        modelClass planet8 = new modelClass("Neptune","14 Moons",R.drawable.neptune);
        modelClass planet9 = new modelClass("Pluto", "12 Moons", R.drawable.pluto);

        planetArrayList.add(planet1);
        planetArrayList.add(planet2);
        planetArrayList.add(planet3);
        planetArrayList.add(planet4);
        planetArrayList.add(planet5);
        planetArrayList.add(planet6);
        planetArrayList.add(planet7);
        planetArrayList.add(planet8);
        planetArrayList.add(planet9);


        adapter =new MyCustomAdapter(planetArrayList,getApplicationContext());

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "Planet Name: "+adapter.getItem(position).getPlanetName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}