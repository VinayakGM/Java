public class Student_challenge2 {
    public static void main(String[] args)
    {
         int A[][]={{1,2,3},{4,5,6},{7,8,9}};
         int B[][]={{1,2,3},{4,5,6},{7,8,9}};
         int C[][]=new int[A.length][A.length];
         for(int i=0;i<A.length;i++)
         {
            for(int j=0;j<A[i].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
         }
         System.out.println("The Addition of array: ");
         for(int i=0;i<A.length;i++)
         {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.format("%02d ",C[i][j]);
            }
            System.out.print("\n");
         }
         //Multiplication of array:
         int D[][]=new int[3][3];
         for(int i=0;i<A.length;i++)
         {
            for(int j=0;j<A[i].length;j++)
            {    int sum=0;
                 for(int k=0;k<A[i].length;k++)
                 {
                    sum+=A[i][k]*B[k][j];
                 }
                 D[i][j]=sum;
                
            }
         }
         System.out.println("The Multiplication of array: ");
         for(int i=0;i<D.length;i++)
         {
            for(int j=0;j<D[i].length;j++)
            {
                System.out.format("%02d ",D[i][j]);
            }
            System.out.print("\n");
         }
         //Sorting array of strings
         String str[]={"Python","ABCD","C++","ABCE"};
         java.util.Arrays.sort(str);
         for(String x:str)
         {
            System.out.print(x+" ");
         }
        }
}
