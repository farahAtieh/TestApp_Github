package com.example.testapp_github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double result = subTwoNumbers(80, 14);
    }

    private int subTwoNumbers(int x, int y){
        return x - y;
    }
    private int addTwoNumbers(int x, int y){
        return x + y;
    }
    private int mulTwoNumbers(int x, int y){
        return x * y;
    }
    private int divTwoNumbers(int x, int y){
        return x / y;
    }
}
