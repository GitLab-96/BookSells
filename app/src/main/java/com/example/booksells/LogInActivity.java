package com.example.booksells;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    private TextView registerHereTV;
    private Button logInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        init();
        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this,MainActivity.class));
            }
        });
    }

    private void init() {
        registerHereTV = findViewById(R.id.registerHereTV);
        registerHereTV.setPaintFlags(registerHereTV.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        logInBtn = findViewById(R.id.logInBtn);
    }
}
