package com.phuoc.demodatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.phuoc.demodatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding pActivityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Cách 1: giống viewbinding
        // pActivityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        // Cách 2:
        pActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MainViewModel mainViewModel = new MainViewModel("Phuoc 123");
        pActivityMainBinding.setMainViewModel(mainViewModel);

        // setContentView(R.layout.activity_main);

    }
}