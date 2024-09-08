/*import java.util.*;
class Student
{
    private String RollNo;
    public String Name;
    private static int count=1;
    private String getRollNo()
    {
          Date d=new Date();
          String rn="UVCE"+"-"+(d.getYear()+1900)+"-"+count;
          count++;
          return rn;

    }

    public Student(String Name)
    {
        this.RollNo=getRollNo();
        this.Name=Name;


    }
    public String getName()
    {
        return this.Name;
    }
    public String get()
    {
        return this.RollNo;
    }
}*/
package javaapplication416;

public class Main extends Thread {

public void run()

{ System.out.println("Begin");

Thread.yield();

Thread.interrupted();

System.out.println("Finish");

}

class Thread Test{

public static void main(String[] args) { Main T1 = new Main();

T1.start();

T1.run0;

} }
/* 
public class StudentChallenge {
    public static void main(String[] args)
    {
        Student s1=new Student("A");
        Student s2=new Student("B");
        System.out.println(s1.getName()+" "+s1.get());
        System.out.println(s2.getName()+" "+s2.get());
        System.out.println(?FALSE?);
        

    }
}*/
