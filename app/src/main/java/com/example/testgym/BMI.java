package com.example.testgym;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BMI extends AppCompatActivity {

    EditText heightText, weightText;
    Button calculateCaloriesButton;
    double bmiResult = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bmi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        heightText = findViewById(R.id.editTextHeight);
        weightText = findViewById(R.id.editTextwieght);
        calculateCaloriesButton = findViewById(R.id.calculateCaloriesButton);

        calculateCaloriesButton.setOnClickListener(view -> {
            if (bmiResult != -1) {
                Intent intent = new Intent(BMI.this, CalorieCalculator.class);
                intent.putExtra("bmi", bmiResult);
                startActivity(intent);
            } else {
                Toast.makeText(BMI.this, "Please calculate your BMI first", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onCalculateClick(View view) {
        double height = 0;
        double weight = 0;

        if (!heightText.getText().toString().equals("") && Double.parseDouble(heightText.getText().toString()) != 0) {
            height = Double.parseDouble(heightText.getText().toString());
        }

        if (!weightText.getText().toString().equals("") && Double.parseDouble(weightText.getText().toString()) != 0) {
            weight = Double.parseDouble(weightText.getText().toString());
        }

        Helath helath = new Helath();
        bmiResult = helath.calculteBMI(height, weight);

        if (bmiResult != -1) {
            String category = helath.determineCatagory(bmiResult);

            String resText = "Your BMI is " + String.format("%.2f", bmiResult) + "\nBMI Category: " + category;

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("BMI");
            alertDialogBuilder.setMessage(resText);
            alertDialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    heightText.setText("");
                    weightText.setText("");
                    calculateCaloriesButton.setVisibility(View.VISIBLE);
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        } else {
            Toast.makeText(this, helath.getErrorMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}

