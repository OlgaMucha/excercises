public class Main {

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,3,1);

        int[] array = quadraticEquation.changeToVertexForm();

        String output = quadraticEquation.vortexFormOutput(array);

        System.out.println(output);


    }

}
