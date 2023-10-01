//Make a program that take year as input and create a custom exception that throw exception if year is not leap year.
import java.util.Scanner;

class NotLeapYearException extends Exception {
    public NotLeapYearException(int year) {
        super(year + " is not a leap year.");
    }
}
public class LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            if (!isLeapYear(year)) {
                throw new NotLeapYearException(year);
            } else {
                System.out.println(year + " is a leap year.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid year.");
        } catch (NotLeapYearException e) {
            System.out.println(e.getMessage());
        }
    }
}
