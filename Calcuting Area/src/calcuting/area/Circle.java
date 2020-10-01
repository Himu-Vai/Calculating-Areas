
package calcuting.area;

import java.util.Scanner;


public class Circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        float f;
         
         System.out.println("Input the radius of Circle:");
         a=input.nextInt();
         f=(float)3.1416*a;
         System.out.println("area is: "+f);
    }
    
}
