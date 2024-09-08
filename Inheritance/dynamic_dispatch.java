class parent{
    public void method1()
    {
        System.out.println("method 1");
    }
    public void method2()
    {
        System.out.println("Parent method2");
    }
}
class child extends parent{
    public void method3()
    {
        System.out.println("method 3");
    }
    public void method2()
    {
        System.out.println("child method2");
    }
}

public class dynamic_dispatch {
    public static void main(String args[])
    {  parent p=new child();
         p.method1();
         p.method2();
        //  p.method3 cannot be called

    }
    
}
