public class twodarray {
    public static void main(String[] args)
    {
       int A[][]=new int[5][5];
       int B[][]={{1,2,3},{4,5,6},{7,8,9}};
       int [][]C=new int[5][5];
       int []D[]=new int[5][5];
       int[] E,F[];
       E=new int[5];
       F=new int[5][6];
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[i].length;j++)
            {
                System.out.print(B[i][j]+" ");

            }
             System.out.println("");
        }
        //using for each loop
        for(int x[]:B)
        {
            for(int y:x)
            {
                System.out.print(y+" ");

            }
             System.out.println("");
        }
        //jagged arry;
        int N[][];
        N=new int[3][];
        N[0]=new int[2];
        N[1]=new int[1];
        N[2]=new int[3];
        for(int i=0;i<N.length;i++)
        {
            for(int j=0;j<N[i].length;j++)
            {
                System.out.print(N[i][j]+" ");

            }
             System.out.println("");
        }
        
    } 
}
