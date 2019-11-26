package com.company;

public class Question {

    private static String question;
    private static String[] answerChoices;
    private static String correctAnswer;

// GETTERS / SETTERS
    // SET / GET Question
    public Question(String question, String correctAnswer, String[] answerChoices){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answerChoices = answerChoices;

    }

    public Question(String question, String correctAnswer){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answerChoices = null;

    }




    public String getQuestion (){
        return this.question;
    }
    public void setQuestion (String aQuestion){
        question = aQuestion;
    }


    // SET / GET Answer Choices

    public void setAnswerChoices(String[] aAnswerChoices){
        answerChoices = aAnswerChoices;
    }
    public String[] getAnswerChoices(){
        return this.answerChoices;
    }


    // SET / GET Correct Answer

    public void setCorrectAnswer(String aAnswer){
        correctAnswer = aAnswer;
    }
    public String getCorrectAnswer(){
        return this.correctAnswer;
    }
}

