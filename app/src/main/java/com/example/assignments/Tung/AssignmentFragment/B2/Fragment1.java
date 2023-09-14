package com.example.assignments.Tung.AssignmentFragment.B2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.assignments.R;

public class Fragment1 extends Fragment {
    private TextView tvResultFragment1;
    private Button btnSendDataFragment1;
    private EditText edtDataFragment1;

    Send send;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.asm_fragment_b2_fragment_1, container, false);

        tvResultFragment1 = (TextView) root.findViewById(R.id.tv_result_fragment_1);
        btnSendDataFragment1 = (Button) root.findViewById(R.id.btn_send_data_fragment1);
        edtDataFragment1 = (EditText) root.findViewById(R.id.edt_data_fragment1);

        btnSendDataFragment1.setOnClickListener(v -> {
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            Fragment2 fragment2 = (Fragment2) fragmentManager.findFragmentById(R.id.b2_fragment_2);
            fragment2.setData(send.sendDataFromFragment(edtDataFragment1.getText().toString()));
            send.sendDataFromFragment(edtDataFragment1.getText().toString());
        });

        return root;
    }

    public void setSend(Send send) {
        this.send = send;
    }

    public void setData(String text) {
        tvResultFragment1.setText(text);
    }
}