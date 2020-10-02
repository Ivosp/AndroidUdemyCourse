package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollDice = (Button)findViewById(R.id.rollDice);



    }

    public void onBtnClicked(View view) {

        Random rndObj = new Random();
        int myRndNo = rndObj.nextInt(6);
        int mySecondRndNo = rndObj.nextInt(6);
        System.out.println(myRndNo);
        System.out.println(mySecondRndNo);


        int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};
        String[] dices = {"dice1.png", "dice2.png", "dice3.png", "dice4.png", "dice5.png", "dice6.png"};

        ImageView dice1 = findViewById(R.id.dice1);
        ImageView dice2 = findViewById(R.id.dice2);

        dice1.setImageResource(diceArray[myRndNo]);
        dice2.setImageResource(diceArray[mySecondRndNo]);

        int diceNo1 = myRndNo + 1;
        int diceNo2 = mySecondRndNo + 1;

        Toast.makeText(this, "You rolled " + diceNo1 + " and " + diceNo2, Toast.LENGTH_SHORT).show();
        // Log.i("Buttonclick", "Onclickactivated");

    }
}