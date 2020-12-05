package com.company;

import java.util.ArrayList;

public class UI {

    private UserInput reader;
    private ProjectileManager manager;
    private ImplementQuestionLogic question;

    public UI() {
        reader = new UserInput();
        manager = new ProjectileManager();
    }

    public void start() {
        CommandandQuestionPrinter.welcomeMessage();
        CommandandQuestionPrinter.printListOfCommands();
        while (true) {
            String input1 = reader.Input();
            if (input1.equals("1")) {
                CommandandQuestionPrinter.printAllQuestionTypes();
                String input2 = reader.Input();
                if (input2.equals("1")) {
                    Q1Logic(input2);
                }
                if (input2.equals("2")) {
                    Q2Logic(input2);
                }

            }
            break;
        }
        CommandandQuestionPrinter.endMessage();
    }

    public void Q1Logic(String input2) {
        manager.start(input2);
        ArrayList<Projectile> list = manager.getProjectiles();
        CommandandQuestionPrinter.getIndex();
        int input3 = Integer.valueOf(reader.Input());
        CommandandQuestionPrinter.Printquestiontype1();
        question = new ImplementQuestionLogic(manager.getProjectiles().get(input3 - 1));
        question.start(input2);
    }

    public void Q2Logic(String input2) {
        manager.start(input2);
        ArrayList<Projectile> list = manager.getProjectiles();
        CommandandQuestionPrinter.getIndex();
        int input3 = Integer.valueOf(reader.Input());
        CommandandQuestionPrinter.Printquestiontype2();
        question = new ImplementQuestionLogic(manager.getProjectiles().get(input3 - 1));
        question.start(input2);
    }

}
