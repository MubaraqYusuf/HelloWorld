package com.example.helloworld;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tvDemoLabel;
    Button changeColorButton;
    Button changeBgButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        this.tvDemoLabel = findViewById(R.id.tvDemoLabel);
        changeColorButton = findViewById(R.id.btnChangeColor);
        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDemoLabel.setTextColor(Color.parseColor("#FFFF00"));
                tvDemoLabel.setBackgroundColor(Color.GRAY );
            }
        });

        ConstraintLayout rootLayout = findViewById(R.id.main);
        rootLayout.setBackgroundColor(Color.LTGRAY);

        changeBgButton = findViewById(R.id.btnChangeBgColor);
        changeBgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDemoLabel.setBackgroundColor(Color.GREEN );
            }
        });


    }

    public void changeTextClick(View view) {

        tvDemoLabel.setText("Hello World! Updated");
    }
    //NewBranch

}