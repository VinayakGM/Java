class MyThread extends Thread
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
public class ThreadDemo extends Thread
{
    public void run()
    {

        int i=1;
        while(i<5)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
   public static void main(String[] args)
   {
    // MyThread t=new MyThread();
    // t.start();
    ThreadDemo t=new ThreadDemo();
    t.start();
    int i=1;
        while(i<5)
        {
            System.out.println(i+"World");
            i++;
        }
   }

}