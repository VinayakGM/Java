interface test{
    final static int X=10;
    void meth1();
    void meth2();

    public static void meth3()
    {
    System.out.println("static meth3 of test\n");
    }
    default void meth4()
    {
        System.out.println("Default method");
    }
}
interface test2 extends test
{
    void meth5();

}
class My implements test2
{
   public void meth1()
    {

    }
   public void meth2()
    {

    }
   public void meth5()
    {

    }
} 



public class DosandDonts {
    public static void main(String[] args)
    {
        System.out.println(test.X);
        test.meth3();
        // test.meth4();
    }
    
}
