package com.example.testgym;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetalisExc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalis_exc);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent = getIntent();
        int id = (int) intent.getExtras().get("body_id");

        Bodybuilding body = Bodybuilding.body[id];

        ImageView image = (ImageView) findViewById(R.id.excchest);
        image.setImageResource(body.getIdImage());

        TextView txtName = (TextView) findViewById(R.id.txtName);
        TextView txtDesc = (TextView) findViewById(R.id.txtDesc);

        txtName.setText(body.getName());
        txtDesc.setText(body.getDescription());

    }
}