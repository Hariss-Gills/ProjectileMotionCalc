package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectileManager {
    private ArrayList<Projectile> projectiles;

    public ProjectileManager() {
        projectiles = new ArrayList<>();
    }

    public void start(String command) {
        if (command.equals("1")) {
            dataInputterforq1();
            printProjectiles();
        }
        if (command.equals("2")) {
            dataInputterforq2();
            printProjectiles();
        }

    }

    public void dataInputterforq1() {
        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Let's add some parameters (N : to stop adding projectiles)");
            System.out.println("Continue? (Y/N)");
            String input = reader.nextLine();
            if (input.equals("N")) {
                break;
            }
            System.out.print("Name your Projectile: ");
            String name = reader.nextLine();
            System.out.print("Angle of projection in degrees: ");
            double angle = Double.valueOf(reader.nextLine());
            System.out.print("Inital Velocity in m/s : ");
            double velocity = Double.valueOf(reader.nextLine());
            System.out.print("At What time in seconds: ");
            double time = Double.valueOf(reader.nextLine());
            Projectile projectile = new Projectile(name, angle, velocity, time);
            projectiles.add(projectile);
        }
    }

    public void dataInputterforq2() {
        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Let's add some parameters (N : to stop adding projectiles)");
            System.out.println("Continue? (Y/N)");
            String input = reader.nextLine();
            if (input.equals("N")) {
                break;
            }
            System.out.print("Name your Projectile: ");
            String name = reader.nextLine();
            System.out.print("Angle of projection in degrees: ");
            double angle = Double.valueOf(reader.nextLine());
            System.out.print("Inital Velocity in m/s : ");
            double velocity = Double.valueOf(reader.nextLine());
            Projectile projectile = new Projectile(name, angle, velocity);
            projectiles.add(projectile);
        }
    }


    public void printProjectiles() {
        int counter = 1;
        for (Projectile P : projectiles) {
            System.out.println(counter + " : " + P);
        }
        counter++;
    }

    public ArrayList<Projectile> getProjectiles() {
        return projectiles;
    }

}
