class Rectangle{
     private int length;
     private int breadth;
     int getlength()
     {
        return length;
     }
     int getbreadth()
     {
        return breadth;
     }
     void setlength(int l)
     {
        length=l;
     }
     void setbreadth(int b)
     {
        breadth=b;
     }

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

public class datahiding {
     public static void main(String[] args)
     {
    Rectangle r=new Rectangle();
      r.setbreadth(10);
      r.setlength(7);

      System.out.println("area: "+r.area());
      System.out.println("length: "+r.getlength());



     }
}
