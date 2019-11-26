package com.company;

public class TrueFalseQuestion extends Question {

    private String initialPrompt = "Answer True(T) or False(F)";

    public TrueFalseQuestion(String question, String answer){
        super (question, answer);
    }

    public void askQuestion(){
        System.out.println(initialPrompt + "\n");
        System.out.println(this.getQuestion());
    }

    public void checkAnswer(String answer){
        if (answer.equals(this.getCorrectAnswer())){
            System.out.println("Correct !!");
        }
    }

}
