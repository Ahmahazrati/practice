package assignment.operators;

public class AssignmentOperators {

    public static void main(String[] args) {
        int x = 5;

        System.out.println("x+= " + (x += x));
        System.out.println("x-=" + (x -= 2));
        System.out.println("x*= " + (x *= x));
        System.out.println("x/= " + (x /= 8));
        System.out.println("x%= " + (x %= 3));

    }

}
