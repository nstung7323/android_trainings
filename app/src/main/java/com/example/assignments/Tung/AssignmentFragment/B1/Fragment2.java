package com.example.assignments.Tung.AssignmentFragment.B1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.assignments.R;
import com.example.assignments.Tung.AssignmentFragment.B2.Send;

public class Fragment2 extends Fragment {
    public TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.asm_fragment_b1_fragment_2, container, false);
        result = (TextView) root.findViewById(R.id.result);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        result.setText(((Activity2) getActivity()).RESULT);
    }

}