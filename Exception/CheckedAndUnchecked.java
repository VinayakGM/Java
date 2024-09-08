import java.io.*;
class LowBalance extends Exception
{
    public String toString()
    {
        return "Balance should not be less than 500";
    }
}
public class CheckedAndUnchecked {
    static void fun1()
    {
      /*  try
       {
        System.out.println(10/0);
       }
       catch(Exception e)
       {
    //    System.out.println(e.getMessage());
    //    System.out.println(e.toString());
    //    System.out.println(e);
    e.printStackTrace();
       }
    */
    // Checked exception
   /*  try
    {
    FileInputStream f= new FileInputStream("my.txt");
    }
    catch(Exception e)
    {
       System.out.println(e);
    }*/
    try
    {
        throw new LowBalance();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

       
    }
    static void fun2()
    {
     fun1();
    }
    static void fun3()
    {
        fun2();
    }
    public static void main(String[] args)
    {
        fun3();
    }

}
