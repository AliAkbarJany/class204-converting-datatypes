package com.rafsan.class204convertingdatatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextBuy,editTextSell;
    Button buttonCalculate;
    TextView textViewCalculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBuy = findViewById(R.id.editTextBuy);
        editTextSell = findViewById(R.id.editTextSell);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewCalculation = findViewById(R.id.textViewCalculation);


        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String buyString = editTextBuy.getText().toString();
                String sellString = editTextSell.getText().toString();

                float float_buyStringPrice, float_sellStringPrice,profit,loss;

                float_buyStringPrice = Float.parseFloat(buyString);
                float_sellStringPrice = Float.parseFloat(sellString);

                if(float_sellStringPrice > float_buyStringPrice){

                    profit = float_sellStringPrice - float_buyStringPrice;
                    textViewCalculation.setText("PROFIT IS = "+profit);
                }
                else {

                    loss = float_buyStringPrice - float_sellStringPrice;
                    textViewCalculation.setText("LOSS IS = "+loss);
                }





            }
        });


    }
}