import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        //data initialisation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the month");
        int numberOfMonth = scanner.nextInt();
        System.out.println("Enter number of the year");
        int numberOfYear = scanner.nextInt();
        scanner.close();

        int days = calculateNumberOfDaysInMonthAndYear(numberOfMonth, numberOfYear);
        String month = getMonthName(numberOfMonth);

        System.out.println("Month " + month + " in " + numberOfYear + " has " + days + " days.");
    }

    private static int calculateNumberOfDaysInMonthAndYear(int month, int numberOfYear) {
        int days = 0;
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12: days = 31;break;
            case 4, 6, 9, 11:           days = 30;break;
            case 2: {
                if(numberOfYear % 4 == 0){
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            }
            default:days = 0;
        }
        return days;
    }

    private static String getMonthName(int numberOfMonth) {
        String month = " ";
        switch (numberOfMonth){
            case 1:month = "january";break;
            case 2:month = "february";break;
            case 3:month = "march";break;
            case 4:month = "april";break;
            case 5:month = "may";break;
            case 6:month = "june";break;
            case 7:month = "july";break;
            case 8:month = "august";break;
            case 9:month = "september";break;
            case 10:month = "october";break;
            case 11:month = "november";break;
            case 12:month = "december";break;
        }
        return month;
    }
}
