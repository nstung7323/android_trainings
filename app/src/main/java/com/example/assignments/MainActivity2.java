package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    private Button btnStartActivity3;
    private Button btnCloseActivity2;
    private static final String TAG = "DIENTC_ACTIVITY";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.textView);
        btnStartActivity3 = (Button) findViewById(R.id.btn_start_activity3);
        btnCloseActivity2 = (Button) findViewById(R.id.btn_close_activity2);
        startActivity3();
        closeActivity2();
    }

    private void closeActivity2() {
        btnCloseActivity2.setOnClickListener(view -> {
            Log.d(TAG, "closeActivity2: ");
//            Intent intent = new Intent(this, MainActivity.class);
//            startActivity(intent);
            finish();
        });
    }

    private void startActivity3() {
        btnStartActivity3.setOnClickListener(view -> {
            Log.d(TAG, "startActivity3: ");
            Intent intent = new Intent(this, MainActivity3.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
//            finish();
        });
    }
}