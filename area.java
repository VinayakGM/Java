import java.util.*;
public class area {
    public static void main(String[] args)
    {   int A,B,C;
        float s;
        double area;
        Scanner st=new Scanner(System.in);
        System.out.println("enter the base of traingle: ");
        float b=st.nextFloat();
        System.out.println("enter the height of traingle: ");
        float h=st.nextFloat();
        float a=(b*h)/2;
        System.out.println("Enter the Sides of Traingle :");
        A=st.nextInt();
        B=st.nextInt();
        C=st.nextInt();
        s=(A+B+C)/2f;      
         area=Math.sqrt(s*(s-A)*(s-B)*(s-C));
        System.out.println("The area of triangle is :"+area);
       


    }
}
