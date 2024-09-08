class ATM
{
   synchronized public void Balance(String str)
    {
        System.out.println(str+" is cheeking balance ");
    }
   synchronized public void Withdraw(String name,int amount)
    {
        System.out.println("Customer "+name+"is withdrwaing amount"+amount);
    }
}
class Customer extends Thread
{
    private String name;
    private ATM a;
    private int amount;
    public Customer(String name,int amount,ATM a)
    {
        this.name=name;
        this.amount=amount;
        this.a=a;
    }
    public void run()
    {
        a.Balance(this.name);
        a.Withdraw(this.name,this.amount);

    }
}
public class SC1 {
    public static void main(String[] args)
    {
        ATM a=new ATM();
        Customer c1=new Customer("a", 1000,a);
        Customer c2=new Customer("b", 100,a);
        c1.start();
        c2.start();
        

    }
    
}
