package com.example.assignments.Tung.AssignmentActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.assignments.R;

public class Activity3 extends AppCompatActivity {
    private Button btnAsmActivityAtv3Back;
    private Button btnAsmActivityAtv3Close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asm_activity_3);

        btnAsmActivityAtv3Back = (Button) findViewById(R.id.btn_asm_activity_atv3_back);
        btnAsmActivityAtv3Close = (Button) findViewById(R.id.btn_asm_activity_atv3_close);

        btnAsmActivityAtv3Back.setOnClickListener(v -> {
            finish();
        });
        btnAsmActivityAtv3Close.setOnClickListener(v -> {
            finishAndRemoveTask();
        });
    }
}