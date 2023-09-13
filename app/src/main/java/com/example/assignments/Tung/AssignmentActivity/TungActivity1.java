package com.example.assignments.Tung.AssignmentActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.assignments.R;

public class TungActivity1 extends AppCompatActivity {
    private Button btnAsmActivityAtv1Start;
    private Button btnAsmActivityAtv2Close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tung_activity_1);

        btnAsmActivityAtv1Start = (Button) findViewById(R.id.btn_asm_activity_atv1_start);
        btnAsmActivityAtv2Close = (Button) findViewById(R.id.btn_asm_activity_atv2_close);

        btnAsmActivityAtv1Start.setOnClickListener(v -> {
            Intent intent = new Intent(TungActivity1.this, TungActivity2.class);
            startActivity(intent);

        });
        btnAsmActivityAtv2Close.setOnClickListener(v -> {
            finish();
        });
    }
}