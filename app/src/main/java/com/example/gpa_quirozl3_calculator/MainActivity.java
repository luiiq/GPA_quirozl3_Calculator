package com.example.gpa_quirozl3_calculator;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    EditText first, second, third, fourth, fifth,result;
   ConstraintLayout lay;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lay = (ConstraintLayout)findViewById(R.id.layout);

        first = (EditText) findViewById(R.id.first);

        second = (EditText) findViewById(R.id.second);
        third = (EditText) findViewById(R.id.third);
        fourth = (EditText) findViewById(R.id.fourth);
        fifth = (EditText) findViewById(R.id.fifth);
        result = (EditText) findViewById(R.id.result);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                double res;
                double gradeValue1 = 0;
                double gradeValue2 = 0;
                double gradeValue3 = 0;
                double gradeValue4 = 0;
                double gradeValue5 = 0;
                String one = "", two = "", three = "", four = "", five = "";

                one = (first.getText().toString());
                if (one.equals("A") || one.equals("a"))
                    gradeValue1 = 4.00;
                else if (one.equals("A-") || one.equals("a-"))
                    gradeValue1 = 3.67;
                else if (one.equals("B+") || one.equals("b+"))
                    gradeValue1 = 3.33;
                else if (one.equals("B") || one.equals("b"))
                    gradeValue1 = 3.00;
                else if (one.equals("B-") || one.equals("b-"))
                    gradeValue1 = 2.67;
                else if (one.equals("C+") || one.equals("c+"))
                    gradeValue1 = 2.33;
                else if (one.equals("C") || one.equals("c"))
                    gradeValue1 = 2.00;
                else if (one.equals("C-") || one.equals("c-"))
                    gradeValue1 = 1.70;
                else if (one.equals("D+") || one.equals("d+"))
                    gradeValue1 = 1.33;
                else if (one.equals("D") || one.equals("d"))
                    gradeValue1 = 1.00;
                else if (one.equals("F"))
                    gradeValue1 = 0;
                else if (one.equals("FX"))
                    gradeValue1 = 0;
                else
                    System.out.println("Invalid Grade");

                two = (second.getText().toString());

                if (two.equals("A") || two.equals("a"))
                    gradeValue2 = 4.00;
                else if (two.equals("A-") || two.equals("a-"))
                    gradeValue2 = 3.67;
                else if (two.equals("B+") || two.equals("b+"))
                    gradeValue2 = 3.33;
                else if (two.equals("B") || two.equals("b"))
                    gradeValue2 = 3.00;
                else if (two.equals("B-") || two.equals("b-"))
                    gradeValue2 = 2.67;
                else if (two.equals("C+") || two.equals("c+"))
                    gradeValue2 = 2.33;
                else if (two.equals("C") || two.equals("c"))
                    gradeValue2 = 2.00;
                else if (two.equals("C-") || two.equals("c-"))
                    gradeValue2 = 1.70;
                else if (two.equals("D+") || two.equals("d+"))
                    gradeValue2 = 1.33;
                else if (two.equals("D") || two.equals("d"))
                    gradeValue2 = 1.00;
                else if (two.equals("F") || two.equals("f"))
                    gradeValue2 = 0;
                else if (two.equals("FX") || two.equals("fx"))
                    gradeValue2 = 0;
                else
                    System.out.println("Invalid Grade");

                three = (third.getText().toString());

                if (three.equals("A") || three.equals("a"))
                    gradeValue3 = 4.00;
                else if (three.equals("A-") || three.equals("a-"))
                    gradeValue3 = 3.67;
                else if (three.equals("B+") || three.equals("b+"))
                    gradeValue3 = 3.33;
                else if (three.equals("B") || three.equals("b"))
                    gradeValue3 = 3.00;
                else if (three.equals("B-") || three.equals("b-"))
                    gradeValue3 = 2.67;
                else if (three.equals("C+") || three.equals("c+"))
                    gradeValue3 = 2.33;
                else if (three.equals("C") || three.equals("c"))
                    gradeValue3 = 2.00;
                else if (three.equals("C-") || three.equals("c-"))
                    gradeValue3 = 1.70;
                else if (three.equals("D+") || three.equals("d+"))
                    gradeValue3 = 1.33;
                else if (three.equals("D") || three.equals("d"))
                    gradeValue3 = 1.00;
                else if (three.equals("F") || three.equals("f"))
                    gradeValue3 = 0;
                else if (three.equals("FX") || three.equals("fx"))
                    gradeValue3 = 0;
                else
                    System.out.println("Invalid Grade");

                four = (fourth.getText().toString());

                if (four.equals("A") || four.equals("a"))
                    gradeValue4 = 4.00;
                else if (four.equals("A-") || four.equals("a-"))
                    gradeValue4 = 3.67;
                else if (four.equals("B+") || four.equals("b+"))
                    gradeValue4 = 3.33;
                else if (four.equals("B") || four.equals("b"))
                    gradeValue4 = 3.00;
                else if (four.equals("B-") || four.equals("b-"))
                    gradeValue4 = 2.67;
                else if (four.equals("C+")|| four.equals("c+"))
                    gradeValue4 = 2.33;
                else if (four.equals("C") || four.equals("c"))
                    gradeValue4 = 2.00;
                else if (four.equals("C-") || four.equals("c-"))
                    gradeValue4 = 1.70;
                else if (four.equals("D+") || four.equals("d+"))
                    gradeValue4 = 1.33;
                else if (four.equals("D")|| four.equals("d"))
                    gradeValue4 = 1.00;
                else if (four.equals("F")|| four.equals("f"))
                    gradeValue4 = 0;
                else if (four.equals("FX") || four.equals("fx"))
                    gradeValue4 = 0;
                else
                    System.out.println("Invalid Grade");

                five = (fifth.getText().toString());

                if (five.equals("A") || five.equals("a"))
                    gradeValue5 = 4.00;
                else if (five.equals("A-") || five.equals("a-"))
                    gradeValue5 = 3.67;
                else if (five.equals("B+") || five.equals("b+"))
                    gradeValue5 = 3.33;
                else if (five.equals("B") || five.equals("b"))
                    gradeValue5 = 3.00;
                else if (five.equals("B-") || five.equals("b-"))
                    gradeValue5 = 2.67;
                else if (five.equals("C+") || five.equals("c+"))
                    gradeValue5 = 2.33;
                else if (five.equals("C") || five.equals("c"))
                    gradeValue5 = 2.00;
                else if (five.equals("C-") || five.equals("c-"))
                    gradeValue5 = 1.70;
                else if (five.equals("D+") || five.equals("d+"))
                    gradeValue5 = 1.33;
                else if (five.equals("D")|| five.equals("d"))
                    gradeValue5 = 1.00;
                else if (five.equals("F") || five.equals("f"))
                    gradeValue5 = 0;
                else if (five.equals("FX") || five.equals("fx"))
                    gradeValue5 = 0;
                else
                    System.out.println("Invalid Grade");
                res = (gradeValue1 + gradeValue2 + gradeValue3 + gradeValue4 + gradeValue5) / 5;
                result.setText(String.valueOf(res));

                if (res <= 1.00) {
                    lay.setBackgroundColor(Color.RED);
                }
                if (res > 1.00 & res < 2.67) {
                    lay.setBackgroundColor(Color.YELLOW);
                }
                if (res >= 2.67) {
                    lay.setBackgroundColor(Color.GREEN);

                }






            }
        });
    }}



