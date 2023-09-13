package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button btnOpenActivity2;
    private Button btnCloseActivity1;
    private static final String TAG = "DIENTC_ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        btnOpenActivity2 = (Button) findViewById(R.id.btn_open_activity2);
        btnCloseActivity1 = (Button) findViewById(R.id.btn_close_activity1);
        openActivity2();
        closeActivity1();
    }

    private void closeActivity1() {
        btnCloseActivity1.setOnClickListener(view -> {
            Log.d(TAG, "closeActivity1: ");
            finish();
        });
    }

    private void openActivity2() {
        btnOpenActivity2.setOnClickListener(view -> {
            Log.d(TAG, "openActivity2: ");
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
//            finish();
        });
    }
}