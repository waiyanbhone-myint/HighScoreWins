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

        //make array for team names and each will with separate by ":"
        String teams = team[0];
        String scores = team[1];

        //split teams and scores with ":" and generate arrays
        String[] teamNames = teams.split(":");
        String[] teamScores = scores.split(":");

        //convert string type number to integer
        int firstIndex = Integer.parseInt(teamScores[0]);
        int secondIndex = Integer.parseInt(teamScores[1]);

        //check the conditional statement between two team scores
        if (firstIndex > secondIndex){
            System.out.print("The Winner is " + teamNames[0]);
            }
        else if (secondIndex > firstIndex) {
            System.out.print("The Winner is " + teamNames[1]);
        }
        else{
            System.out.print("Draw");
        }
    }
}