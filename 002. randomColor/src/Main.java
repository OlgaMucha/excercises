import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInteger = random.nextInt(7);
        randomInteger = randomInteger + 1;
        //System.out.print(randomInteger);

        String color;
        switch(randomInteger) {
            case 1: color = "violet";break;
            case 2: color = "indigo";break;
            case 3: color = "blue";break;
            case 4: color = "green";break;
            case 5: color = "yellow";break;
            case 6: color = "orange";break;
            case 7: color = "red";break;
            default: color = "black";
        }

        System.out.println(" Random color of the rainbow: " + color);
    }
}