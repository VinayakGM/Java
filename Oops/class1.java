
class circle
{
    public int radius;
    public double area()
    {
        return Math.PI *radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI *radius;
    }
    public double circumference()
    {
        return 2*Math.PI *radius;
    }

}
class Rectangle{
    public int length;
    public int breadth;
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean issquare()
    {
        if(length==breadth)
          return true;
        else 
          return false;
    }
}
class cylinder
{   public int radius;
    public int height;
    public double lidarea()
    {
        return Math.PI*radius*radius;
    }
    public double Circumference2()
    {
        return 2*Math.PI *radius;
    }
    public double TSA()
    {
        return 2*lidarea()+(height*Circumference2());
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }



}
// student challenge
class student
{  int roll_no;
   String Name;
   String Course;
   int m1,m2,m3;


   public int Total()
   {
    return m1+m2+m3;
   }
   public double avg()
   {
    return Total()/3;
   }
   public char grade()
   {  double g=avg();
      if(g>90)
            return 'A';
      else if(g>80 & g<=90)
            return 'B';
      else 
           return 'C';

   }
  public String toString()
  {
    return "\nRoll_No "+roll_no+"\nName:"+Name+"\nCourse "+"\n";
  }


    
}
public class class1
{
       public static void main(String[] args) {
        circle c1=new circle();
      c1.radius=10;
      System.out.println("Area "+c1.area());
      System.out.println("Perimeter "+c1.perimeter());
      System.out.println("Circumferenece "+c1.circumference());

       Rectangle r=new Rectangle();
       r.breadth=10;
       r.length=10;
       System.out.println("Area "+r.area());
       System.out.println("Perimeter "+r.perimeter());
       System.out.println("is it a square  "+r.issquare());

       cylinder c=new cylinder();
       c.height=10;
       c.radius=7;

       System.out.println("lid Area "+c.lidarea());
       System.out.println("Total Area  "+c.TSA());
       System.out.println("Volume  "+c.volume());

        student s=new student();
        s.Name="a";
        s.roll_no=89;
        s.Course="cse";
        s.m1=90;
        s.m2=98;
        s.m3=87;

        System.out.println("Total "+s.Total());
        System.out.println("Average "+s.avg());
        System.out.println("Grade "+s.grade());
        System.out.println("details "+s);

         
      }


}