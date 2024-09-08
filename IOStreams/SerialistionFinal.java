import java.io.*;
class Student implements Serializable
{
    public int RollNo;
    public String Name;
    public String Dept;
    public Student()
    {

    }
    public Student(int RollNo,String Name,String Dept)
    {
        this.RollNo=RollNo;
        this.Name=Name;
        this.Dept=Dept;
    }
    public String toString()
    {
          return RollNo+" "+Name+" "+Dept; 
    }

}


