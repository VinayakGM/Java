
abstract class base
{

    void meth()
    {
        System.out.println("its a base class");
    }
    abstract void meth2();
}
class child extends base{
    
    // public:
    void meth2()
    {
        System.out.println("its a child class");
        
    }
}

public class Abstractexample
{   
    public static void main(String[] args)
    {
        child c=new child();
        c.meth2();
    }

} 