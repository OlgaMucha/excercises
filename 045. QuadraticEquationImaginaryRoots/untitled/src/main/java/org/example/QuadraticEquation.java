package org.example;

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
        int realSolutions;
        double solution1;
        double solution2;
        double delta = calculateDeltaForEquation();
        if(delta > 0){
            realSolutions = 2;
            solution1 = (-b - Math.sqrt(delta)) / (2 * a);
            solution2 = (-b + Math.sqrt(delta)) / (2 * a);
        }else if(delta == 0){
            realSolutions = 1;
            solution1 = -b / (2 * a);
        }else{
            realSolutions = 0;
        }
        return realSolutions;
    }
}
