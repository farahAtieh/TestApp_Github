package com.example.testapp_github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double result = subTwoNumbers(20, 14);
    }

    private double subTwoNumbers(double x, double y){
        return x - y;
    }
    private double addTwoNumbers(double x, double y){
        return x + y;
    }
    private double mulTwoNumbers(double x, double y){
        return x * y;
    }
    private double divTwoNumbers(double x, double y){
        return x / y;
    }
}
