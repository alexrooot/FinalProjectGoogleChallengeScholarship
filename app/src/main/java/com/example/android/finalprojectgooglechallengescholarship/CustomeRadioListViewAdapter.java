package com.example.android.finalprojectgooglechallengescholarship;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Alex on 2/26/2018.
 */

//                                              extend to adopt the ArrayAdapter class
//                                                          <> inside it takes the data type
//                                                              in this case data type of the custom class we made
public class CustomeRadioListViewAdapter extends ArrayAdapter<ArrayListRadioButton> {

    private static final String LOG_TAG = CustomeRadioListViewAdapter.class.getSimpleName();
    //     call on the this class
    //                                                       <DataType> in this case the new class
    //                                                                                              ArrayListRadio is just reources calling withing this class
    public CustomeRadioListViewAdapter(@NonNull Context context, ArrayList<ArrayListRadioButton> ArrayListRadio) {
        //                      ArrayListRadio is the resources again.
        super(context, 0, ArrayListRadio);
    }

    @NonNull
    @Override
    // inflate the views if not already created
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;


        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_multiple_choice, parent,false
            );
            RadioButton radiochoice1 =(RadioButton) listItemView.findViewById(R.id.Option1);
            radiochoice1.setChecked(false);

            RadioButton radiochoice2 =(RadioButton) listItemView.findViewById(R.id.Option1);
            radiochoice2.setChecked(false);

            RadioButton radiochoice3 =(RadioButton) listItemView.findViewById(R.id.Option1);
            radiochoice3.setChecked(false);

            ImageView image = (ImageView) listItemView.findViewById(R.id.radio_ImageView);
            image.setImageResource(android.R.color.transparent);

        }else{
            RadioButton radiochoice1 =(RadioButton) listItemView.findViewById(R.id.Option1);
            radiochoice1.setChecked(false);

            RadioButton radiochoice2 =(RadioButton) listItemView.findViewById(R.id.Option1);
            radiochoice2.setChecked(false);

            RadioButton radiochoice3 =(RadioButton) listItemView.findViewById(R.id.Option1);
            radiochoice3.setChecked(false);

            ImageView image = (ImageView) listItemView.findViewById(R.id.radio_ImageView);
            image.setImageResource(android.R.color.transparent);}


        // call the class ArrayListRadioButton to build ListView
        // The type of data is ArrayListRadioButton
        // variable/object name in this class is called: currentIndex
        // getItem is all the data and position is just iriatration/ position.
        final ArrayListRadioButton currentIndex = getItem(position);

        //give Text to question Number TextView
        TextView questionNumber = (TextView) listItemView.findViewById(R.id.TextViewRadioQuestionNumber);
        questionNumber.setText(currentIndex.getmQuestionNumber());

        //Give Text to question Asked textView
        TextView questionAked = (TextView) listItemView.findViewById(R.id.textViewRadioQuestionAsked);
        questionAked.setText(currentIndex.getmQuestionAsked());

        //Image view set blank
        final ImageView gradeimage = (ImageView) listItemView.findViewById(R.id.radio_ImageView);

        // Give RadioButton option1 text
        final RadioButton option1 = (RadioButton) listItemView.findViewById(R.id.Option1);
        String option1Text = currentIndex.getmOption1();
        option1.setText(option1Text);

        // Give RadioButton option2 text
        final RadioButton option2 = (RadioButton) listItemView.findViewById(R.id.Option2);
        option2.setText(currentIndex.getmOption2());

        // Give RadioButton option3 text
        final RadioButton option3 = (RadioButton) listItemView.findViewById(R.id.Option3);
        option3.setText(currentIndex.getmOption3());

        //Give submite button text
        Button submiteButtonText = (Button) listItemView.findViewById(R.id.radioSubmitButton);
        submiteButtonText.setText(currentIndex.getmSubmitButton());

        //Give clear button text
        Button clearButtonText = (Button) listItemView.findViewById(R.id.radioClearButton);
        clearButtonText.setText(currentIndex.getmClearButton());



        submiteButtonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String currentAnswer = currentIndex.getmAnswer();
                int imagegradegood = currentIndex.getmImageGradeGood();
                Boolean play = false;
                 if(option1.isChecked() == true && option1.getText() == currentAnswer) {
                         gradeimage.setImageResource(currentIndex.getmImageGradeGood());
                         play = true;

                         if (option2.isChecked()) {
                             gradeimage.setImageResource(currentIndex.getmImageGradeBad());
                             //Play bad sound
                             play = false;
                         }
                         if (option3.isChecked()) {
                             gradeimage.setImageResource(currentIndex.getmImageGradeBad());
                             //Play bad sound
                             play = false;
                         }

                 }else                if(option1.isChecked() == true && option1.getText() != currentAnswer){
                    gradeimage.setImageResource(currentIndex.getmImageGradeBad());
                    //Play bad sound
                    play = false;
                }


                 if(option2.isChecked() == true && option2.getText() == currentAnswer) {
                         gradeimage.setImageResource(currentIndex.getmImageGradeGood());
                         //Play Good sound
                         play = true;
                        if (option1.isChecked()) {
                            gradeimage.setImageResource(currentIndex.getmImageGradeBad());
                            //Play bad sound
                            play = false;
                        }
                        if (option3.isChecked()) {
                            gradeimage.setImageResource(currentIndex.getmImageGradeBad());
                            //Play bad sound
                            play = false;
                        }else if(option2.isChecked() == true && option2.getText() != currentAnswer){
                            gradeimage.setImageResource(currentIndex.getmImageGradeBad());
                            //Play bad sound
                            play = false;
                    }
                }


                if(option3.isChecked() == true && option3.getText() == currentAnswer) {
                             gradeimage.setImageResource(currentIndex.getmImageGradeGood());
                            //Play Good sound
                            play = true;
                            if (option1.isChecked()) {
                                gradeimage.setImageResource(currentIndex.getmImageGradeBad());
                                //Play bad sound
                                play = false;
                            }
                            if (option2.isChecked()) {
                                gradeimage.setImageResource(currentIndex.getmImageGradeBad());
                                //Play bad sound
                                 play = false;

                            }
                }else if(option3.isChecked() == true && option3.getText() != currentAnswer){
                    gradeimage.setImageResource(currentIndex.getmImageGradeBad());
                    //Play bad sound
                    play = false;
                }
                sound(play);
            }
        });



        clearButtonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                option1.setChecked(false);
                option2.setChecked(false);
                option3.setChecked(false);
                gradeimage.setImageResource(android.R.color.transparent);
            }
        });


        return listItemView;
    }
    public void sound (Boolean soundGOrB){
        if (soundGOrB){
            MediaPlayer mediaPlayerBad = MediaPlayer.create(getContext(), R.raw.correct_bars);
            mediaPlayerBad.start();
        }else if (soundGOrB == false){
            MediaPlayer mediaPlayerBad = MediaPlayer.create(getContext(), R.raw.wrong_quack);
            mediaPlayerBad.start();
        }
    }
}
