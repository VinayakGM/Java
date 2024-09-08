
class MyObject
{
    public String toString()
    {
        return "MYObject";
    }

}
public class ObjectClassDemo
{
    public static void main(String[] args)
    {
        Object o1=new Object();
        Object o2=o1;
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o1);
        MyObject o=new MyObject();
        // o.
        System.out.println(o);


    }

}