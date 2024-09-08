
class Outer
{
    int x=20;
    class Inner
    {
        int y=10;
        public void InnerDisplay()
        {
            System.out.println(x);
            System.out.println(y);

        }
    }
    void OuterDisplay()
    {
        Inner I=new Inner();
        I.InnerDisplay();
        System.out.println(I.y);
    }

}


public class NestedInnerClass
{
    public static void main(String[] args)
    {
        Outer O=new Outer();
        O.OuterDisplay();
        // creating inner class object directly
        Outer.Inner i=new Outer().new Inner();
        i.InnerDisplay();
    }

}