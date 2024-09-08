class data{
    int value;
    boolean flag=true;
   synchronized public void set(int v)
    {
        while(flag!=true)
        {
            try
            {wait();
            }
            catch(Exception e){}
        }
      value=v;
      flag=false;
      notify();
    }
  synchronized public int get()
    {
        int x=0;
        while(flag!=false)
          try {wait();}catch(Exception e){}


        x=value;
        flag=true;
        notify();
        return x;
    }
}
class Producer extends Thread
{
    data d;
    public Producer(data d)
    {
        this.d=d;
    }
    public void run()
    {
        int count=1;
    
        while(count<5)
        {
        d.set(count);
        System.out.println("Producer "+count);
        count++;
        }
    }
}
class Consumer extends Thread
{
    data d;
    public Consumer(data d)
    {
        this.d=d;
    }
    public void run()
    {
        
       int value=0;
       int i=0;
       while(i<4)
       {
        value=d.get();
        System.out.println("Consumer "+value);
        i++;
       }
    }
}
public class InterProcessDeom {
    public static void main(String[] args)
    {
        data d=new data();
        Producer p=new Producer(d);
        Consumer c=new Consumer(d);
        p.start();
        c.start();
    }
    
}
