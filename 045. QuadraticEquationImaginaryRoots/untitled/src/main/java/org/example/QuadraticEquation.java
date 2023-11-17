package org.example;

import java.util.ArrayList;

public class QuadraticEquation {

    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        if(a == 0){
            throw new ArithmeticException("a can't be 0!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateDeltaForEquation(){
        return b * b - 4 *  a * c;
    }

    public int numberOfSolutions(){
        double delta = this.calculateDeltaForEquation();
        if(delta < 0){
            return 2;
        }
        return this.realSolutions().size();
    }

    public ArrayList<Double> realSolutions(){
        ArrayList<Double> arraySolutions = new ArrayList<>();
        double solution1;
        double solution2;
        double delta = calculateDeltaForEquation();
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

    public ArrayList<Double> imaginarySolutions() {
        ArrayList<Double> arraySolutions = new ArrayList<>();
        double solution1imaginary;
        double solution1real;
        double solution2imaginary;
        double solution2real;
        double delta = this.calculateDeltaForEquation();
        if(delta < 0){
            solution1real = (double) -b / (2 * a);
            solution1imaginary = Math.sqrt(-delta) / (2 * a);

            arraySolutions.add(solution1real);
            arraySolutions.add(solution1imaginary);
        }

        return arraySolutions;
    }

    public String outputImaginarySolutions(){
        ArrayList<Double> imaginarySolutions = imaginarySolutions();
        String solution1 = imaginarySolutions.get(0) + " + " + imaginarySolutions.get(1) + "i";
        String solution2 = imaginarySolutions.get(0) + " - " + imaginarySolutions.get(1) + "i";
        return "Imaginary solutions are: " + solution1 + " and " + solution2;
    }

    public String outputSolutions(){
        ArrayList<Double> realSolutions = realSolutions();
        double delta = calculateDeltaForEquation();
        if(delta < 0){
            return outputImaginarySolutions();
        }else if(delta == 0){
            return "Real solution: " + realSolutions.get(0);
        }else{
            return "Imaginary solutions are: " + realSolutions.get(0) + " and " + realSolutions.get(1);
        }
    }
}
