package Problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");

        char choice = scanner.nextLine().charAt(0);

        switch (Character.toUpperCase(choice)) {
            case 'C':
                System.out.println("Enter the radius of the Circle:");
                double circleRadius = scanner.nextDouble();
                Circle circle = new Circle(circleRadius);
                System.out.printf("The area of Circle is: %.2f%n", circle.computeArea());
                break;

            case 'R':
                System.out.println("Enter the width of the Rectangle:");
                double rectangleWidth = scanner.nextDouble();
                System.out.println("Enter the length of the Rectangle:");
                double rectangleLength = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(rectangleWidth, rectangleLength);
                System.out.printf("The area of Rectangle is: %.2f%n", rectangle.computeArea());
                break;

            case 'T':
                System.out.println("Enter the base of the Triangle:");
                double triangleBase = scanner.nextDouble();
                System.out.println("Enter the height of the Triangle:");
                double triangleHeight = scanner.nextDouble();
                Triangle triangle = new Triangle(triangleBase, triangleHeight);
                System.out.printf("The area of Triangle is: %.2f%n", triangle.computeArea());
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
