public class recursion {
    static void fun(int n)
    {  if(n>0)
        {
            System.out.print(n+" ");
            fun(n-1);
        }


    }
    static void fun2(int n)
    {  if(n>0)
        {   fun(n-1);

            System.out.print(n+" ");
            
        }


    }

    public static void main(String[] args)
    {

        fun(5);
        System.out.println("");
        fun2(5);

        
    }
}
