
abstract class shape
{
// {  public:
    abstract public int perimeter();
    abstract public int area();
}
class Rectangle extends shape{
    // public:
    int length;
    int breadth;
    Rectangle( int l,int b)
    {  
         length=l;
         breadth=b;

    }
     public int perimeter()
    {
        return 2*(length*breadth);
    }
   public int area()
    {
        return length*breadth;
    }
}   
class Circle extends shape{
    // public:
    double radius;
    Circle(int r)
    {  
         this.radius=r;

    }
    public int perimeter()
    {
         int a=(int) (2*Math.PI*radius);
         return a;
    }
    public int area()
    {
        int p=(int) (Math.PI*radius*radius);
        return p;
    }
    
}
public class studentchallenge 
{
   
    public static void main(String args[])
    {
        // shape r=new Rectangle(10,5);
        // System.out.println(r.area());
        // System.out.println(r.perimeter());
        
        Circle c=new Circle(10);
        System.out.println(c.perimeter());
        System.out.println(c.area());

    }
    
}
