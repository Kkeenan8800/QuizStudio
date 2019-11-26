package com.company;

public class MultChoiceQuestion extends Question {

    public MultChoiceQuestion (String question, String[] answerChoices, String answer){
        super (question, answer, answerChoices);


    }

    public void askQuestion(){
        System.out.println(this.getQuestion());

        for (int i = 1; i <= this.getAnswerChoices().length; i++){
            System.out.println(i + ". " + this.getAnswerChoices()[i-1]);
        }
    }

    public void checkAnswer(String answer){
        if (answer.equals(this.getCorrectAnswer())){
            System.out.println("Correct !!");
        }
    }


}
