package com.example.assignments.Tung.AssignmentDialog;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class CustomDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Thông báo");
        builder.setMessage("Đây là một Dialog ...");
        builder.setNegativeButton("Close", (dialog, which) -> dialog.dismiss());
        builder.setPositiveButton("Thanks", (dialog, which) -> {
            Toast.makeText(getContext(), "Xin cảm ơn", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });

        return builder.create();
    }
}
