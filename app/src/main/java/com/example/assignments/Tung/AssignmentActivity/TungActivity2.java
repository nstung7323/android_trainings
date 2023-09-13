package com.example.assignments.Tung.AssignmentActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.assignments.R;

public class TungActivity2 extends AppCompatActivity {
    private Button btnAsmActivityAtv2Start;
    private Button btnAsmActivityAtv2Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tung_activity_2);

        btnAsmActivityAtv2Start = (Button) findViewById(R.id.btn_asm_activity_atv2_start);
        btnAsmActivityAtv2Back = (Button) findViewById(R.id.btn_asm_activity_atv2_back);

        btnAsmActivityAtv2Start.setOnClickListener(v -> {
            Intent intent = new Intent(TungActivity2.this, TungActivity3.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

        });
        btnAsmActivityAtv2Back.setOnClickListener(v -> {
            finish();
        });
    }
}