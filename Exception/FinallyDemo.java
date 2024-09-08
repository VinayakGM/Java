public class FinallyDemo {
    static void meth() throws Exception
    {
        try{
            throw new Exception();
        }
        finally
        {
            System.out.println("Finally");
        }
    }
    public static void main(String[] args) throws Exception
    {
        meth();
    // try{
    //     System.out.println(10/0);
    // }
    // finally
    // {
    //     System.out.println("Finally");
    // }
    }
}
