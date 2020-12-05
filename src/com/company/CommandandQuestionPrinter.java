package com.company;
import java.util.ArrayList;

public class CommandandQuestionPrinter {

    public static void printListOfCommands() {
        ArrayList<String> beginningCommands = QuestionDataBase.listOfCommands1();
        for (String S : beginningCommands) {
            System.out.println(S);
        }
    }

    public static void printAllQuestionTypes() {
        ArrayList<String> typesOfQuestions = QuestionDataBase.Allquestiontypes();
        for (String S : typesOfQuestions) {
            System.out.println(S);
        }
    }

    public static void Printquestiontype1() {
        ArrayList<String> Questiontype1Commands = QuestionDataBase.QuestionType1();
        for (String S : Questiontype1Commands) {
            System.out.println(S);
        }
    }

    public static void Printquestiontype2() {
        ArrayList<String> Questiontype2Commands = QuestionDataBase.QuestionType2();
        for (String S : Questiontype2Commands) {
            System.out.println(S);
        }
    }


    public static void welcomeMessage() {
        System.out.println("Welcome to the Project Motion Solver!. Here are the available commands");
    }

    public static void endMessage() {
        System.out.println("");
        System.out.println("Thank you!");
        System.out.println("");
    }

    public static void getIndex() {
        System.out.print("Please input the number that corresponds to the Projectile: ");
    }

}
