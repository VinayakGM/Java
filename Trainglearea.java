import java.lang.*;
import java.util.Scanner;
public class Trainglearea {
    public static void main(String[] args)
    {   int a,b,c;
        float s;
        double area=0.0;
        Scanner S=new Scanner(System.in);
      /*  System.out.println("enter the base of traingle: ");
        float b=sc.nextFloat();
        System.out.println("enter the height of traingle: ");
        float h=sc.nextFloat();
        float a=(b*h)/2; */
        System.out.println("Enter the Sides of Traingle :");
        a=S.nextInt();
        b=S.nextInt();
        c=S.nextInt();
        s=(a+b+c)/2f;      
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of triangle is :"+area);
       


    }
    
}
