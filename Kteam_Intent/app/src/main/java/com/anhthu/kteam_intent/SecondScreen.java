package com.anhthu.kteam_intent;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondScreen extends AppCompatActivity {
    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondscreen);

        finish();
    }
    public void finish(){
        Intent data = new Intent();
        data.putExtra("return value1", "Gia tri thu 1");
        data.putExtra("return value2", "Gia tri thu 2");
        setResult(RESULT_OK, data);
        super.finish();
    }

}
