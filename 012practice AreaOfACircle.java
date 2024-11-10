
package pkg012.area.of.a.circle;
import java.util.Scanner;

public class AreaOfACircle {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double radius, area;
      final double PI = 3.14159;
        System.out.print("please Enter radius : ");
      radius = input.nextInt();
      area = radius*radius*PI;
        System.out.println("The area of circle for radius "+radius+"is = "+area);
    }
    
}
