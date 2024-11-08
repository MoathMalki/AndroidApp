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

public class WeightLoss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weight_loss);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ArrayAdapter<LossExercises> listAdapter = new ArrayAdapter<LossExercises>(this,
                android.R.layout.simple_list_item_1,
                LossExercises.loss);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {

                if (position == 0) {

                    Intent intent = new Intent(WeightLoss.this,
                            DetaliLoss.class);

                    intent.putExtra("loss_id", (int) id);
                    startActivity(intent);

                } else if (position == 1) {

                    Intent intent = new Intent(WeightLoss.this,
                            DetaliLoss.class);

                    intent.putExtra("loss_id", (int) id);
                    startActivity(intent);

                } else if (position == 2) {


                    Intent intent = new Intent(WeightLoss.this,
                            DetaliLoss.class);

                    intent.putExtra("loss_id", (int) id);
                    startActivity(intent);

                }

            };
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}