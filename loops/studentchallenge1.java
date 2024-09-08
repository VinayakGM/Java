import java.util.*;

public class studentchallenge1 {
    public static void main(String[] args)
    {   //Multiplication table
        Scanner s=new Scanner(System.in);
    
        System.out.println("Enter the number: ");
        int n=s.nextInt();
      /*   for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
        //sum of natural numbers
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum: "+sum);
        //factorial of number
        int fact=1;
         for(int i=n;i>=1;i--)
         {
            fact=fact*i;
         }
         System.out.println("Factorial: "+fact);*/
         //Display digits
         int p=n;
         System.out.println("The digits are: ");
         int count=0;
         while(n!=0)
         {  int r=n%10;
             System.out.print(r+" ");
             n=n/10;
            count++;          
 
         }
         //to count the digits:
         System.out.println("\nThe no of digits are: "+count);;
       //to check whether given number is armstrong number
         int temp=p;
         int total=0;
         while(p!=0)
         { int r=p%10;
             total+=r*r*r;
             p=p/10;

         }
         if(total==temp)
            System.out.println("The given number is Armstrong number");
         else
          System.out.println("The guven number is not a armstrong number");
          int reverse=0;
          int a=temp;
          while(temp!=0)
          { int r=temp%10;
            reverse=reverse*10+r;
            temp=temp/10;

          }
          System.out.println("The Reverse of a number is: "+reverse);
          //to check a number is pallindrome or not
          if(reverse==a)
            System.out.println("The number is Palindrome ");
          else
            System.out.println("The number is not a Palindrome ");
          //to prints the digits in words;
          int b=a;
           int rev2=0;
          while(a!=0)
          {
            int r=a%10;
            rev2=rev2*10+r;
            a=a/10;
          }
          String str="";
          while(rev2!=0)
          {
              int r=rev2%10;
              rev2=rev2/10;
              str=str+r;
          }
          for(int i=str.length()-1;i>=0;i--)
          {   char c=str.charAt(i);
              switch(c)
              { case '0':System.out.print("zero "); break;
                case '1':System.out.print("one "); break;
                case '2':System.out.print("two "); break;
                case '3':System.out.print("three "); break;
                case '4':System.out.print("four "); break;
                case '5':System.out.print("five "); break;
                case '6':System.out.print("six "); break;
                case '7':System.out.print("seven "); break;
                case '8':System.out.print("eight "); break;
                case '9':System.out.print("nine "); break;


              }
          }
          //to print the ap series
          int N=5;
          int first=5;
          int d=3;
          System.out.println("the Ap series: ");
          for(int i=0;i<N;i++)
          {  int sum=first+d*i;
            System.out.print(sum+" ,");
          }
          //to print gp series
          int f2=2;
            int r=2;
               int term=f2;
            for(int i=0;i<N;i++)
            {  
            
               System.out.print(term+" ,");
               term=term*r;


            }
            //Fibonacci series
            int u=0;
            int v=1;
            System.out.println("\nEnter the number :");
            int x=s.nextInt();
              if(x==0)
                System.out.print(u);
             else if(x==1)
             {System.out.print(u);
              System.out.print(v);
             }
             else
             { System.out.print(u+" ");
              System.out.print(v+" ");
              for(int i=2;i<=x;i++)
              {  int z=u+v;
                 System.out.print(z+" ");
                  u=v;
                  v=z;
                
              }
            }
         System.out.println("");
    }
}
