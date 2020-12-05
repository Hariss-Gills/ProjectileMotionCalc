package com.company;
import java.util.Scanner;
public class ImplementQuestionLogic {
    private Projectile projectile;
    private String command;

    public ImplementQuestionLogic(Projectile projectile) {
        this.projectile = projectile;
    }

    public void start(String command) {
        if(command.equals("1")) {
            startQuestion1();
        }
        if(command.equals("2")){
            startQuestion2();
        }
    }

    public void startQuestion1() {
        while(true) {
            Scanner reader = new Scanner(System.in);
            command = reader.nextLine();
            if (command.equals("1")) {
                System.out.println(projectile.calculateVelocity());
            }
            if(command.equals("2")){
                System.out.println(projectile.calculateDistance());
            }
            if (command.equals("3")) {
                System.out.println(projectile.calculateVy());
            }
            if(command.equals("4")){
                System.out.println(projectile.calculateVx());
            }
            if(command.equals("5")){
                System.out.println(projectile.calculateX());
            }
            if(command.equals("6")){
                System.out.println(projectile.calculateY());
            }
            if (command.equals("7")){
                System.out.println(projectile.calculateAngle());
            }
            if(command.equals("8")){
                break;
            }

        }
    }

    public void startQuestion2(){
        while (true){
            Scanner reader = new Scanner(System.in);
            command = reader.nextLine();
            if (command.equals("1")) {
                System.out.println(projectile.calculateMaxHeight());
            }
            if (command.equals("2")) {
                System.out.println(projectile.timeatMaxHeight());
            }
            if (command.equals("3")){
                break;
            }
        }
    }
}
