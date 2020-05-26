package com.example.booksells;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private TextView termsConditionTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        init();
    }

    private void init() {

        termsConditionTV = findViewById(R.id.termsConditionTV);
        termsConditionTV.setPaintFlags(termsConditionTV.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}
