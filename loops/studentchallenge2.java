public class studentchallenge2 {
    public static void main(String[] args)
    {   //pattern 1
         for(int i=1;i<=5;i++)
        { for(int j=1;j<=5;j++)
             {
                System.out.print(j+" ");
             }
             System.out.print("\n");

        }
        System.out.print("\n");
      //pattern2
      for(int i=1;i<=5;i++)
        { for(int j=1;j<=5;j++)
             {
                System.out.print(i+" ");
             }
             System.out.print("\n");

        }
        System.out.print("\n");
        //pattern 3
        for(int i=1;i<=5;i++)
        { for(int j=1;j<=5;j++)
             {
                System.out.print(i+j+" ");
             }
             System.out.print("\n");

        }
        System.out.print("\n");
        //pattern 4
        int count=1;
        for(int i=1;i<=5;i++)
        { for(int j=1;j<=5;j++)
             {
                System.out.format("%02d ",count);
                count++;
             }
             System.out.print("\n");

        }
        System.out.print("\n");

        //patter =n 5
        for(int i=1;i<=5;i++)
        { for(int j=1;j<=i;j++)
             {
                System.out.format("%d ",j);
                count++;
             }
             System.out.print("\n");

        }
        System.out.print("\n");
         //pattern 6
         int c=1;
         for(int i=1;i<=5;i++)
         { for(int j=1;j<=i;j++)
              {
                 System.out.format("%02d ",c);
                 c++;
              }
              System.out.print("\n");
 
         }
         System.out.print("\n");
          //pattern 7
          for(int i=1;i<=5;i++)
          { for(int j=1;j<=(5-i+1);j++)
               {
                  System.out.format("%d ",j);
                
               }
               System.out.print("\n");
  
          }
          System.out.print("\n");
        //pattern 8
        for(int i=0;i<5;i++)
        {   for(int j=0;j<i;j++)
             {
                System.out.print("  ");
            
             }
            for(int j=0;j<(5-i);j++)
            {
                System.out.print(" *");
            }
            System.out.print("\n");

        }
        System.out.print("\n");
        //pattern 9
        for(int i=1;i<=5;i++)
        {   for(int j=1;j<=5;j++)
             {  if(j<=(5-i))
                   System.out.print("  ");
                else
                   System.out.print("* ");

             }
            System.out.print("\n");

        }
        System.out.print("\n");

        for(int i=1;i<=5;i++)
        {   for(int j=1;j<=(5-i);j++)
             {  
                   System.out.print("  ");
             }
             for(int j=1;j<=i;j++)
             {  
            System.out.print("* ");
             }
            System.out.print("\n");

        }
        System.out.print("\n");

        //pattern 10-upper traingle
        for(int i=1;i<=5;i++)
        {   for(int j=5;j>i;j--)
             {  
                   System.out.print("  ");
             }
             for(int j=1;j<=(2*i-1);j++)
             {  
              System.out.print("* ");
             }
             for(int j=5;j>i;j--)
             {  
                   System.out.print("  ");
             }
            System.out.print("\n");

        }
        //lower triangle
        for(int i=1;i<=5;i++)
        {   for(int j=1;j<i;j++)
             {  
                   System.out.print("  ");
             }
             for(int j=1;j<=(2*(5-i)+1);j++)
             {  
              System.out.print("* ");
             }
             for(int j=1;j<i;j++)
             {  
                   System.out.print("  ");
             }
            System.out.print("\n");

        }

        System.out.print("\n");



    }
}
