import java.util.*;
public class switchcase {
     public static void main(String[] args)
     {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  day number :");
        int day=sc.nextInt();
        switch(day)
        {  case 1:System.out.println("Monday");
                  break;
           case 2:System.out.println("Tuesday");
                  break;
           case 3:System.out.println("wedday");
                  break;
           case 4:System.out.println("Thurday");
                  break;
           case 5:System.out.println("Friday");
                  break;
           case 6:System.out.println("Saturday");
                  break;
           case 7:System.out.println("Sunday");
                  break;
           default: System.out.println("inavlid number");
         }
        System.out.println("Enter the  month number :");
        int m=sc.nextInt();
        switch(m)
        {  case 1:System.out.println("January");
                  break;
           case 2:System.out.println("Febraury");
                  break;
           case 3:System.out.println("march");
                  break;
           case 4:System.out.println("april");
                  break;
           case 5:System.out.println("may");
                  break;
           case 6:System.out.println("june");
                  break;
           case 7:System.out.println("july");
                  break;
           case 8:System.out.println("August");
                  break;
           case 9:System.out.println("sepetember");
                 break;
           case 10:System.out.println("October");
                 break;
           case 11:System.out.println("Novemeber");
                break;
            case 12:System.out.println("december");
                break;
           default: System.out.println("inavlid month");
                  break;
        }
           //type of website
           System.out.println("Enter the url: ");
            String url=sc.next();
           String ext=url.substring(url.lastIndexOf(".")+1);   
           System.out.println("Type of website :");
            switch(ext)
            {   case "com":System.out.println("Commercial");
                           break;
                case "net":System.out.println("network");
                           break;
                case "org":System.out.println("Organisational");
                           break;
                default : System.out.println("Invalid");
                      break;
             }
         }

     

    
}
