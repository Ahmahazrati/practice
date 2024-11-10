package pkg015.quadratic;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, x, x1, x2;
        System.out.println("Plese enter the value of a");
        a = input.nextDouble();
        System.out.println("Please enter the vlue of b");
        b = input.nextDouble();
        System.out.println("Plese enter the value of c");
        c = input.nextDouble();
        x1 = (-b + (Math.sqrt(b * b - 4 * a * c))) / 2 * a;
        x2 = (-b - (Math.sqrt(b * b - 4 * a * c))) / 2 * a;
        System.out.println("The value of x1 is = "+x1);
        System.out.println("The value of x2 is = "+x2);
    }

}
