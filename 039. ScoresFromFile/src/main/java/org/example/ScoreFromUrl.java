package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ScoreFromUrl {
    private String urlPath;

    public ScoreFromUrl(String urlPath) {
        this.urlPath = urlPath;
    }

    public String getUrlPath() {
        return urlPath;
    }

    /** readScoresFromUrlToArray
     * reads data from url and does conversion of the received results to integer and calculates ave and sum
     * @return Array with sum on the first position and average on the second
     */
    public double[] readScoresFromUrlToArrayAndCalculatesAverageAndSum() {
        ArrayList<String> scoresAsStringArrayList;
        try {
            scoresAsStringArrayList = readStringsFromUrlAndEnterToArrayList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<Integer> arrayIntegers = convertArrayListStringToInteger(scoresAsStringArrayList);
        return calculateAverageScoreAndTotalOfGivenScores(arrayIntegers);
    }

    private ArrayList<String> readStringsFromUrlAndEnterToArrayList() throws IOException {
        String[] scoresAsStringArray;
        ArrayList<String> scoresAsStringArrayList = new ArrayList<>();
        java.net.URL url = new java.net.URL(this.urlPath);

        Scanner scanner = new Scanner(url.openStream());
        while (scanner.hasNext()) {
            scoresAsStringArray = scanner.nextLine().split(" ");
            scoresAsStringArrayList.addAll(Arrays.asList(scoresAsStringArray));
        }
        return scoresAsStringArrayList;
    }

    protected ArrayList<Integer> convertArrayListStringToInteger(ArrayList<String> arrayListString){
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        for(String string: arrayListString){
            arrayListInteger.add(Integer.parseInt(string));
        }
        return arrayListInteger;
    }

    protected double[] calculateAverageScoreAndTotalOfGivenScores(ArrayList<Integer> scores){
        if(scores == null){
            return new double[]{0,0};
        }
        int sum = 0;
        double average;
        for(Integer score: scores){
            sum = sum + score;
        }
        average = (double)sum / scores.size();
        return new double[]{sum, average};
    }

}
