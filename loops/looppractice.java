import java.lang.*;
public class looppractice {
    public static void main(String[] args)
    { int i=1,j=1,n=100;
        while(i<n)
        {
            System.out.print(i+" ");
            i=i*2;
        }
       System.out.println("");
        do{
            System.out.printf("%d ",j);
            j=j*2;
        }while(j<n);
        //infinite loops-when there is no condition*/
        //for loops
        System.out.println("");
        for( i=1;i<=10;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
