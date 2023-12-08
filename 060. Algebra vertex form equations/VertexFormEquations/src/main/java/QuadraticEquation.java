import java.lang.reflect.Array;

public class QuadraticEquation {

    private int a;
    private int b;
    private int c;


    //region getters, setters and constructors
    public QuadraticEquation(int a, int b, int c) {
        if(this.a == 0){
            throw new IllegalArgumentException("Not a quadratic equation, a cant be 0!");
        }
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



    public Fraction[] changeToVertexForm(){

        int h1 = -b;
        int h2 = 2 * a;
        int k1 = 4*a*c - b*b;
        int k2 = 4*a;
        Fraction fraction1 = new Fraction(h1,h2);
        fraction1.simplifyFraction();
        Fraction fraction2 = new Fraction(k1, k2);
        fraction2.simplifyFraction();
        return new Fraction[]{fraction1, fraction2};
    }



    public String vortexFormOutput(Fraction[] array){
        return "h is " + array[0].toString() + " and k is " + array[1].toString();
    }
}
