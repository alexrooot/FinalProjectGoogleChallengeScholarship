package com.example.android.finalprojectgooglechallengescholarship;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Lesson_1_Activity extends AppCompatActivity {

    @SuppressLint("StringFormatInvalid")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_1_);
        final ArrayList<ArrayListRadioButton> arrayListRadioButtonObject = new ArrayList<ArrayListRadioButton>();

        //Question 1
        arrayListRadioButtonObject.add(new ArrayListRadioButton(
                getString(R.string.Question_Number_1),
                getString(R.string.Radio_Question_asked_1),
                getString(R.string.Radio_questions_Option1),
                getString(R.string.Radio_questions_Option2),
                getString(R.string.Radio_questions_Option3),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Radio_questions_Option2),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear)));

        //Question 2
        arrayListRadioButtonObject.add(new ArrayListRadioButton(
                getString(R.string.Question_Number_2),
                getString(R.string.Radio_Question_asked_2),
                getString(R.string.Radio_questions_Option4),
                getString(R.string.Radio_questions_Option2),
                getString(R.string.Radio_questions_Option3),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Radio_questions_Option3),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear)));

        //Question 3
        arrayListRadioButtonObject.add(new ArrayListRadioButton(
                getString(R.string.Question_Number_3),
                getString(R.string.Radio_Question_asked_3),
                "True",
                "False",
                "It is not code",
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                "True",
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear)));

        //Question 4
        arrayListRadioButtonObject.add(new ArrayListRadioButton(
                getString(R.string.Question_Number_4),
                getString(R.string.Radio_Question_asked_4),
                getString(R.string.Radio_questions_Option3),
                getString(R.string.Radio_questions_Option2),
                getString(R.string.Radio_questions_Option4),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Radio_questions_Option4),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear)));

        //Question 5
        arrayListRadioButtonObject.add(new ArrayListRadioButton(
                getString(R.string.Question_Number_5),
                getString(R.string.Radio_Question_asked_5),
                getString(R.string.Radio_questions_Option5),
                getString(R.string.Radio_questions_Option2),
                getString(R.string.Radio_questions_Option4),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Radio_questions_Option5),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear)));
        //Question 6
        arrayListRadioButtonObject.add(new ArrayListRadioButton(
                getString(R.string.Question_Number_6),
                getString(R.string.Radio_Question_asked_6),
                getString(R.string.Radio_questions_Option7),
                getString(R.string.Radio_questions_Option1),
                getString(R.string.Radio_questions_Option5),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Radio_questions_Option7),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear)));



        final CustomeRadioListViewAdapter objectcomplteListView = new CustomeRadioListViewAdapter (this, arrayListRadioButtonObject);

        ListView mListView = (ListView) findViewById(R.id.list);

        mListView.setAdapter(objectcomplteListView);


    }
}

        /**
         *

        final ArrayList<customArrayList> recyclerContentObject = new ArrayList<customArrayList>();


        //Question 1
        recyclerContentObject.add(new customArrayList(
                getString(R.string.Question_Number_1),
                String.format(getString(R.string.Lesson_1_Question_1_Asked)),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Lesson_1_Question_1_answer),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear))) ;
        //Question 2
        recyclerContentObject.add(new customArrayList(
                getString(R.string.Question_Number_2),
                String.format(getString(R.string.Lesson_1_Question_2_Asked)),
                R.mipmap.thumbs_up_green_contextual,
                R.mipmap.thumbs_down_red_contextual,
                getString(R.string.Lesson_1_Question_2_answer),
                getString(R.string.Button_Submit),
                getString(R.string.Button_Clear))) ;

        final CustomeArrayAdapterForRecyceler customeArrayAdapterForRecycelerObject = new CustomeArrayAdapterForRecyceler(this ,recyclerContentObject);
        //Find the XML file that has a groupview as the main root view to be ListView
        ListView listview = (ListView)findViewById(R.id.list);

        listview.setAdapter(customeArrayAdapterForRecycelerObject);

        //check answer




    }

}
*/