import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class studentchallenge {
     public static void main(String[] args)
     {  Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number: "); 
        int n=s.nextInt();
       if(n%2==0)
       {
        System.out.println("Even ");

       }
       else
       {
        System.out.println("Odd");
       }
    System.out.println("Enter the age: ");
       int age=s.nextInt();
    if(age>18 && age <40)
      {
        System.out.println("Person is Young");
      }
      else
      {
        System.out.println("Person is not Young");
      }
      System.out.println("enter the marks: ");
    int m1=s.nextInt();
    int m2=s.nextInt();
    int m3=s.nextInt();
    int sum=m1+m2+m3;
    float average=(sum)/3f;
        if(average>=80)
        {
            System.out.println("Grade A");
        }
        else if(average<80 && average>=70)
        {
            System.out.println("Grade B");
        }
        else if(average<70 && average>=60)
        {
            System.out.println("Grade B");
        }
        else if(average<60 && average>=50)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade E");
        }
       System.out.println("Enter the String: ");
    String str=s.next();
         if(str.matches("[01]*"))
         {
            System.out.println("Binary  radix-2");
         }
        else if(str.matches("[0-7]*"))
         {
            System.out.println("Octal radix-8");
         }
         else if(str.matches("[0-9A-F]*"))
         {
            System.out.println("hexadecimal radix-16");
         }
         else if(str.matches("[0-9]*"))
          {
            System.out.println("Decimal radix-9 ");
          }
        else
        {
            System.out.println("Invalid");
        }

      System.out.println("Enter the year: ");
       int year=s.nextInt();
       if(year%4==0 && year%100!=0)
       {
          System.out.println("Leap Year");
       }
       else 
       {
        System.out.println("Not a Leap year");
       }
    
     System.out.println("Enter the number :");
     int d=s.nextInt();
     if(d==1)
     {
        System.out.println("Monday ");
     }
     else if(d==2)
     {
        System.out.println("Tuesday");
     }
     else if(d==3)
     {
        System.out.println("Wedsenday");
     }
     else if(d==4)
     {
        System.out.println("Thursday");
     }
     else if(d==5)
     {
        System.out.println("Friday");
     }
    else if(d==6)
     {
        System.out.println("saturday");
     }
     else if(d==7)
     {
        System.out.println("Sunday ");
     }
     else
     {
        System.out.println("Invalid number ");
     }
     System.out.println("Enter the url: ");
     String url=s.next();
     String protocol=url.substring(0, url.indexOf(":"));
     String ext=url.substring(url.lastIndexOf(".")+1);
       System.out.println("Protocol name :");
        if(protocol.equals("http"))
          System.out.println("Hyperetext Transfer Protocol ");
        else if(protocol.equals("https"))
          System.out.println("Hyperetext Transfer Protocol secure");
        else if(protocol.equals("ftp"))
          System.out.println("file Transfer Protocol ");
        else
             System.out.println("Invalid protocol");

        System.out.println("type of website is ");
        if(ext.equals("com"))
          System.out.println("Commercial ");
        else if(ext.equals("org"))
          System.out.println("Organisational ");
        else if(ext.equals("net"))
          System.out.println("network");
        else
           System.out.println("Inavlid");
    
    
    }
}
