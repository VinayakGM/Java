class Outer
{
    public void Display()
    {
        class Inner
        {
            void InnerDisplay()
            {
                System.out.println("Hello");
            }
        }
        // Inner i=new Inner();
        // i.InnerDisplay();
        new Inner().InnerDisplay();
    }
}

public class LocalInnerClass {
    public static void main(String[] args)
    {
        Outer o=new Outer();
        o.Display();
    }
    
}
