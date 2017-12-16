package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlo on 14/07/2016.
 */

public class ITActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

        List<InformationTechnology> assignments = new ArrayList<>();

        assignments.add(new InformationTechnology(13, "Nota de cuaderno", 1));
        assignments.add(new InformationTechnology(14, "Práctica", 2));
        assignments.add(new InformationTechnology(15, "Examen mensual", 1));
        assignments.add(new InformationTechnology(16, "Examen bimestral", 2));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_assignments_grades);
        recyclerView.setLayoutManager(new LinearLayoutManager(ITActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new ITAdapter(assignments, ITActivity.this));
    }
}
