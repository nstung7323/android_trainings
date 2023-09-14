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

public class Fragment2 extends Fragment {
    private TextView tvResultFragment2;
    private Button btnSendDataFragment2;
    private EditText edtDataFragment2;

    Send send;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.asm_fragment_b2_fragment_2, container, false);

        tvResultFragment2 = (TextView) root.findViewById(R.id.tv_result_fragment_2);
        btnSendDataFragment2 = (Button) root.findViewById(R.id.btn_send_data_fragment2);
        edtDataFragment2 = (EditText) root.findViewById(R.id.edt_data_fragment2);

        btnSendDataFragment2.setOnClickListener(v -> {
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            Fragment1 fragment1 = (Fragment1) fragmentManager.findFragmentById(R.id.b2_fragment_1);
            fragment1.setData(send.sendDataFromFragment(edtDataFragment2.getText().toString()));
        });

        return root;
    }

    public void setSend(Send send) {
        this.send = send;
    }

    public void setData(String text) {
        tvResultFragment2.setText(text);
    }

}