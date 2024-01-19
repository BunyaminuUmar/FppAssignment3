package Problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    private static final double RESTING_HEART_RATE = 70;
    private static final double LOWER_BOUNDARY = 0.5;
    private static final double UPPER_BOUNDARY = 0.85;

    public HeartRates(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public int calculateAge() {
        AgeCalculator ageCalculator = new AgeCalculator();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate birthday = LocalDate.parse(dateOfBirth, formatter);
        Period agePeriod = ageCalculator.calculateAge(birthday);
        return agePeriod.getYears();
    }
    public int calculateMaxHeartRate() {
        int age = calculateAge();
        return 220 - age;
    }
    public void calculateAndPrintTargetHeartRateRange() {
        double maxHeartRate = calculateMaxHeartRate();
        double averageHeartRate = maxHeartRate - RESTING_HEART_RATE;

        double lowerBoundaryTHR = (averageHeartRate * LOWER_BOUNDARY) + RESTING_HEART_RATE;
        double upperBoundaryTHR =  (averageHeartRate * UPPER_BOUNDARY) + RESTING_HEART_RATE;

        System.out.println("The target Heart Rate Range is between: " + lowerBoundaryTHR + " - " + upperBoundaryTHR);
    }
    @Override
    public String toString() {
        return "First Name: " + firstName +
                "\nLast Name: "  + lastName +
                "\nAge: " + calculateAge() + " years" +
                "\nDate of Birth: " + dateOfBirth +
                "\nMaximum Heart Rate: " + calculateMaxHeartRate();
    }



}
