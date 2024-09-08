import java.util.*;
public class Cuboid {
    public static void main(String[] args)
    { 
      int l,b,h,area,Volume;
      
      System.out.println("enter the length ,breadth and height :");
      Scanner S=new Scanner(System.in);
      l=S.nextInt();
      b=S.nextInt();
      h=S.nextInt();
      area=2*((l*b)+(b*h)+(l*h));
      Volume=l*b*h;
      System.out.println("The Area of Cuboid: "+area);
      System.out.println("The Volume of Cuboid:"+Volume);

    }
    
}
