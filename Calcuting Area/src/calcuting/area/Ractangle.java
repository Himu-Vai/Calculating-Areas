
package calcuting.area;

import java.util.Scanner;


public class Ractangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,a;
        float f;
         System.out.println("Input the base of Ractangle:");
         i=input.nextInt();
         System.out.println("Input the hight of Ractangle:");
         a=input.nextInt();
         f=(float)i*a;
         System.out.println("Area is: "+f);
    }
    
}
