package com.example.go.bmi_calculator;


import android.widget.EditText;

public class BMIcalculation {

    static boolean isEmpty(EditText field) {

        if ( field.getText().length() == 0 ) {

            return true;
        }

        else { return false; }



    }

    static String calculatingBMI (EditText feet, EditText inches, EditText pounds){

        String results = "Results: ";



        int feet = Integer.parseInt(feet.getText().toString());
        int inches = Integer.parseInt(inches.getText().toString());
        int pounds = Integer.parseInt(pounds.getText().toString());

        int total_height = feet *12 + inches;

        double BMI = Math.round(pounds *703/ Math.pow(total_height, 2);
        results += "Your BMI is " + BMI + "!";




        return results;

    }


}
