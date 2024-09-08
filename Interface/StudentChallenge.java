
interface Member
{
   public void callback();
}
class Store
{  
    Member mem[]=new Member[100];
    int count=0;

  public void register(Member m)
    {
        mem[count++]=m;
    }
  public  void InviteSale()
    {
        for(int i=0;i<count;i++)
        {
            mem[i].callback();
        }
    }
}
class Customer implements Member
{ 
    String Name;
    Customer(String name)
    {
        Name=name;
    }
   public void callback()
    {
        System.out.println("Ok I will visit "+Name);
    }
}
public class StudentChallenge {

    public static void main(String[] args)
    {
        Customer c1=new Customer("Vinod");
        Customer c2=new Customer("Vineeth");
        Store s=new Store();
        s.register(c1);
        s.register(c2);

        s.InviteSale();

    }
    
}