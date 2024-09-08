public class Student_Challenge {
    public static void main(String[] args)
    {   int A[]={1,2,3,4,5};
       //1.sum of array elements
       int sum=0;
    for(int i=0;i<A.length;i++)
    {
      sum+=A[i];

    }
       System.out.println("The sum of array elements: "+sum);
// Searching an element
   int key=6;
      int index=-1;
      for(int i=0;i<A.length;i++)
      {
        if(A[i]==key)
        {   
          index=i;
          break;
        }
      }
      if(index!=-1)
         System.out.println("The "+key+" element found at: "+index);
      else
         System.out.println("The "+key+" element not found " );

    //to find the max element
    int max=A[0];
    for(int i=0;i<A.length;i++)
    {
      if(A[i]>max)
         max=A[i];
    }
    System.out.println("Max element: "+max);

    int max1=A[0];
    int max2=A[0];

    for(int i=0;i<A.length;i++)
    {
      if(A[i]>max1)
      {  max2=max1;
         max1=A[i];
      }
      else if(A[i]<=max1 && A[i]>max2)
      {
        max2=A[i];
      }
    }
    System.out.println("second Max element: "+max2);
    //Right rotation 
    int n=A.length;
    int temp=A[n-1];
    for(int i=n-2;i>=0;i--)
    {
        A[i+1]=A[i];
    }
    A[0]=temp;
    System.out.println("After right rotation: ");
    for(int i=0;i<A.length;i++)
    {
      System.out.print(A[i]+" ");
    }
    System.out.println("");
    //Inserting an element
    int B[]=new int[10];
    int N=5;
    for(int i=0;i<N;i++)
    {
        B[i]=i+1;
    }
    int ele=7;
    int p=3;
   for(int i=N;i>p;i--)
   {
    B[i]=B[i-1];
   }
     B[p]=ele;
      System.out.println("After Insertion:");
     for(int i=0;i<B.length;i++)
     {
        System.out.print(B[i]+" ");
     }
     System.out.println("");
     //Deleting an element
     int del=2;//deleting index
     for(int i=del;i<B.length-1;i++)
     {
        B[i]=B[i+1];
     }
     System.out.println("After Deletion:");
     for(int i=0;i<B.length;i++)
     {
        System.out.print(B[i]+" ");
     }
     //Copying the elements into new array
     int c[]=new int[A.length];
      for(int i=0;i<n;i++)
      {
         c[i]=A[i];
      }
      System.out.println("\nElements after copying :");
      for(int i=0;i<n;i++)
      {
        System.out.print(c[i]+" ");
      }
      //Reverse copying elements
      int D[]={1,2,3,4,5};
      int E[]=new int[5];
      for(int i=D.length-1;i>=0;i--)
      {
          E[D.length-1-i]=D[i];
      }
      System.out.println("\nReverse copying elements: ");
      for(int i=0;i<n;i++)
      {
        System.out.print(E[i]+" ");
      }

      //increasing the size of array
      int F[]={2,4,6,8,10};
      int G[]=new int[2*F.length];
        for(int i=0;i<F.length;i++)
        {
            G[i]=F[i];
        }
        F=G;
    
       System.out.println("\n After increseing the size of array: ");
        for(int i=0;i<F.length;i++)
        {
          System.out.print(F[i]+" ");
        }
      System.out.println("");
    }
}
