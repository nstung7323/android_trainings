package com.dientc203.examplefragment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements InterfaceOnchangeData{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void sendDataToFragment2(String data) {
        Fragment2 fragment2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        fragment2.receiveData(data);
    }

    @Override
    public void sendDataToFragment1(String data) {
        Fragment1 fragment1 = (Fragment1) getSupportFragmentManager().findFragmentById(R.id.fragment1);
        fragment1.receiveData(data);
    }
}