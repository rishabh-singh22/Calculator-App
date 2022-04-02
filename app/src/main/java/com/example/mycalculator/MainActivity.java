package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etfirstValue,etsecondValue;
    TextView tvAns;
    Button add,subtract,multiply,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirstValue = findViewById(R.id.firstNum);
        etsecondValue = findViewById(R.id.secondNum);

        tvAns = findViewById(R.id.tvAns);

        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btenMultiply);
        divide  = findViewById(R.id.btnDivide);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue,ans;

                firstValue = Integer.parseInt(etfirstValue.getText().toString());
                secondValue = Integer.parseInt(etsecondValue.getText().toString());

                ans = firstValue + secondValue;
                tvAns.setText("Answer is = " + ans);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue,ans;

                firstValue = Integer.parseInt(etfirstValue.getText().toString());
                secondValue = Integer.parseInt(etsecondValue.getText().toString());

                ans = firstValue - secondValue;
                tvAns.setText("Answer is = "+ ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue,ans;

                firstValue = Integer.parseInt(etfirstValue.getText().toString());
                secondValue = Integer.parseInt(etsecondValue.getText().toString());

                ans = firstValue * secondValue;
                tvAns.setText("Answer is = " +ans);
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstValue, secondValue;
                double ans;

                firstValue = Integer.parseInt(etfirstValue.getText().toString());
                secondValue = Integer.parseInt(etsecondValue.getText().toString());

                ans = firstValue / secondValue;
                tvAns.setText("Answer is = " +ans);
            }
        });



    }
}