package Problem2;

import java.util.Scanner;

public class HeartRatesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please enter your date of birth in the format (YYYY-MM-DD) - Example 1989-4-14: ");
        String dateOfBirth = scanner.nextLine();

        HeartRates personHeartRates = new HeartRates(firstName, lastName, dateOfBirth);
        personHeartRates.calculateAndPrintTargetHeartRateRange();
        System.out.println("\n" + personHeartRates);


        scanner.close();
    }
}