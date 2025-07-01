package algorithm;

import java.util.Scanner;

public class circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius (r): ");
        double radius = sc.nextDouble();
        double pi = 3.14;
        double perimeter = 2 * pi * radius;
        double area = pi * radius * radius;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        sc.close();
    }
}
