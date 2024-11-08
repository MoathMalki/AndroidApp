package com.example.testgym;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class exercises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercises);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayAdapter<Bodybuilding> listAdapter = new ArrayAdapter<Bodybuilding>(this,
                android.R.layout.simple_list_item_1,
                Bodybuilding.body);

        ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {

                if (position == 0) {

                    Intent intent = new Intent(exercises.this,
                            DetalisExc.class);

                    intent.putExtra("body_id", (int) id);
                    startActivity(intent);

                } else if (position == 1) {

                    Intent intent = new Intent(exercises.this,
                            DetalisExc.class);

                    intent.putExtra("body_id", (int) id);
                    startActivity(intent);

                } else if (position == 2) {


                    Intent intent = new Intent(exercises.this,
                            DetalisExc.class);

                    intent.putExtra("body_id", (int) id);
                    startActivity(intent);

                }

            };
        };
        listView.setOnItemClickListener(itemClickListener);



    }
}