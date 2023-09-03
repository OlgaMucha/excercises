import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter the day of the month: ");
        int dayOfTheMonth = scanner.nextInt();

        System.out.println(" Date chosen: " + dayOfTheMonth + "/" + month + "/" + year);

        if(month == 2 || month == 3){
            month = month + 12;
            year = year - 1;
        }

        int dayOfTheWeek = ((dayOfTheMonth + (26*(month + 1))/10 + (year % 100) + (year % 100)/4 + (year/100)/4 + 5*(year/100))%7);

        String dayOfTheWeekName;
        switch (dayOfTheWeek){
            case 0: dayOfTheWeekName = "Saturday";break;
            case 1: dayOfTheWeekName = "Sunday";break;
            case 2: dayOfTheWeekName = "Monday";break;
            case 3: dayOfTheWeekName = "Tuesday";break;
            case 4: dayOfTheWeekName = "Wednesday";break;
            case 5: dayOfTheWeekName = "Thursday";break;
            case 6: dayOfTheWeekName = "Friday";break;
            default: dayOfTheWeekName = "ERROR";
        }

        System.out.println(dayOfTheWeekName);
    }

}
