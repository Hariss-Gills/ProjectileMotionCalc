package com.company;

import java.util.Scanner;

public class UserInput {

    private Scanner reader;

    public UserInput() {
        this.reader = new Scanner(System.in);
    }

    public String Input() {
        return reader.nextLine();
    }

}

