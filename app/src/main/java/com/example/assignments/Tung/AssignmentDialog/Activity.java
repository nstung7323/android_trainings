package com.example.assignments.Tung.AssignmentDialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.assignments.R;

public class Activity extends AppCompatActivity {
    private Button btnDialog;
    private Button btnDialogFramgnet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asm_dialog);

        btnDialog = (Button) findViewById(R.id.btn_dialog);
        btnDialogFramgnet = (Button) findViewById(R.id.btn_dialog_framgnet);

        btnDialog.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(Activity.this);
            builder.setTitle("Thông báo");
            builder.setMessage("Đây là một Dialog ...");
            builder.setNegativeButton("Close", (dialog, which) -> dialog.dismiss());
            builder.setPositiveButton("Thanks", (dialog, which) -> {
                Toast.makeText(this, "Xin cảm ơn", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });

            Dialog dialog = builder.create();
            dialog.show();
        });

        btnDialogFramgnet.setOnClickListener(v -> {
            CustomDialog customDialog = new CustomDialog();
            customDialog.show(getSupportFragmentManager(), "MyDialogFragment");
        });
    }
}