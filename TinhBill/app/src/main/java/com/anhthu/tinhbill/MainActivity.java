package com.anhthu.tinhbill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText amountEditText;
    TextView billTextView, taxTextView, pointsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountEditText = findViewById(R.id.amountEditText);
        billTextView = findViewById(R.id.billTextView);
        taxTextView = findViewById(R.id.taxTextView);
        pointsTextView = findViewById(R.id.pointsTextView);
    }

    public void calculateBill(View view) {
        // Lấy số tiền từ amountEditText
        EditText amountEditText = findViewById(R.id.amountEditText);
        String amountString = amountEditText.getText().toString();
        double amount = Double.parseDouble(amountString);

        // Kiểm tra checkbox và tính toán dựa trên sự lựa chọn
        String order = "Danh sách thức uống: ";
        double totalCost = amount;

        CheckBox coffeeCheckBox = findViewById(R.id.coffeeCheckBox);
        if (coffeeCheckBox.isChecked()) {
            order += "\nCà phê - 20,000 VND";
            totalCost += 20000;
        }

        CheckBox teaCheckBox = findViewById(R.id.teaCheckBox);
        if (teaCheckBox.isChecked()) {
            order += "\nTrà - 15,000 VND";
            totalCost += 15000;
        }

        // Cập nhật TextView với thông tin danh sách và tổng tiền
        TextView orderTextView = findViewById(R.id.orderTextView);
        orderTextView.setText(order);

        // Tính thuế và điểm
        double tax = totalCost * 0.08;
        double points = totalCost * 0.1;

        // Cập nhật các TextView hiển thị thông tin
        TextView billTextView = findViewById(R.id.billTextView);
        billTextView.setText("Tổng bill: " + totalCost);
        TextView taxTextView = findViewById(R.id.taxTextView);
        taxTextView.setText("Thuế 8%: " + tax);
        TextView pointsTextView = findViewById(R.id.pointsTextView);
        pointsTextView.setText("Điểm 10%: " + points);
    }


    public void calculateTax(View view) {
        // Xử lý tính thuế 8% tại đây
        // Lấy số tiền từ amountEditText, tính toán thuế và đặt kết quả vào taxTextView
    }

    public void calculatePoints(View view) {
        // Xử lý tính điểm 10% tại đây
        // Lấy số tiền từ amountEditText, tính toán điểm và đặt kết quả vào pointsTextView
    }
}