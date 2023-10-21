import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        System.out.print("Enter binary number: ");
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.nextLine();
        Boolean isBinary = false;

        //check if binary string
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '0' || binary.charAt(i) == '1'){
                isBinary = true;
            }
            if(isBinary = true){
                System.out.println("binary number");
            } else {
                System.out.println("Not binary");
            }
        }

    }
}
