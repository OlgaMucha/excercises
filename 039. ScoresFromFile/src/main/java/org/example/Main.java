package org.example;

public class Main {
    public static void main(String[] args) {
        ScoreFromUrl score = new ScoreFromUrl("http://liveexample.pearsoncmg.com/data/Scores.txt");
        double[] results = score.readScoresFromUrlToArrayAndCalculatesAverageAndSum();

        System.out.printf("%-8s %.2f \n%-8s %.2f","Total:", results[0],"Average:", results[1]);
    }
}