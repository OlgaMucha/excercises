public class SumOfSeries {

    public static void main(String[] args) {

        /*(Sum a series) Write a program to compute the following summation:
        1/3 + 3/5 + 5/7 + 7/9 + ... + 97/99
         */
        float sum = 0;
        for (int i = 1; i <= 97; i++) {
           if(i % 2 == 1) {
               sum = sum + (float) i / (i + 2);
           }
        }
        System.out.println("sum is: " + sum);
    }
}
