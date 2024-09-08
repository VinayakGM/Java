import java.util.jar.Attributes.Name;

class Circle
{ private int radius;
  public Circle()
  {
    radius=0;

  }
  void setr(int r)
  {
    radius=r;
  }
  public double area()
  {
    return Math.PI*radius*radius;
  }
  public double perimeter()
  {
    return 2*Math.PI*radius;
  }



}
class Cylinder extends Circle
{
    private int height;
    void set(int h)
    {
        height=h;
    }
    public Cylinder()
    {
        height=0;
    }
    public double volulme()
    {
        return area()*height;
    }
    public double tsa()
    {
        return perimeter()*height+2*area();
    }

}
class Account
{
 public long Account_No;
 public String Name;
 public String Address;
 public long phone_no;

 void setaccountno(long a)
 { 
  Account_No=a;
 }
 void setphone_no(long p)
 { 
  phone_no=p;
 }
 void setaname(String name)
 { 
  Name=name;
 }
 void setAddress(String address)
 { 
  Address=address;
 }
 public Account(long a,String n,String A,long p)
 {
    Account_No=a;
    Name=n;
    Address=A;
    phone_no=p;

 }
 public long getaccount_no() { return Account_No;   }
 public long getphone_no() { return phone_no;   }
 public String getname() { return Name;   }
 public String getAddress() { return Address; }
 public void closeAccount()
 {
      System.out.println("The account"+Account_No+" has been closed");
 }


}
class SavingsAccount extends Account
{ public int balance=0;
  public  double amount;
  public int getbalance(){
    return balance;
  }
 public SavingsAccount(long Account_No,String Name,String Address,long phone_no,int bal)
 { super(Account_No,Name,Address,phone_no);

  balance=bal;
 }
public void setbal(long Account_No,int bal)
{  this.Account_No=Account_No;
    balance=bal;
}
  public void deposit(long Account_N0,int amt)
  { this.Account_No=Account_N0;
    balance+=amt;
    System.out.println("the Current balance is "+balance);
  }
  public void withdraw(long Account_No,int amt)
  { this.Account_No=Account_No;
    balance-=amt;
    System.out.println("the Current balance is "+balance);
  }
  public void fixeddeposit(int deposit,int time,int rate)
  {  double i=(deposit*time*rate)/100;
     amount=deposit+i;
    System.out.println("The amount after "+time+"years at the rate of "+rate+"% will be "+amount);
  }
  public String getdetails()
  {
    return "The Account details are :"+"\nAccount Number: "+getaccount_no()+"\nAccount holder Name:"+getname()+"\nAdrress "+getAddress()+"\nPhone number"+getphone_no()+"\nBalance: "+getbalance()+" ";
  }

}
class loanaccount extends Account
{
    public int loan;
    public int getloan(){return loan;}
    public loanaccount(long Account_No,String Name,String Address,long phone_no)
    {   super(Account_No,Name,Address,phone_no);
        loan=0;
    }
      
    public void giveloan(int l)
    {
        loan=loan+l;
        System.out.println("The loan amount of "+l+"has been sanctioned");
    }
    
    public void payemi(int e)
    {
        loan=loan-e;

    }
    public void repayment(int repay){
        loan=loan-repay;
    }

}
class parent
{ public parent()
  {
    System.out.println("Parent class");
  }
  public parent(int x)
  {
    System.out.println("value of parent:"+x);
  }


}
class child extends parent
{ public child()
  {
    System.out.println("Child class");
  }
  public child(int y)
  {
    System.out.println("value of parent:"+y);
  }
  public child(int x,int y)
  { super(x);
    System.out.println("value of parent:"+y);
  }

}
public class practice{

    public static void main(String[] args)
    {
            Cylinder c1=new Cylinder();
            c1.set(10);
            c1.setr(7);
            System.out.println("Volume "+c1.volulme());
            System.out.println("Area "+c1.tsa());

            SavingsAccount s=new SavingsAccount(12345,"Anurag","Bangalore",748308935,500);
            

            System.out.println(s.getdetails());
            s.deposit(12345,100);
            s.withdraw(12345, 500);
            System.out.println(s.getbalance());

          child c=new child(10,30);
            
            
        
            
    }

}