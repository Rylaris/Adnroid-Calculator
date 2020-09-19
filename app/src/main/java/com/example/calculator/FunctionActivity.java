package com.example.calculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.*;

public class FunctionActivity extends AppCompatActivity {

    Button sinButton, cosButton;
    TextView sinResult, cosResult;
    EditText sinValue, cosValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);
        initComponents();
    }

    private void initComponents() {
        sinButton = findViewById(R.id.sin_button);
        cosButton = findViewById(R.id.cos_button);
        sinResult = findViewById(R.id.sinResult_text);
        cosResult = findViewById(R.id.cosResult_text);
        sinValue = findViewById(R.id.sinValue_text);
        cosValue = findViewById(R.id.cosValue_text);

        sinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sin();
            }
        });

        cosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cos();
            }
        });
    }

    private void sin() {
        String val = String.valueOf(sinValue.getText());
        if (val.isEmpty()) {
            return;
        }
        Double value = Double.parseDouble(String.valueOf(sinValue.getText()));
        Double result = Math.sin(value);
        sinResult.setText("=" + result.toString());
    }

    private void cos() {
        String val = String.valueOf(cosValue.getText());
        if (val.isEmpty()) {
            return;
        }
        Double value = Double.parseDouble(String.valueOf(cosValue.getText()));
        Double result = Math.cos(value);
        cosResult.setText("=" + result.toString());
    }

}
