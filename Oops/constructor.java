import java.util.jar.Attributes.Name;

class Rectangle{
    private int length;
    private int breadth;
   
    public Rectangle()
    {
        length=1;
        breadth=1;
    }
    public Rectangle(int l,int b)
    {
        length=l;
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
class cylinder
{   private int radius;
    private int height;
    int getradius()
    {
        return radius;
    }
    int getheight()
    {
        return height;
    }
    void setradius(int r1)
    {
        radius=r1;
    }
    void setheight(int h)
    {
        height=h;
    }
    public cylinder()
    {
        radius=0;
        height=0;
    }
    public cylinder(int r1,int h1)
    {
        radius=r1;
        height=h1;
    }
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
//student challenge2
class Product
{  private String itemNo;
   private String Name;
   private double price;
   private int quantity;
   public String getItemNo()
   {
    return itemNo;
   }
   public String getItemName()
   {
    return Name;
   }
   public double getprice()
   {
    return price;
   }
   public int getquantity()
   {
    return quantity;
   } 
   void setprice(double d)
   {
    price=d;
   }
   void setquantity(int q)
   { quantity=q;

   }
   public Product(String i,String n)
   {
      itemNo=i;
      Name=n;
   }
   public Product(String i,String n,double d,int q)
   {
      itemNo=i;
      Name=n;
      price=d;
      quantity=q;
   }




}
class Customer
{ private String Customer_id;
  private String name;
  private String Address;
  private long Phone_Number;

  public String getCustomer_Id(){return Customer_id;}
  public String getName(){return name;}
  public String getAddress(){return Address;}
  public long getPhonenumber(){return Phone_Number;}

  void setPhone_Number(long phone_no)
  {
    Phone_Number=phone_no;
  }

  public Customer(String c,String n,String a,long p)
  {
    Customer_id=c;
    name=n;
    Address=a;
    Phone_Number=p;
  }

  public Customer(String c,String n,String a)
  {
    Customer_id=c;
    name=n;
    Address=a;

  }


}
class Subject
{ private String sub_id;
  private String Name;
  private int max_marks;
  private int marks_ob;

  public String getSub_id(){return sub_id;}
  public String getSub_name(){return Name;}
  public int getMax_Marks(){return max_marks;}
  public  int getmarks_ob(){return marks_ob;}

  void setmarks_ob(int m)
  {
    marks_ob=m;
  }
  
  public Subject(String s_id,String n,int max)
  {
    sub_id=s_id;
    Name=n;
    max_marks=max;

  }
  public Subject(String s_id,String n,int max,int m)
  {
    sub_id=s_id;
    Name=n;
    max_marks=max;
    marks_ob=m;

  }
  public String toString() 
  {
    return "\nSubject_Id "+sub_id+"\n Subject_Name "+Name+"\n Max_Marks "+max_marks+"\n Marks_obtained "+marks_ob;
  }

}
class student
{ private int Roll_NO;
  private String Name;
  private  Subject s[];
   public Subject(S)


}
public class constructor {
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle(10,9);
       
  
        System.out.println("area: "+r.area());
        // System.out.println("length: "+r.getlength());

        cylinder c=new cylinder(7,6);

      System.out.println("lid Area "+c.lidarea());
       System.out.println("Total Area  "+c.TSA());
       System.out.println("Volume  "+c.volume());

       Product p=new Product("A123", "Pespi",10.00,100);
       System.out.println("The Product details: ");
       System.out.println("Item Number: "+p.getItemNo());
       System.out.println("Item Name: "+p.getItemName());
       System.out.println("Item Price: "+p.getprice());
       System.out.println("Item quantity: "+p.getquantity());

       Customer c1=new Customer("20GA", "A","Mandya",748308925);
       System.out.println("Details of customer: ");
       System.out.println("Customer Name: "+c1.getName());
       System.out.println("Customer Id: "+c1.getCustomer_Id());
       System.out.println("Customer Address: "+c1.getAddress());
       System.out.println("Customer Phone_Number: "+c1.getPhonenumber());
    //    arry of objects
        Subject sub[]=new Subject[3];
        sub[0]=new Subject("20OS","OS",100,90);
        sub[1]=new Subject("20dsa","DSA",100,90);
        sub[2]=new Subject("20daa","DAA",100,90);
          for(Subject s:sub)
          {
            System.out.println(s);
          }

    }
}
