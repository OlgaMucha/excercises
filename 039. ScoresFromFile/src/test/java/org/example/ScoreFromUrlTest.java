package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ScoreFromUrlTest {

    @Test
    void calculateAverageScoreAndTotalOfGivenScores_calculatesCorrectSumAndAverage() {
        List<Integer> list = Arrays.asList(10,20,30);
        ArrayList<Integer> scoresTest = new ArrayList<>(list);
        ScoreFromUrl scoreFromUrl = new ScoreFromUrl("http://liveexample.pearsoncmg.com/data/Scores.txt");
        Assertions.assertArrayEquals(scoreFromUrl.calculateAverageScoreAndTotalOfGivenScores(scoresTest), new double[]{60, 20});
    }

    @Test
    void calculateAverageScoreAndTotalOfGivenScores_calculatesCorrectSumAndAverageForEmptyArrayWithScores() {
        ScoreFromUrl scoreFromUrl = new ScoreFromUrl("http://liveexample.pearsoncmg.com/data/Scores.txt");
        Assertions.assertArrayEquals(scoreFromUrl.calculateAverageScoreAndTotalOfGivenScores(null), new double[]{0, 0});
    }

    @Test
    void convertArrayListStringToInteger(){
        List<String> list = Arrays.asList("10","20","30");
        ArrayList<String> scoresTest = new ArrayList<>(list);
        ScoreFromUrl scoreFromUrl = new ScoreFromUrl("http://liveexample.pearsoncmg.com/data/Scores.txt");
        ArrayList<Integer> result = scoreFromUrl.convertArrayListStringToInteger(scoresTest);
        int actual = 20;
        Assertions.assertEquals(result.get(1),actual);
    }


}