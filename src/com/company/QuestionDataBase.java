package com.company;

import java.util.ArrayList;

public class QuestionDataBase {

    public static ArrayList<String> listOfCommands1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.add("Any Character: Ends the program");
        list.add("\"1\" : List types of exercises");
        list.add("");
        return list;
    }

    public static ArrayList<String> QuestionType1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.add("\"1\": Calculates velocity of the projectile");
        list.add("\"2\": Calculates distance covered by the projectile");
        list.add("\"3\": Calculates velocity of the projectile along y-axis");
        list.add("\"4\": Calculates velocity of the projectile along x-axis");
        list.add("\"5\": Calculates X-coordinate of the projectile");
        list.add("\"6\": Calculates Y-coordinate of the projectile");
        list.add("\"7\": Calculates angle (direction)");
        list.add("\"8\": exit");
        list.add("");
        return list;
    }

    public static ArrayList<String> Allquestiontypes() {
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.add("\"1\": Getiing (Velocity/Distance/Coordinates) at a certain time");
        list.add("\"2\": Calculate Max height (Vy = 0)");
        return list;
    }

    public static ArrayList<String> QuestionType2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.add("\"1\": Calculate Max height (Vy = 0)");
        list.add("\"2\": Time at max height");
        list.add("\"3\": exit");
        list.add("");
        return list;
    }


}
