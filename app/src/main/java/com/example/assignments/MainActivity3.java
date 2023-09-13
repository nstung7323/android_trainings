package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private Button btnCloseActivity3;
    private Button btnBack;
    private TextView textView;
    private static final String TAG = "DIENTC_ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnCloseActivity3 = (Button) findViewById(R.id.btn_close);
        btnBack = (Button) findViewById(R.id.btn_back);
        textView = (TextView) findViewById(R.id.textView);
        btnCloseActivity3.setOnClickListener(view -> {
            closeApp();
        });
        btnBack.setOnClickListener(view -> {
            closeApp();
        });
    }

    private void closeApp() {
        finishAndRemoveTask();
    }

    @Override
    public void onBackPressed() {
        finishAndRemoveTask();
        super.onBackPressed();
    }
}