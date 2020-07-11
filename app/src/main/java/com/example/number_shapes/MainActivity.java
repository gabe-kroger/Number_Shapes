package com.example.number_shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    class Number{
        int number;

        public boolean isSquare(){
            double squareRoot = Math.sqrt(number);
            if(squareRoot == Math.floor(squareRoot) ){return true;}
            else{return false;}
        }

        public boolean isTriangular(){
            int x = 1;
            int triangularNumber = 1;
            while(triangularNumber < number){
                x++;
                triangularNumber += x;
            }
            if(triangularNumber == number){return true;}
            else{return false;}
        }
    }

    public void testNumberFunction(View view){
        EditText userNumber = (EditText) findViewById(R.id.numberText);
        int testNumber = Integer.parseInt(userNumber.getText().toString());


        Number myNumber = new Number();
        myNumber.number = testNumber;
        if(myNumber.isSquare()){
            if(myNumber.isTriangular()){
                Toast.makeText(this, "This number is square and triangular!", Toast.LENGTH_SHORT).show();
            }
            else if(myNumber.isSquare()){
                Toast.makeText(this, "This number is square!", Toast.LENGTH_SHORT).show();
            }
            } else if(myNumber.isTriangular()){
            Toast.makeText(this, "This number is triangular!", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "This number is neither square nor triangular.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}