package com.ps;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in); // change scanner to class scope
    public static void main(String[] args) {
        System.out.print("Please enter game score: ");
        String userInput = scanner.next();

        //split user's input with pipe sign
        String[] team = userInput.split("\\|");

        //make array for team names
        String teamNames = team[0];
        String scoreArray = team[1];





            }
        }
    }
}