package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.calculator.ButtonState.*;

public class MainActivity extends AppCompatActivity {

    TextView formulaText, answerText;
    Button zeroButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton,
            sevenButton, eightButton, nineButton, decimalButton, plusButton, minusButton,
            mutiplyButton, divideButton, equalsButton, percentButton, radicalButton, deleteButton,
            clearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAllComponents();
    }

    private void initAllComponents() {
        formulaText = findViewById(R.id.formula_text);
        answerText = findViewById(R.id.answer_text);
        decimalButton = findViewById(R.id.decimal_button);
        setOnClickListener(decimalButton, DECIMAL);
        zeroButton = findViewById(R.id.zero_button);
        setOnClickListener(zeroButton, 0);
        oneButton = findViewById(R.id.one_button);
        setOnClickListener(oneButton, 1);
        twoButton = findViewById(R.id.two_button);
        setOnClickListener(twoButton, 2);
        threeButton = findViewById(R.id.three_button);
        setOnClickListener(threeButton, 3);
        fourButton = findViewById(R.id.four_button);
        setOnClickListener(fourButton, 4);
        fiveButton = findViewById(R.id.five_button);
        setOnClickListener(fiveButton, 5);
        sixButton = findViewById(R.id.six_button);
        setOnClickListener(sixButton, 6);
        sevenButton = findViewById(R.id.seven_button);
        setOnClickListener(sevenButton, 7);
        eightButton = findViewById(R.id.eight_button);
        setOnClickListener(eightButton, 8);
        nineButton = findViewById(R.id.nine_button);
        setOnClickListener(nineButton, 9);
        plusButton = findViewById(R.id.plus_button);
        setOnClickListener(plusButton, PLUS);
        minusButton = findViewById(R.id.minus_button);
        setOnClickListener(minusButton, MINUS);
        mutiplyButton = findViewById(R.id.multiply_button);
        setOnClickListener(mutiplyButton, MUTIPLY);
        divideButton = findViewById(R.id.divide_button);
        setOnClickListener(divideButton, DIVIDE);
        equalsButton = findViewById(R.id.equals_button);
        setOnClickListener(equalsButton, EQUALS);
        zeroButton = findViewById(R.id.zero_button);
        setOnClickListener(zeroButton, 0);
        percentButton = findViewById(R.id.percent_button);
        setOnClickListener(percentButton, PERCENT);
        radicalButton = findViewById(R.id.radical_button);
        setOnClickListener(radicalButton, RADICAL);
        deleteButton = findViewById(R.id.delete_button);
        setOnClickListener(deleteButton, DELETE);
        clearButton = findViewById(R.id.clear_button);
        setOnClickListener(clearButton, CLEAR);
    }

    private void setOnClickListener(final Button button, final int num) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n = num;
                switch (n) {
                    case CLEAR:

                        break;
                    case DELETE:

                        break;
                    case EQUALS:


                }
                Toast.makeText(MainActivity.this, n.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }


}
