package com.example.calculatorcooper;

import java.util.Stack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Stack<Double> stack = new Stack<Double>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result = findViewById(R.id.textView);

        //Declaring function buttons and listeners
        Button divisButton = (Button) findViewById(R.id.divisBut);
        divisButton.setOnClickListener(this);

        Button addButton = (Button) findViewById(R.id.addBut);
        addButton.setOnClickListener(this);

        Button subButton = (Button) findViewById(R.id.subBut);
        subButton.setOnClickListener(this);


        Button multButton = (Button) findViewById(R.id.multBut);
        multButton.setOnClickListener(this);

        Button ceButton = (Button) findViewById(R.id.ceBut);
        ceButton.setOnClickListener(this);

        Button clearButton = (Button) findViewById(R.id.clearBut);
        clearButton.setOnClickListener(this);

        Button signButton = (Button) findViewById(R.id.signBut);
        signButton.setOnClickListener(this);

        Button equalsButton = (Button) findViewById(R.id.equalsBut);
        equalsButton.setOnClickListener(this);

        //Declaring numbers button and listeners
        Button zeroBut = (Button) findViewById(R.id.zeroBut);
        zeroBut.setOnClickListener(this);

        Button oneBut = (Button) findViewById(R.id.oneBut);
        oneBut.setOnClickListener(this);

        Button twoBut = (Button) findViewById(R.id.twoBut);
        twoBut.setOnClickListener(this);

        Button threeBut = (Button) findViewById(R.id.threeBut);
        threeBut.setOnClickListener(this);

        Button fourBut = (Button) findViewById(R.id.fourBut);
        fourBut.setOnClickListener(this);

        Button fiveBut = (Button) findViewById(R.id.fiveBut);
        fiveBut.setOnClickListener(this);

        Button sixBut = (Button) findViewById(R.id.sixBut);
        sixBut.setOnClickListener(this);

        Button sevenBut = (Button) findViewById(R.id.sevenBut);
        sevenBut.setOnClickListener(this);

        Button eightBut = (Button) findViewById(R.id.eightBut);
        eightBut.setOnClickListener(this);

        Button nineBut = (Button) findViewById(R.id.nineBut);
        nineBut.setOnClickListener(this);

    }



    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.oneBut:
                // do your code
                break;

            case R.id.twoBut:
                // do your code
                break;

            case R.id.threeBut:
                // do your code
                break;


            case R.id.fourBut:
                // do your code
                break;


            case R.id.fiveBut:
                break;

            case R.id.sixBut:
                break;

            case R.id.sevenBut:
                break;

            case R.id.eightBut:
                break;


            case R.id.nineBut:
                break;


            case R.id.deciBut:
                break;


            case R.id.zeroBut:
                break;

            case R.id.signBut:
                break;


            case R.id.clearBut:
                break;


            case R.id.ceBut:
                break;


            case R.id.addBut:
                break;



            case R.id.subBut:
                break;

            case R.id.multBut:
                break;


            case R.id.divisBut:
                break;


            case R.id.equalsBut:
                break;



            default:
                break;

        }

    }



}

