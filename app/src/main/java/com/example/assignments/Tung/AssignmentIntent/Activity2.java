package com.example.assignments.Tung.AssignmentIntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.assignments.R;

public class Activity2 extends AppCompatActivity {
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asm_intent_activity_2);

        tvResult = (TextView) findViewById(R.id.tv_result);

        // Get Data by Intent
        Intent intent = getIntent();
//        MyObj obj = (MyObj) intent.getSerializableExtra("DATA");
//        tvResult.setText("ID: " + obj.getId() + "\nName: " + obj.getName());

        // Get data by Bundle
        Bundle bundle = intent.getExtras();
        MyObj obj1 = (MyObj) bundle.getSerializable("DATA");
        tvResult.setText("ID: " + obj1.getId() + "\nName: " + obj1.getName());
    }
}