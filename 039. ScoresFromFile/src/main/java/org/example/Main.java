package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Score score = new Score("http://liveexample.pearsoncmg.com/data/Scores.txt");
        double[] results = score.readScoresFromUrlToArrayAndCalculatesAverageAndSum();

        System.out.println("Total: " + results[0] + "\nAverage: " + results[1]);
    }
}