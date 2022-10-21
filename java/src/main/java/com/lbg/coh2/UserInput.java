package com.lbg.coh2;

import java.util.Scanner;

public class UserInput {

    public int acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String line = scanner.nextLine();
        return switch (line.toLowerCase()) {
            case "left" -> 0;
            case "right" -> 1;
            case "up" -> 2;
            case "down" -> 3;
            case "quit" -> 4;
            default -> acceptInput();
        };
    }
}
