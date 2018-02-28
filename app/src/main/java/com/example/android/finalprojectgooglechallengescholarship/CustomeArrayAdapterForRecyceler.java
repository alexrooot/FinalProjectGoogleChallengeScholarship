package com.example.android.finalprojectgooglechallengescholarship;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alex on 2/5/2018.
 */

public class CustomeArrayAdapterForRecyceler extends ArrayAdapter<customArrayList> {

    private static final String LOG_TAG = CustomeArrayAdapterForRecyceler.class.getSimpleName();

    public CustomeArrayAdapterForRecyceler(Activity context, ArrayList<customArrayList> WordListClass) {
        super(context, 0, WordListClass);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    //call on the custom XML layout file to build views
                    R.layout.recycelerlayoutxml, parent, false);



        } else{
            EditText editText = (EditText) listItemView.findViewById(R.id.Your_Answer) ;
        editText.setText(null);

        TextView answerafterCheck = (TextView) listItemView.findViewById(R.id.question_text_answer_textView);
        answerafterCheck.setText(null);
        ImageView gradeImage = (ImageView) listItemView.findViewById(R.id.question_image_grad_imageView);
        gradeImage.setImageResource(android.R.color.transparent);}

        //call on the class custom that created the Object
        //Then store the index value of that custom class ArrayList
        final customArrayList currentIndex = getItem(position);

        /**
         * Make the text show for Question Number
         */
        TextView questionNumberBasedOnIndex = (TextView) listItemView.findViewById(R.id.question_numbering_textView);

        questionNumberBasedOnIndex.setText(currentIndex.getmQuestionNumber());
        /**
         * Make the text show for Question Asked
         */
        TextView questionAskBasedOnIndex = (TextView) listItemView.findViewById(R.id.question_asked_textView);

        questionAskBasedOnIndex.setText(currentIndex.getmQuestionAsked());
        /**
         * Make the text show for Submit Button
         */
        Button ButtonSubmitText = (Button) listItemView.findViewById(R.id.question_button_submit_buttonView);
        ButtonSubmitText.setText(currentIndex.getmSubmitButton());
        /**
         * Make text show on clear button
         */
        Button ButtonClearText = (Button) listItemView.findViewById(R.id.question_button_clear_buttonView);
        ButtonClearText.setText(currentIndex.getmClearButton());
        /**
         * Needs a manuel call to focus resources on EdtiText has been touched.
         */
        final EditText editText = (EditText) listItemView.findViewById(R.id.Your_Answer);
        editText.requestFocus();


        final TextView answerafterCheck = (TextView) listItemView.findViewById(R.id.question_text_answer_textView);


        //Image Box
        ImageView image = (ImageView) listItemView.findViewById(R.id.question_image_grad_imageView);
        //Answer texbox
        final TextView answerTextView = (TextView) listItemView.findViewById(R.id.question_text_answer_textView);

        final ImageView gradeImage = (ImageView) listItemView.findViewById(R.id.question_image_grad_imageView);



        ButtonSubmitText.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String viewAnswer = currentIndex.getmQuestionTextAnswer();

        if (editText.getText().toString().contains(viewAnswer) ) {
        gradeImage.setImageResource(R.mipmap.thumbs_up_green_contextual);
            MediaPlayer mediaPlayerBad = MediaPlayer.create(getContext(), R.raw.correct_bars);
            mediaPlayerBad.start();}
        else {gradeImage.setImageResource(R.mipmap.thumbs_down_red_contextual);
            answerafterCheck.setText(currentIndex.getmQuestionTextAnswer());
            MediaPlayer mediaPlayerBad = MediaPlayer.create(getContext(), R.raw.wrong_quack);
            mediaPlayerBad.start();
        }
        }
        });

        ButtonClearText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(null);
                answerafterCheck.setText(null);
                gradeImage.setImageResource(android.R.color.transparent);

            }
        });
        /**
         *

        LinearLayout LLout = (LinearLayout) listItemView.findViewById(R.id.RootLinearLaout);
        final EditText et = new (EditText) convertView.findViewById(R.id.input_text);
        et.setHint("Enter Her");
        et.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        LLout.addView(et);
         */

    return listItemView;
    }
    //public void myClickHandlerSubmit(){
   //     click = true;
    //}

//public void check(String answer, ImageView imageView,String EditTextUserinput, Button buttonView, customArrayList position) {

//}

}

