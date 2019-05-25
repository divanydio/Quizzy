package com.quizzy.mrk.quizzy.Entities;

import android.os.Parcel;
import android.os.Parcelable;

public class QuestionCompletion implements Parcelable {

    private int id;
    private int score;
    private PartCompletion pc;
    private Question question;

    public static final Creator<QuestionCompletion> CREATOR = new Creator<QuestionCompletion>() {
        @Override
        public QuestionCompletion createFromParcel(Parcel in) {
            return new QuestionCompletion(in);
        }

        @Override
        public QuestionCompletion[] newArray(int size) {
            return new QuestionCompletion[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeInt(score);
    }

    public QuestionCompletion(Parcel in){
        this.id = in.readInt();
        this.score = in.readInt();
        this.pc = (PartCompletion) in.readValue(PartCompletion.class.getClassLoader());
        this.question = (Question) in.readValue(Question.class.getClassLoader());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public PartCompletion getPc() {
        return pc;
    }

    public void setPc(PartCompletion pc) {
        this.pc = pc;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
