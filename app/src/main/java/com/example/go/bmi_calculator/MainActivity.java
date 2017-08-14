package com.example.go.bmi_calculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    //Declare our User Interface instance variables


    EditText editText9, editText8,editText2;
    Button calculateBMI;
    TextView text_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText2 = (EditText) findViewById(R.id.editText2);  //feet
        editText8 = (EditText) findViewById(R.id.editText8);  //inches
        editText9 = (EditText) findViewById(R.id.editText9);   //pounds
        calculateBMI = (Button) findViewById(R.id.calculateBMI);
        text_result = (TextView) findViewById(R.id.result);

        calculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String results = BMIcalculation.calculatingBMI(editText2,editText8,editText9);

                text_result = setText(results);



        };

    }
       // clickListener



}




}


