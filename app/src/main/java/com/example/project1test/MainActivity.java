package com.example.project1test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonAdd;
    TextView textNumber;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        textNumber = (TextView) findViewById(R.id.textNumber);
        counter = 0;
    }

    public void addClicked(View view) {
        counter++;
        textNumber.setText(Integer.toString(counter));
    }

}