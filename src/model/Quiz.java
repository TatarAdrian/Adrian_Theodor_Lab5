package model;


import java.util.ArrayList;

import static resources.QuizData.setQuiz0;

public class Quiz {

    // the 2d list which holds our quiz data
    private final String[][] quiz = new String[26][4];

    // setter for questions and answers
    public void setQuiz(){
        int count = 0;
        ArrayList<Integer> answers = new ArrayList<>();
        // random int from 0 - 25 which will be used for setting the answers and questions randomly
        int rnd = (int) (Math.random() * 26 + 0);
        // each rnd will be stored in a list
        answers.add(rnd);
        // set the first question with answers
        this.quiz[count][0] = setQuiz0()[rnd][0];
        this.quiz[count][1] = setQuiz0()[rnd][1];
        this.quiz[count][2] = setQuiz0()[rnd][2];
        this.quiz[count][3] = setQuiz0()[rnd][3];
        count++;
        while(count < 26){
            rnd = (int) (Math.random() * 26 + 0);
            // verify if the rnd was generated before, so we don't get duplicates
            while(answers.contains(rnd))  {
                rnd = (int) (Math.random() * 26 + 0);
            }
           answers.add(rnd);
           this.quiz[count][0] = setQuiz0()[rnd][0];
           this.quiz[count][1] = setQuiz0()[rnd][1];
           this.quiz[count][2] = setQuiz0()[rnd][2];
           this.quiz[count][3] = setQuiz0()[rnd][3];
           count++;
        }
    }

    // getter for quiz
    public String[][] getQuiz(){
        return this.quiz;
    }
}
