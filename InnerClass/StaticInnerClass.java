
class Outer
{   static int x=10;
    int y=20;
   
    static class Inner{
        public void Display()
        {
            System.out.println(x);
            // System.out.println(y);

        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args)
    {
        Outer.Inner i=new Outer.Inner();
        i.Display();
        
    }
}
