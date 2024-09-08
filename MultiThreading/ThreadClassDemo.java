class MyThread extends Thread
{
    public MyThread(String name)
    {
      super(name);
    //   setPriority(MAX_PRIORITY);
    }
    public void run()
    {
        int count=0;
        while(count<20)
        {
            System.out.println(count+" MyThread");
            count++;
           /* try{
            Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            */

        }
    }
}
public class ThreadClassDemo {
    public static void main(String[] name)
    {
        MyThread t=new MyThread("Thread1");
        t.start();
        int count=0;
        while(count<20)
        {
            System.out.println(count+" MainThread");
            count++;
         
            Thread.yield();

        }
       
        /*  t.setDaemon(true);
        t.start();
        Thread MainThread=Thread.currentThread();
        try{
        MainThread.join();
        }
        catch(InterruptedException e)
        {

        }
        /*try
        {
             Thread.sleep(100);
        }
        catch(Exception e)
        {
           System.out.println(e);
        }*/
        // t.interrupt();
        /*System.out.println("ID: "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        System.out.println("State: "+t.getState());
        System.out.println("IsAlive "+t.isAlive());*/
    }
}
