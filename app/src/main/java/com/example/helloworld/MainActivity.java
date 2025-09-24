package com.example.helloworld;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tvDemoLabel;
    Button changeColorButton;

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
                tvDemoLabel.setTextColor(Color.parseColor("#FF0000"));
                tvDemoLabel.setBackgroundColor(Color.GRAY );
            }
        });
    }

    public void changeTextClick(View view) {

        tvDemoLabel.setText("Hello World! Updated");
    }
}
//Main changes
//Main changes
//Main changes
//Main changes
//Main changes
