package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @SuppressLint("DefaultLocale")
    public void convertCurrency(View view) {
        // Get user input
        EditText userInput = (EditText) findViewById(R.id.userInput);
        // Convert user input from EditText to String
        String inputToString = userInput.getText().toString();
        // Convert input String to Double
        double stringToDouble = Double.parseDouble(inputToString);
        // Current USD to BAM rate
        double usdToBamRate = 0.53;
        // Calculate rate
        double calculation = stringToDouble * usdToBamRate;
        // Convert calculated double to String with 2 decimal places only
        String output = String.format("%.2f", calculation);

        // Create a toast and output the formatted output
        Toast.makeText(this, inputToString + "BAM is " + "$" + output, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}