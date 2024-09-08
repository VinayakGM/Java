public class studentchallenge {
     static boolean prime(int n)
     {  
        for(int i=2;i<=n/2;i++)
          {
            if(n%i==0)
             {
                return false;

             }
            
          }
        
             return true;



     }
     static int GCD(int m,int n)
     {   
         while(m!=n)
         {
         if(m>n)
           m=m-n;
          else if(n>m)
           n=n-m;
         }
         return m;  

     }
     static int max(int a[])
     {int m=a[0];
         for(int i=1;i<a.length;i++)
          {if(a[i]>m)
               m=a[i];
          }
          return m;
     }
    public static void main(String[] args)
    {
          System.out.println(prime(15));
          System.out.println("GCD of two number: "+GCD(25,15));
          int a[]={2,36,4,1,0};
          System.out.println("The max element in array: "+max(a));

    }
}
