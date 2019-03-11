package com.example.calculatorcooper;

import java.util.Stack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Stack<String> stack = new Stack<String>();
    Boolean decimal = false;
    Boolean sign = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



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

        Button deciBut = (Button) findViewById(R.id.deciBut);
        deciBut.setOnClickListener(this);

    }



    public void onClick(View v)  {
        TextView result = findViewById(R.id.textView);

        //TODO: handle view when length is greater than 9

        switch (v.getId()) {

            case R.id.oneBut:

                stack.push("1");
                result.setText(result.getText() + stack.peek());


                break;

            case R.id.twoBut:

                stack.push("2");
                result.setText(result.getText() + stack.peek());

                break;

            case R.id.threeBut:
                stack.push("3");
                result.setText(result.getText() + stack.peek());
                break;


            case R.id.fourBut:
                stack.push("4");
                result.setText(result.getText() + stack.peek());
                break;


            case R.id.fiveBut:
                stack.push("5");
                result.setText(result.getText() + stack.peek());
                break;

            case R.id.sixBut:
                stack.push("6");
                result.setText(result.getText() + stack.peek());
                break;

            case R.id.sevenBut:
                stack.push("7");
                result.setText(result.getText() + stack.peek());
                break;

            case R.id.eightBut:
                stack.push("8");
                result.setText(result.getText() + stack.peek());
                break;


            case R.id.nineBut:
                stack.push("9");
                result.setText(result.getText() + stack.peek());
                break;


            case R.id.deciBut:

                if(!decimal){
                    stack.push(".");
                    decimal = true;
                    result.setText(result.getText() + stack.peek());

                }

                break;


            case R.id.zeroBut:
                stack.push("0");
                result.setText(result.getText() + stack.peek());
                break;

            case R.id.signBut:


                if(!sign){
                    result.setText("-" + result.getText());
                    stack.push("-");
                    sign = true;
                }else{
                    sign = false;
                    result.setText(result.getText().subSequence(1, result.getText().length()));
                }

                break;


            case R.id.clearBut:
                //Clear all

                stack = new Stack<String>();
                decimal = false;
                sign = false;

                result.setText("");

                break;


            case R.id.ceBut:
                //Clear entry
                if(stack.isEmpty()){
                    break;
                }

                if(stack.peek() == "."){
                    stack.pop();
                    decimal = false;
                    result.setText(result.getText().subSequence(0, result.getText().length() - 1));
                }else if(stack.peek() == "-"){
                    sign = false;
                    stack.pop();
                    result.setText(result.getText().subSequence(1, result.getText().length()));
                }else{
                    stack.pop();
                    result.setText(result.getText().subSequence(0, result.getText().length() - 1));
                }


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

