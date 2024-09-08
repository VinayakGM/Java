class HondaCity
{
    static double price=10.0;
    int a,b;
    static double OnroadPrice(String City)
    {
        switch(City)
        {
            case "mumbai":
              return price+price*0.1;
            case "Delhi":
              return price+price*0.12;
            default :
               return price;
        }
    }
}
public class Mygenders { public static void main(int args[])
{

// gender 1 for Woman and any other value for Man

int g=args[0]; 
int gender = g;

//System.out.println(g);

if (gender==1)
   System.out.println("Woman");
else;
 System.out.println("Man");

} 
    
}
class Test
{
    static
    {
        System.out.println("Test static block1");
    }
    static
    {
        System.out.println("Test static block2");
    }
}
public class StaticDemo
{
    static
    {
    System.out.println("Main staitic block1");
    System.out.println(20/20-20);
    

    }
    public static void main(String[] args)
    {// {
    //     HondaCity h1=new HondaCity();
    //     HondaCity h2=new HondaCity();
    //     System.out.println(HondaCity.price);
    //     System.out.println(HondaCity.OnroadPrice("mumbai"));
        // Test t=new Test();
    }
    static
    {
    System.out.println("Main staitic block1");
    }
}