import java.util.*;

class Point implements Comparable
{
    int x;
    int y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
      public String toString()
    {
        return "("+x+","+y+")";
    }
    public int compareTo(Object o)
    {
        Point p=(Point)o;

        if(this.x<p.x)
           return -1;
        else if(this.x>p.x)
           return 1;
        else
        {
            if(this.y<p.y)
              return -1;
             else if(this.y>p.y)
                return 1;
            else
               return 0;
        }
        
    }
}
public class TreeSetDemo
{
    public static void main(String[] args)
    {
        
       
       /* TreeSet<Integer> ts=new TreeSet<>(List.of(1,4,5,6,7,2,3,1));
        
        System.out.println(ts);//removes duplicate and gives in sorted order
        
        ts.add(10);
        ts.add(0);
        System.out.println(ts);//removes duplicate and gives in sorted order*/
        
        TreeSet<Point> ts=new TreeSet<>();
        
        ts.add(new Point(2,2));
        ts.add(new Point(3,5));
        ts.add(new Point(2,4));
        
        System.out.println(ts);//removes duplicate and gives in sorted order




        

    }
}