public class Main {

    public static void main(String[] args) {

        ComparableCircle cs1 = new ComparableCircle(10);
        ComparableCircle cs2 = new ComparableCircle(11);

        System.out.println((cs1.compareTo(cs2) > 0
                ? "\nFirst Circle with area " + cs1.getArea()  : "\nSecond Circle with the area "  + cs2.getArea()) +
                " is the largest of the two Circles");

    }



}
