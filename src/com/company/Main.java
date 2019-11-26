package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TrueFalseQuestion q1 = new TrueFalseQuestion("5 + 5 = 10", "T");
        MultChoiceQuestion q2 = new MultChoiceQuestion("What is 10 + 25", new String[]{"-15", "35", "25"}, "2");

       // ArrayList<Question> question = new ArrayList<Question>(q1, q2);



        Scanner scanner = new Scanner(System.in);


        System.out.println(q1.getQuestion());
        System.out.println(q1.getCorrectAnswer());

//        String inputQ1 = scanner.nextLine();
//        System.out.println(inputQ1);
//
//        q1.checkAnswer(inputQ1);
//
//
//
//        //q2.askQuestion();
//
//        String inputQ2 = scanner.nextLine();
//        System.out.println(inputQ2);
//
//        q2.checkAnswer(inputQ2);


    }
}
