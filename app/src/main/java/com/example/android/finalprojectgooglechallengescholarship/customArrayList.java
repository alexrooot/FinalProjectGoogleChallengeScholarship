package com.example.android.finalprojectgooglechallengescholarship;

/**
 * Created by Alex on 2/5/2018.
 */

public class customArrayList   {
    private String mQuestionNumber;

    private String mQuestionAsked;

    private int mImageGood;
    private int mImageBad;

    private String mQuestionTextAnswer;

    private String mSubmitButton;

    private  String mClearButton;

    public  customArrayList(String QuestionNumber, String QuestionAsked,int ImageGood, int Imagebad, String QuestionTextAnswer, String SubmitButton ,String ClearButton){
        mQuestionAsked = QuestionAsked;
        mQuestionNumber = QuestionNumber;
        mImageGood = ImageGood;
        mImageBad = Imagebad;
        mQuestionTextAnswer = QuestionTextAnswer;
        mSubmitButton = SubmitButton;
        mClearButton = ClearButton;
    }
    public String getmQuestionNumber(){return mQuestionNumber;}

    public String getmQuestionAsked() {return mQuestionAsked;}

    public int getmImageGrade() {return  mImageGood;}

    public int getmImageBad() {return mImageBad;}

    public String getmQuestionTextAnswer() {return mQuestionTextAnswer;}

    public String getmSubmitButton() {return mSubmitButton;}

    public String getmClearButton() {return mClearButton;}





}
