package com.example.testgym;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalorieCalculator extends AppCompatActivity {

    private TextView calorieResultText;
    private TextView exerciseListText;
    private CheckBox exerciseTypeCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_calculator);

        // Initialize the views
        calorieResultText = findViewById(R.id.calorieResultText);
        exerciseListText = findViewById(R.id.exerciseListText);
        exerciseTypeCheckbox = findViewById(R.id.exerciseTypeCheckbox);

        double bmi = getIntent().getDoubleExtra("bmi", -1);

        if (bmi != -1) {
            String calorieMessage = calculateCalories(bmi);
            calorieResultText.setText(calorieMessage);
        } else {
            calorieResultText.setText("BMI value is not available.");
        }

        exerciseTypeCheckbox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                displayExercisesBasedOnCalories();
            } else {
                exerciseListText.setText("");
            }
        });
    }

    private String calculateCalories(double bmi) {
        int recommendedCalories;

        if (bmi < 18.5) {
            recommendedCalories = 2500;
        } else if (bmi < 25) {
            recommendedCalories = 2000;
        } else if (bmi < 30) {
            recommendedCalories = 1800;
        } else {
            recommendedCalories = 1500;
        }

        String calorieMessage = "Based on your BMI, your recommended daily calorie intake is " + recommendedCalories + " kcal.";

        if (exerciseTypeCheckbox.isChecked()) {
            displayExercisesBasedOnCalories();
        } else {
            exerciseListText.setText("");
        }

        return calorieMessage;
    }

    private void displayExercisesBasedOnCalories() {
        double bmi = getIntent().getDoubleExtra("bmi", -1);
        int recommendedCalories;

        // Calculate calories based on BMI
        if (bmi < 18.5) {
            recommendedCalories = 2500;  // Underweight - higher calorie needs
        } else if (bmi < 25) {
            recommendedCalories = 2000;  // Normal weight
        } else if (bmi < 30) {
            recommendedCalories = 1800;  // Overweight - lower calorie needs
        } else {
            recommendedCalories = 1500;  // Obese - significantly lower calorie needs
        }

        if (recommendedCalories >= 2000) {
            showBodybuildingExercises();
        } else {
            showLossExercises();
        }
    }

    private void showBodybuildingExercises() {
        StringBuilder exercisesList = new StringBuilder("Recommended Bodybuilding Exercises:\n\n");
        for (Bodybuilding exercise : Bodybuilding.body) {
            exercisesList.append(exercise.getName()).append("\n");
        }
        exerciseListText.setText(exercisesList.toString());
    }

    private void showLossExercises() {
        StringBuilder exercisesList = new StringBuilder("Recommended Weight Loss Exercises:\n\n");
        for (LossExercises exercise : LossExercises.loss) {
            exercisesList.append(exercise.getName()).append("\n");
        }
        exerciseListText.setText(exercisesList.toString());
    }

    public void onCalculateClick(View view) {
        double bmi = getIntent().getDoubleExtra("bmi", -1);
        if (bmi != -1) {
            String calorieMessage = calculateCalories(bmi);
            calorieResultText.setText(calorieMessage);
        } else {
            calorieResultText.setText("BMI value is not available.");
        }
    }
}


