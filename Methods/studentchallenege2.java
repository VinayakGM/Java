public class studentchallenege2 {
     static int area(int l,int b){
        return l*b;
      }
      static double area(int r)
      {
        double a=3.14*r*r;
        return a;
      }
      static void reverse(int arr[])
      { int i=0;
         int j=arr.length-1;
         while(i<=j)
         {  int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            i++;
            j--;
         }
      }
      static int reverse(int n)
      {
        int rev=0;
        while(n!=0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
      }
      static boolean validate(int age)
      { if(age>3 && age<18)
          return true;
        else 
          return false;
      }
      static boolean validate(String name)
      {  if(name.matches("[^0-9]+"))
            return true;
        else 
            return false;

      }
      public static void main(String[] args)
      {  
          System.out.println("Area of Rectangle: "+area(10,4));
          System.out.println("Area of Circle: "+area(10));

          int a[]={1,2,3,4,5};
          reverse(a);
          System.out.println("The reverse of array: ");
          for(int x:a)
          {
            System.out.print(x+" ");
          }
         System.out.println("\nThe reverse of a number:"+reverse(123));

         System.out.println("Valid age "+validate(12));
         System.out.println("Valid name "+validate("vinayakm2002"));
      }
}
