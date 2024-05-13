package com.example.planetapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Planet> planetsArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview); // at the top of your activity in MainActivity.java
        planetsArrayList = new ArrayList<>();
        planetsArrayList.add(new Planet(R.drawable.mercury,"Mercury","0 Moons"));
        planetsArrayList.add(new Planet(R.drawable.venus,"Venus","0 Moons"));
        planetsArrayList.add(new Planet(R.drawable.earth,"Earth","1 Moons"));
        planetsArrayList.add(new Planet(R.drawable.mars,"Mars","2 Moons"));
        planetsArrayList.add(new Planet(R.drawable.jupiter,"Jupiter","79 Moons"));
        planetsArrayList.add(new Planet(R.drawable.saturn,"Saturn","83 Moons"));
        planetsArrayList.add(new Planet(R.drawable.uranus,"Uranus","27 Moons"));
        planetsArrayList.add(new Planet(R.drawable.neptune,"Neptune","14 Moons"));
        planetsArrayList.add(new Planet(R.drawable.pluto,"Pluto","5 Moons"));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        PlanetcstmAdapter planetcstmAdapter = new PlanetcstmAdapter(planetsArrayList,MainActivity.this);
        listView.setAdapter(planetcstmAdapter);
    }
}