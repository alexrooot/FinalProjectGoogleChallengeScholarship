package com.example.android.finalprojectgooglechallengescholarship;

/**
 * Created by Alex on 2/26/2018.
 */

public class ArrayListRadioButton {
    private String mQuestionNumber;
    private String mQuestionAsked;
    private String mOption1;
    private String mOption2;
    private String mOption3;
    private int mImageGradeGood;
    private int mImageGradeBad;
    private String mAnswer;
    private String mSubmitButton;
    private  String mClearButton;

    public ArrayListRadioButton(String QuesstionNumber, String QuestionAsked, String Option1, String Option2, String Option3,
                                int imageGradeGood, int imageGradeBad, String Answer, String SubmiteButton, String ClearButton){


        mQuestionNumber = QuesstionNumber;
        mQuestionAsked= QuestionAsked;
        mOption1 = Option1;
        mOption2 = Option2;
        mOption3 = Option3;
        mImageGradeGood = imageGradeGood;
        mImageGradeBad = imageGradeBad;
        mAnswer = Answer;
        mSubmitButton = SubmiteButton;
        mClearButton = ClearButton;
    }
    public String getmQuestionNumber(){
        return mQuestionNumber;
    };
    public String getmQuestionAsked(){
        return mQuestionAsked;
    };
    public String getmOption1(){
        return mOption1;
    };
    public String getmOption2(){
        return mOption2;
    };
    public String getmOption3(){
        return mOption3;
    };
    public int getmImageGradeGood(){
        return mImageGradeGood;
    };
    public int getmImageGradeBad(){
        return mImageGradeBad;
    };
    public String getmAnswer(){
        return mAnswer;
    };
    public String getmSubmitButton(){
        return mSubmitButton;
    };
    public String getmClearButton(){
        return mClearButton;
    };


}

