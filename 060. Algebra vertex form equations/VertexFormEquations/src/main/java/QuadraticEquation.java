import java.lang.reflect.Array;

public class QuadraticEquation {

    private int a;
    private int b;
    private int c;


    //region getters, setters and constructors
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    //endregion



    public int[] changeToVertexForm(){

        int h1 = -b;
        int h2 = 2 * a;
        int k1 = 4*a*c - b*b;
        int k2 = 4*a;
        return new int[]{h1, h2, k1, k2};
    }



    public String vortexFormOutput(int[] array){
        return "h is " + array[0] + "/" + array[1] + " and k is " + array[2] + "/" + array[3];
    }
}
