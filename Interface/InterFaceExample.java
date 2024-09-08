

interface test
{
    void meth1();
    void meth2();
}
class my implements test
{
    public void meth1()
    {
        System.out.println("meth1 of my");
    }
    public void meth2()
    {
        System.out.println("meth2 of my");
    }

}
class Phone
{
    // public:
    void call()
    {
        System.out.println("Phone call");
    }
    void sms()
    {
        System.out.println("sms");
    }
}
interface Icamera
{
    void click();
    void record();
    
}
interface IMusicPlayer
{
    void Play();
    void stop();
    void pause();
}
class Smartphone extends Phone implements Icamera,IMusicPlayer
{ 
    public void VideoCall()
    {
        System.out.println("video call new feature of smartphone");
    }
    public void click()
    {
        System.out.println("video call new feature of smartphone");
    }
    public void record()
    {
        System.out.println("video call new feature of smartphone");
    }
    public void Play()
    {
        System.out.println("video call new feature of smartphone");
    }
    public void pause()
    {
        System.out.println("video call new feature of smartphone");
    }
    public void stop()
    {
        System.out.println("video call new feature of smartphone");
    }
    
}
public class InterFaceExample
{
   public static void main(String[] args)
   {
       /*  test t=new my();
        t.meth1();
        t.meth2();*/
        // Smartphone s=new Smartphone();
        // Icamera i=s;
        // Phone p=s;
        // IMusicPlayer m=s;
        // s.VideoCall();
        // s.Play();
        // s.click();

         static final int v=10;
        System.out.println(v);
   }
}