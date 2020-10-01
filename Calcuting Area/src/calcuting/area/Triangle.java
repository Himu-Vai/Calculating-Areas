
package calcuting.area;

import java.util.Scanner;


public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,a;
        float f;
         System.out.println("Input the base of Tringle:");
         i=input.nextInt();
         System.out.println("Input the hight of Tringle:");
         a=input.nextInt();
         f=(float)0.5*i*a;
         System.out.println("area is: "+f);
    }
    
}
