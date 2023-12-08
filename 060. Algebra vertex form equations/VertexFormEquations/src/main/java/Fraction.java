public class Fraction {

    private int x;
    private int y;

    public Fraction(int x, int y) {
        if(x == 0){
            throw new ArithmeticException("Can't divide by null!");
        }
        this.x = x;
        this.y = y;
    }

    public Fraction() {
        this.x = 1;
        this.y = 1;
    }

    private int findGreatestCommonDivisor(int x, int y) {
        if (x < 0) x = -x;
        if (y < 0) y = -y;

        while (x != y)
            if (x > y) x -= y;
            else y -= x;

        return x;
    }

    public Fraction simplifyFraction(){
        int gcd = findGreatestCommonDivisor(this.x, this.y);
        this.x = this.x / gcd ;
        this.y = this.y / gcd ;
        return new Fraction(this.x, this.y);
    }

    @Override
    public String toString() {
        if(y == 1) return x + "";
        if(y == -1) return -x + "";
        return x + "/" + y;
    }
}
