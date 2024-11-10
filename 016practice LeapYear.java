package pkg016practice.leap.year;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year :");
        int x = (int) input.nextDouble();
        if (x % 4 == 0 && x % 100 != 0 || (x % 400 == 0)) {
            System.out.println("The entered year is a leap year");
        }
        else 
            System.out.println("This year is not a leap year !");

    }

}
