// import mypack1.Demo;
// import mypack1.Demo2;
// import mypack1.inner.Demo3;


public class Test {
    public static void main(String args[])
    {
        // Demo d1=new Demo();
        // Demo2 d2=new Demo2();
        // Demo3 d3=new Demo3();
        // d1.Display();
        // d2.Display();
        // d3.Display();
        int i,j,k,x=0;
        for(i=1;i<3;i++)
        {
            for(j=1;j<i;j++)
            {
                k=i+j-1;
                if(k%2==0)
                  x+=k;
                 else 
                   {
                    if(k%2==0)
                    {
                        x+=k-1;
                    }
                System.out.print(x);
            }
        }
        System.out.print(x);
    }
    }
    
}
