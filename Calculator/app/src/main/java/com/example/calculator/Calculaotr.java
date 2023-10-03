package com.example.calculator;

public class no3 extends AppCompatActivity {

    private EditText number1EditText, number2EditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no3);

        number1EditText = findViewById(R.id.number1);
        number2EditText = findViewById(R.id.number2);
        resultTextView = findViewById(R.id.result);

        Button addButton = findViewById(R.id.add_button);
        Button subtractButton = findViewById(R.id.subtract_button);
        Button multiplyButton = findViewById(R.id.multiply_button);
        Button divideButton = findViewById(R.id.divide_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("+");
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("-");
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("*");
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("/");
            }
        });
    }

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
                    resultTextView.setText("Cannot divide by zero");
                    return;
                }
                break;
        }

        resultTextView.setText("Result: " + result);
    }
}

