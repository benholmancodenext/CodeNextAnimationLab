package com.example.codenextexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimationExampleFragment fragment = AnimationExampleFragment.createInstance();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragment).commit();


    }
}
