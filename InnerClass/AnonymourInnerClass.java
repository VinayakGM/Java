
abstract class My
{
    abstract public void show();
}
class Outer
{
    public void Display()
    {
       
        My m=new My() {
            public void show()
            {
                System.out.println("Hello");
            }
        };
        m.show();
    }
}



    

public class AnonymourInnerClass {
      public static void main(String[] args)
    {
        Outer o=new Outer();
        o.Display();
    }
}
