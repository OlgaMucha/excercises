package org.example;

import java.util.ArrayList;

public class QuadraticEquation {

    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateDeltaForEquation(){
        return b * b - 4 *  a * c;
    }

    public int numberOfRealSolutions(){

//        if(a == 0 && b == 0 && c == 0){
//            return 999;
//        }
//        if(a == 0){
//            return 1;
//        }
//        double delta = calculateDeltaForEquation();
//        if(delta > 0){
//            return 2;
//        }else if(delta == 0){
//            return 1;
//        }else{
//            return 0;
//        }

        return this.realSolutions().size();
    }

    public ArrayList<Double> realSolutions(){
        ArrayList<Double> arraySolutions = new ArrayList<>();
        double solution1;
        double solution2;
        double delta = calculateDeltaForEquation();
        if(a == 0 && b == 0 && c == 0){
            for (int i = 1; i < 99; i++) {
                arraySolutions.add((double)i);
            };
        }
        if(a == 0){
            solution1 = (double)-c / b;
            arraySolutions.add(solution1);
            return arraySolutions;
        }
        if(delta > 0){
            solution1 = (-b - Math.sqrt(delta)) / (2 * a);
            solution2 = (-b + Math.sqrt(delta)) / (2 * a);
            arraySolutions.add(solution1);
            arraySolutions.add(solution2);
            return arraySolutions;
        }else if(delta == 0){
            solution1 = (double)-b / (2 * a);
            arraySolutions.add(solution1);
            return arraySolutions;
        }else{
            return arraySolutions;
        }
    }
}
