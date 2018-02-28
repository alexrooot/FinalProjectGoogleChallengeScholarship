package com.example.android.finalprojectgooglechallengescholarship;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Alex on 2/9/2018.
 */

public class Lesson_5_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_1_);
        final ArrayList<customArrayList> recyclerContentObject = new ArrayList<customArrayList>();


        //Question 1
        recyclerContentObject.add(new customArrayList(
                getString(R.string.Question_Number_1),
                String.format(getString(R.string.Lesson_5_Question_1_Asked)),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Lesson_5_Question_1_answer),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear))) ;
        //Question 2
        recyclerContentObject.add(new customArrayList(
                getString(R.string.Question_Number_2),
                String.format(getString(R.string.Lesson_5_Question_2_Asked)),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Lesson_5_Question_2_answer),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear))) ;



        final CustomeArrayAdapterForRecyceler customeArrayAdapterForRecycelerObject = new CustomeArrayAdapterForRecyceler(this ,recyclerContentObject);
        //Find the XML file that has a groupview as the main root view to be ListView
        ListView listview = (ListView)findViewById(R.id.list);

        listview.setAdapter(customeArrayAdapterForRecycelerObject);

        //check answer




    }
}
