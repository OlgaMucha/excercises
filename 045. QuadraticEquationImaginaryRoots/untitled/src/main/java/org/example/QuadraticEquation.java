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

    public ArrayList<String> imaginarySolutions() {
        ArrayList<String> arrayImaginarySolutions = new ArrayList<>();
        double solutionRealPart;
        double solutionImaginaryPart;
        double delta = this.calculateDeltaForEquation();
        if(delta < 0){
            solutionRealPart = (double) -b / (2 * a);
            solutionImaginaryPart = Math.sqrt(-delta) / (2 * a);
            arrayImaginarySolutions.add(String.format("%.2f + %.2fi",solutionRealPart,solutionImaginaryPart));
            arrayImaginarySolutions.add(String.format("%.2f - %.2fi",solutionRealPart,solutionImaginaryPart));
        }
        return arrayImaginarySolutions;
    }

    public String outputSolutions(){
        ArrayList<Double> realSolutions = realSolutions();
        ArrayList<String> imaginarySolutions = imaginarySolutions();
        double delta = calculateDeltaForEquation();
        if(delta < 0){
            String imaginaryRoot1 = imaginarySolutions.get(0);
            String imaginaryRoot2 = imaginarySolutions.get(1);
            return "There are two imaginary roots: " + imaginaryRoot1 + " and " + imaginaryRoot2;
        }else if(delta == 0){
            return String.format("There is one real root: %.2f", realSolutions.get(0));
        }else{
            double realRoot1 = realSolutions.get(0);
            double realRoot2 = realSolutions.get(1);
            return String.format("There are two real roots: %.2f and %.2f",realRoot1, realRoot2);
        }
    }
}
