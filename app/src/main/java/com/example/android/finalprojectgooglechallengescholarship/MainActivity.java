package com.example.android.finalprojectgooglechallengescholarship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView quiz1 = (TextView) findViewById(R.id.quiz_aText);
        quiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWhenClick = new Intent(MainActivity.this, Lesson_1_Activity.class);
                startActivity(intentWhenClick);
            }
        });

        TextView quiz2 = (TextView) findViewById(R.id.quiz_bText);
        quiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentwhenclick = new Intent(MainActivity.this, Lesson_2_Activity.class);
                startActivity(intentwhenclick);
            }
        });

        TextView quiz3 = (TextView) findViewById(R.id.quiz_CText);
        quiz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWhenClick = new Intent(MainActivity.this, Lesson_3_Activity.class);
                startActivity(intentWhenClick);
            }
        });

        TextView quiz4 = (TextView) findViewById(R.id.quiz_dText);
        quiz4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWhenClick = new Intent(MainActivity.this, Lesson_4_Activity.class);
                startActivity(intentWhenClick);
            }
        });

        /**
         *

        // make textview lesson_1_quiz and object
        TextView textViewFinderLesson1 = (TextView) findViewById(R.id.lesson_1_quiz);
        //create and overwrite method that is activated by setOnClickListener on object
        textViewFinderLesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentWhenTextViewClcik = new Intent(MainActivity.this, Lesson_1_Activity.class);
                startActivity(intentWhenTextViewClcik);
            }
        });

        TextView lesson2 = (TextView) findViewById(R.id.lesson_2_quiz_ID);

        lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lesson2Intent = new Intent(MainActivity.this,Lesson_2_Activity.class);
                startActivity(lesson2Intent);
            }
        });

        TextView lesson3 = (TextView) findViewById(R.id.lesson_3_quiz_ID);

        lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lesson3Intent = new Intent(MainActivity.this,Lesson_3_Activity.class);
                startActivity(lesson3Intent);
            }
        });

        TextView lesson4 = (TextView) findViewById(R.id.lesson_4_quiz_ID);

        lesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lesson4Intent = new Intent(MainActivity.this,Lesson_4_Activity.class);
                startActivity(lesson4Intent);
            }
        });

        TextView lesson5 = (TextView) findViewById(R.id.lesson_5_quiz_ID);

        lesson5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lesson5Intent = new Intent(MainActivity.this,Lesson_5_Activity.class);
                startActivity(lesson5Intent);
            }
        });

        TextView lesson6 = (TextView) findViewById(R.id.lesson_6_quiz_ID);

        lesson6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lesson6Intent = new Intent(MainActivity.this,Lesson_6_Activity.class);
                startActivity(lesson6Intent);
            }
        });


        TextView lesson7 = (TextView) findViewById(R.id.lesson_7_quiz_ID);

        lesson7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lesson7Intent = new Intent(MainActivity.this,Lesson_7_Activity.class);
                startActivity(lesson7Intent);
            }
        });


        TextView lesson8 = (TextView) findViewById(R.id.lesson_8_quiz_ID);

        lesson8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lesson8Intent = new Intent(MainActivity.this,Lesson_8_Activity.class);
                startActivity(lesson8Intent);
            }
        });
         */
    }
}
