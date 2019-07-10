package com.saiproject.androidapk3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {



    SecureRandom secureRandomNumbers = new SecureRandom();

    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int num4 = 0;
    int num5 = 0;
    int num6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtNumber1 = findViewById(R.id.txtNumber1);
        final TextView txtNumber2 = findViewById(R.id.txtNumber2);
        final TextView txtNumber3 = findViewById(R.id.txtNumber3);
        final TextView txtNumber4 = findViewById(R.id.txtNumber4);
        final TextView txtNumber5 = findViewById(R.id.txtNumber5);
        final TextView txtNumber6 = findViewById(R.id.txtNumber6);

        ImageView imgDice = findViewById(R.id.imgDiceNumber5);
        final ImageView imgDiceNumber1 = findViewById(R.id.imgDiceNumber1);
        final ImageView imgDiceNumber2 = findViewById(R.id.imgDiceNumber2);
        final ImageView imgDiceNumber3 = findViewById(R.id.imgDiceNumber3);
        final ImageView imgDiceNumber4 = findViewById(R.id.imgDiceNumber4);
        final ImageView imgDiceNumber5 = findViewById(R.id.imgDiceNumber5);
        final ImageView imgDiceNumber6 = findViewById(R.id.imgDiceNumber6);

        Button btnRollTheDice = findViewById(R.id.btnRollTheDice);


        btnRollTheDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i =0;i < 50000 ; i++){

                    int faceNumber = 1 + secureRandomNumbers.nextInt(6);

                    switch (faceNumber){

                        case 1:
                            ++num1;
                            break;

                        case 2:
                            ++num2;
                            break;

                        case 3:
                            ++num3;
                            break;

                        case 4:
                            ++num4;
                            break;

                        case 5:
                            ++num5;
                            break;

                        case 6:
                            ++num6;
                            break;





                    }


                }      //Get a number from 1-6 for 5k times


                txtNumber1.setText(num1 + "");
                txtNumber2.setText(num2 + "");
                txtNumber3.setText(num3 + "");
                txtNumber4.setText(num4 + "");
                txtNumber5.setText(num5 + "");
                txtNumber6.setText(num6 + "");


                imgDiceNumber1.setImageResource(R.drawable.dice1);
                imgDiceNumber2.setImageResource(R.drawable.dice2);
                imgDiceNumber3.setImageResource(R.drawable.dice3);
                imgDiceNumber4.setImageResource(R.drawable.dice4);
                imgDiceNumber5.setImageResource(R.drawable.dice5);
                imgDiceNumber6.setImageResource(R.drawable.dice6);






            }
        });
    }


}
