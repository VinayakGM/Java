


public class Relational
{
    public static void main(String[] args)
   {  int a=10,b=12;
       System.out.println(a>b);
    
       int n=10;
       if(n>=10)
       {
         System.out.println("Positive");
       }
       else
       {
        System.out.println("Negative");
       }

     int m=1,r=10,p=12;
      if(m>r && m>p)
      {
        System.out.println(m);
      }
      else
      { if(r>p)
          {
            System.out.println(r);
          }
        else{
          System.out.println(p);
        }


      }
      //else if ladder
      if(m>r && m>p)
      {
        System.out.println(m);
      }
      else if(r>p)
      {
            System.out.println(r);
       }
      else
      {
          System.out.println(p);
      }


    




   }
}