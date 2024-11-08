package com.example.testgym;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.graphics.Insets;

public class MainActivity extends AppCompatActivity {
    private Button bmibutton;
    private Button execises;
    private Button loss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bmibutton = findViewById(R.id.bmibutton);
        execises = findViewById(R.id.execises);
        loss = findViewById(R.id.loss);

        bmibutton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BMI.class);
            startActivity(intent);
        });

        execises.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this , exercises.class);
            startActivity(intent);

        });

       loss.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this , WeightLoss.class);
            startActivity(intent);

        });


    }
}

