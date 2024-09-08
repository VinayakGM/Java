public class Arraypractice
{
   public static void main(String[] args)
   {//creating and initialising array
       int A[]={1,2,3,4,5};
       int B[]=new int[5];
       int []C={2,4,5,6,7};


    //Accessing the array elements
       for(int i=0;i<A.length;i++)
      {
        System.out.print(A[i]+" ");
      }
      for(int i=0;i<C.length;i++)
      {
        System.out.println(++C[i]);//modifying array elemnts with for loop
      }
      for(int x:A)
      {
        System.out.print(x+" ");
      }


    }
}