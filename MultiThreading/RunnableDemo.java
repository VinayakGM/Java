class MyThread implements Runnable
{
    public void run()
    {
        int i=1;
        while(i<20)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class RunnableDemo implements Runnable
{
    public void run()
    {
        int i=1;
        while(i<20)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args)
    {
     
       /*  MyThread m=new MyThread();
        Thread t=new Thread(m);
        t.start();
         */
         
       RunnableDemo r=new RunnableDemo();
       Thread t=new Thread(r);
       t.start();
     int i=1;
         while(i<5)
         {
             System.out.println(i+"World");
             i++;
         }
    }
    
}
