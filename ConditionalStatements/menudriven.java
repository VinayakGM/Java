import java.util.*;
public class menudriven {
     public static void main(String[] args)
     {  Scanner sc=new Scanner(System.in);
         System.out.println("Enter two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Menu");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");
        sc.nextLine();
        System.out.println("Enter your option: ");
        
        String option=sc.nextLine();
        switch(option)
        { case "Add":System.out.println(a+b);
                     break;
           case "Sub":System.out.println(a-b);
                     break;
           case "Mul":System.out.println(a*b);
                     break;
           case "Div":System.out.println(a/b);
                     break;
           default: System.out.println("Invalid option");
                    break;
     }


     }
}
