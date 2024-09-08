class WB
{
    String msg;
    int Total=0;
    int count=0;
    synchronized public void write(String m)
    {
        System.out.println("Teacher is writing: ");
        while(count!=0)
        {
            try{wait();}catch(Exception e){}
        }
        count=Total;
      msg=m;
    //   count++;
      notifyAll();
    }
   synchronized public String read()
    {
        while(count==0)
        {
         try{wait();}catch(Exception e){}   
        }
        count--;
        String txt=msg;
        if(count==0)
        {
            notify();
        }
        return txt;

    
 
    }
    public void attendance()
    {
        Total++;
    }

}
class Teacher extends Thread
{
    WB w;
    String Txt[]={"Hello everyone","oops concept","end"};
    public Teacher(WB w)
    {
        this.w=w;
    }
    public void run()
    {
        for(int i=0;i<Txt.length;i++)
        {
            w.write(Txt[i]);
        }
    }
}
class Student extends Thread
{
    WB w;
    String Name;
    public Student(String n,WB w)
    {
        Name=n;
        this.w=w;
    }
    public void run()
    {
        String str;
        w.attendance();
        do{
            str=w.read();
            System.out.println("Student "+Name+" Reading: "+str);
            System.out.flush();
        }while(!str.equals("end"));
    }
}


public class SC2 {
    public static void main(String[] args)
    {
        WB w=new WB();
        Teacher t=new Teacher(w);
        Student s1=new Student("Anurag", w);
        Student s2=new Student("Anu", w);
        Student s3=new Student("A", w);
        t.start();

        s1.start();
        s2.start();
        s3.start();
    }
    
}
