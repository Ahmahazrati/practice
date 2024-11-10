
package fahreinheit.to.cilsuis;
import java.util.Scanner;

public class FahreinheitToCilsuis {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double c, f;
        System.out.print("please Enter the degree of fahrenheit :");
       f= input.nextDouble();
       c = (f-32)*5/9;
        System.out.println(f+"Degree of fahreheit is "+c+" Degree of cilsuis");
       
    }
    
}
