import java.io.*;

// class Producer extends Thread{
//     OutputStream os;

//     public Producer(OutputStream o)
//     {
//         os=o;

//     }

//     public void run()
//     {
//         int count=1;
    
//     while(count<10)
//     {
//         try{
//             os.write(count);
//             os.flush();

//             System.out.println("Producer "+count);
//             System.out.flush();

//             Thread.sleep(20);
//             count++;


//         }catch(Exception e)
//         {

//         }

//     }
// }
// }
// class Consumer extends Thread{
//     InputStream is;

//     public Consumer(InputStream i)
//     {
//         is=i;

//     }

//     public void run()
//     {
//         int x;
//        while(true)
//        {
//         try{
//             x=is.read();
//             System.out.println("Consumer "+x);
//             System.out.flush();

//             Thread.sleep(20);

//         }catch(Exception e)
//         {


//         }
//     }
      
        
//     }

// }


// public class PipedStream {
//     public static void main(String[] args) throws Exception
//     {
//       PipedInputStream pis=new PipedInputStream();
//       PipedOutputStream pos=new PipedOutputStream();

//       pos.connect(pis);

//       Producer p=new Producer(pos);
//       Consumer c=new Consumer(pis);

//       p.start();
//       c.start();

//     }
// }
class Producer extends Thread
{
    OutputStream os;
    public Producer(OutputStream os)
    {
        this.os=os;
    }
    public void run()
    {
        int count=1;
        while(count<10)
        {
        try{
            os.write(count);
            System.out.println("Prouducer "+count);
            count++;
            os.flush();
            Thread.sleep(20);


        }
        catch(Exception e)
        {

        }
    }
    }
}
class Consumer extends Thread
{
    InputStream is;
    public Consumer (InputStream is)
    {
        this.is=is;
    }
    public void run()
    {
        int x;
        while(true)
        {
        try{
            x=is.read();
            System.out.println("Consumer: "+x);
            System.out.flush();
            Thread.sleep(20);

        }
        catch(Exception e)
        {

        }
    }
    }
}
public class PipedStream
{
    public static void main(String[] args) throws Exception {
         PipedInputStream pis=new PipedInputStream();
         PipedOutputStream pos=new PipedOutputStream();
         pis.connect(pos);
         Producer p=new Producer(pos);
         Consumer c=new Consumer(pis);

         p.start();
         c.start();


         pos.close();
         pis.close();



    }
}