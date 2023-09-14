package com.example.assignments.Tung.AssignmentFragment.B1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.assignments.R;

public class Activity2 extends AppCompatActivity {
    public String RESULT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asm_fragment_b1_activity_2);

        RESULT = getIntent().getStringExtra("DATA");
        Log.d("zzzzzzzzz", "onCreate: " + RESULT);
    }
}