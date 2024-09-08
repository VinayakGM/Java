class NegativeDimension extends Exception
{
    public String toString()
    {
        return "dimesion cannot be negative";
    }
}
public class ThrowVsThrows {
    static int area(int l,int b) throws Exception
    {
        if(l<0 || b<0)
        {
            // throw new Exception("Dimension cannot be negative");
            throw new NegativeDimension();
        }
        return l*b;
    }
    static void meth() throws Exception
    {
        System.out.println("Area: "+area(-1,2));

    }
    public static void main(String[] args) 
    {  try
        {
         meth();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
