package com.example.assignments.Tung.AssignmentFragment.B2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.assignments.R;

public class Activity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asm_fragment_b2_activity);

        FragmentManager fm = getSupportFragmentManager();
        Fragment1 fragment1 = (Fragment1) fm.findFragmentById(R.id.b2_fragment_1);
        Fragment2 fragment2 = (Fragment2) fm.findFragmentById(R.id.b2_fragment_2);
        fragment1.setSend(send);
        fragment2.setSend(send);
    }

    private Send send = new Send() {
        @Override
        public String sendDataFromFragment(String text) {
            return text;
        }
    };
}