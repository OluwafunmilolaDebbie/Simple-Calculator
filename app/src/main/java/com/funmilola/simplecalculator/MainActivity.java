package com.funmilola.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1EditText, num2EditText;
    TextView mTextView;
    Button aButton, sButton, mButton, dButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1EditText = findViewById(R.id.firstNumberEditText);
        num2EditText = findViewById(R.id.secondNumberEditText);
        mTextView = findViewById(R.id.textView);
        aButton = findViewById(R.id.additionButton);
        sButton = findViewById(R.id.subtractionButton);
        mButton = findViewById(R.id.multiplyButton);
        dButton = findViewById(R.id.divisionButton);


        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFigures();
            }


        });
        sButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtractFigures();
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplyFigures();
            }
        });

        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divideFigures();
            }
        });
    }
    private void subtractFigures() {
        String firstValue = num1EditText.getText().toString();
        String secondValue = num2EditText.getText().toString();
        double d1 = Double.parseDouble(firstValue);
        double d2 = Double.parseDouble(secondValue);
        double subtracted = d1 - d2;
        mTextView.setText("" + subtracted);
    }
    private void multiplyFigures() {
        String firstValue = num1EditText.getText().toString();
        String secondValue = num2EditText.getText().toString();
        double d1 = Double.parseDouble(firstValue);
        double d2 = Double.parseDouble(secondValue);
        double multiplied = d1 * d2;
        mTextView.setText("" + multiplied);
    }
    private void divideFigures() {
        String firstValue = num1EditText.getText().toString();
        String secondValue = num2EditText.getText().toString();
        double d1 = Double.parseDouble(firstValue);
        double d2 = Double.parseDouble(secondValue);
        double divided = d1 / d2;
        mTextView.setText("" + divided);
    }
    private void addFigures() {
        String firstValue = num1EditText.getText().toString();
        String secondValue = num2EditText.getText().toString();
        double d1 = Double.parseDouble(firstValue);
        double d2 = Double.parseDouble(secondValue);
         double added = d1 + d2;
        mTextView.setText("" + added);
    }
}