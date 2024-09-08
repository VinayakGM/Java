public class studentchallenge3 {
    static int max(int ...A)
    { int large=0;
         for(int i=0;i<A.length;i++)
         {
            if(A[i]>large)
             large=A[i];
         }
       return large;

    }
    static int sum(int ...A)
    {  int total=0;
        for(int i=0;i<A.length;i++)
         {
            total+=A[i];
         }

            return total;

    }
    static double discount(Double ...p)
    {  double dis=0.0;
        double s=0;
        for(int i=0;i<p.length;i++)
        {
            s+=p[i];
        }
        if(s<500)
            dis=0.05*s;
        else if(s<1000 && s>500)
            dis=0.1*s;
        else if(s<2000 && s>1000)
            dis=0.15*s;
        else if(s<5000 && s>2000)
            dis=0.2*s;

        return dis;

    }
    public static void main(String[] args)
    {    System.out.println("Max element: "+max(10,20));
        System.out.println("Max element: "+max(10,20,40,60));
        System.out.println("Max element: "+max());
        
        System.out.println("sum of  element: "+sum(10,20));
        System.out.println("sum of element: "+sum(10,20,40,60));
        System.out.println("sum of  element: "+sum());

        System.out.println("Discount: "+discount());
        System.out.println("Discount: "+discount(150.0,300.0,200.0));
        System.out.println("Discount: "+discount(500.0,1500.0,340.0));

        
    }
}
