package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    private TextView result;
    private Button addBtn;
    private Button divBtn;
    private Button subBtn;
    private Button mulBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);

        addBtn = (Button) findViewById(R.id.add_button);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("+");
            }
        });

        private void calculate(String operator) {
            double num1 = Double.parseDouble(number1EditText.getText().toString());
            double num2 = Double.parseDouble(number2EditText.getText().toString());
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        result.setText("Cannot divide by zero");
                        return;
                    }
                    break;
            }

            result.setText("Result: " + result);
        }
    }
}