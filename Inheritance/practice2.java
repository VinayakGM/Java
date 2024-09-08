class Rectangle
{ public int length;
  public int breadth;
  public int x=15;

  public Rectangle(int length,int breadth)
  {
   this.length=length;
    this.breadth=breadth;
  }
  public void display()
  {
    System.out.println("The length: "+this.length);
    System.out.println("The breadth: "+this.breadth);
  }
  public int  area()
  {
   return length*breadth;
  }

}
class Cuboid extends Rectangle
{ public int height;
 public int x=10;
   public Cuboid(int l,int b,int h)
   {
    super(l, h);
    // length=l;
    // breadth=b;
    this.height=h;
   }
  
   public void display()
   {
    System.out.println(super.x);
    System.out.println(x);

    System.out.println(height);

   }
   public  int volulme()
   {
    return area()*height;
   }


}
public class practice2 {
    public static void main(String[] args)
    {
        Cuboid c=new Cuboid(10, 10, 1);
        c.display();
        c.volulme();
    }
    
}
