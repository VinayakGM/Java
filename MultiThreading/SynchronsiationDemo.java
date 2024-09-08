class data
{
   synchronized public void display(String str)
    {
    /*  synchronized(this)
      {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
    }*/
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
    
    }
}
class Mythread1 extends Thread
{
    data d;
    public Mythread1(data dat)
    {
        d=dat;
    }
    public void run()
    {
        d.display("hello world");
    }

}
class Mythread2 extends Thread
{
    data d;
    public Mythread2(data dat)
    {
        d=dat;
    }
    public void run()
    {
        d.display(" welcome");
    }

}
public class SynchronsiationDemo {
    public static void main(String[] args)
    {
        data d=new data();
        Mythread1 t1=new Mythread1(d);
        Mythread2 t2=new Mythread2(d);
        t1.start();
        t2.start();

    }
    
}
