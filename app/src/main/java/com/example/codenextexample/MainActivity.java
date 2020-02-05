package com.example.codenextexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoogleSearchFragment fragment = GoogleSearchFragment.createInstance();

        Calculator calculator = Calculator.newInstance();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragment).commit();


    }
}
