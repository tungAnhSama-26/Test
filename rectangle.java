
package algorithm;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length  = input.nextDouble();
        double width = input.nextDouble();
        double area = (length * width);
        double perimeter = (length + width) * 2;
        System.out.println(perimeter);
        System.out.println(area);
    }
}
