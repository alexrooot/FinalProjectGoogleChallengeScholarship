package com.example.android.finalprojectgooglechallengescholarship;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Alex on 2/8/2018.
 */

public class Lesson_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_1_);
        final ArrayList<customArrayList> recyclerContentObject = new ArrayList<customArrayList>();


        //Question 1
        recyclerContentObject.add(new customArrayList(
                getString(R.string.Question_Number_1),
                String.format(getString(R.string.Lesson_2_Question_1_Asked)),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Lesson_2_Question_1_answer),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear))) ;
        //Question 2
        recyclerContentObject.add(new customArrayList(
                getString(R.string.Question_Number_2),
                String.format(getString(R.string.Lesson_2_Question_2_Asked)),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Lesson_2_Question_2_answer),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear))) ;
        //Question 3
        recyclerContentObject.add(new customArrayList(
                getString(R.string.Question_Number_3),
                String.format(getString(R.string.Lesson_2_Question_3_Asked)),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Lesson_2_Question_3_answer),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear))) ;
        //Question 4
        recyclerContentObject.add(new customArrayList(
                getString(R.string.Question_Number_4),
                String.format(getString(R.string.Lesson_2_Question_4_Asked)),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Lesson_2_Question_4_answer),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear))) ;
        //Question 5
        recyclerContentObject.add(new customArrayList(
                getString(R.string.Question_Number_5),
                String.format(getString(R.string.Lesson_2_Question_5_Asked)),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Lesson_2_Question_5_answer),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear))) ;
        //Question 6
        recyclerContentObject.add(new customArrayList(
                getString(R.string.Question_Number_6),
                String.format(getString(R.string.Lesson_2_Question_6_Asked)),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Lesson_2_Question_6_answer),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear))) ;
        //Question 7
        recyclerContentObject.add(new customArrayList(
                getString(R.string.Question_Number_7),
                String.format(getString(R.string.Lesson_2_Question_7_Asked)),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Lesson_2_Question_7_answer),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear))) ;

        final CustomeArrayAdapterForRecyceler customeArrayAdapterForRecycelerObject = new CustomeArrayAdapterForRecyceler(this ,recyclerContentObject);
        //Find the XML file that has a groupview as the main root view to be ListView
        ListView listview = (ListView)findViewById(R.id.list);

        listview.setAdapter(customeArrayAdapterForRecycelerObject);

        //check answer




    }

}
