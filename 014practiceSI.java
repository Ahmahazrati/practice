package pkg014.si;

import java.util.Scanner;

public class SI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p, R, Sl, T;
        System.out.print("Please enter rate of pricipal :");
        p = input.nextDouble();
        System.out.print("Pleae enter rate fo interest :");
        R = input.nextDouble();
        System.out.println("Please enter time ");
        T = input.nextDouble();
        Sl = (R * R * T) / 100;
        System.out.println("Your simple interest for"+p+" mony at time "+T+" for rate of interst  "+R+" is : " +Sl);
    }

}
