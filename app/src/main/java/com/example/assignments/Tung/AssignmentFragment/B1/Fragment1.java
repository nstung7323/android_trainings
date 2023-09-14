package com.example.assignments.Tung.AssignmentFragment.B1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.assignments.R;

public class Fragment1 extends Fragment {
    private Button btnPassData;
    private EditText data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.asm_fragment_b1_fragment_1, container, false);
        btnPassData = (Button) root.findViewById(R.id.btn_pass_data);
        data = (EditText) root.findViewById(R.id.data);

        btnPassData.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), Activity2.class);
            intent.putExtra("DATA", data.getText().toString());
            startActivity(intent);
        });

        return root;
    }
}