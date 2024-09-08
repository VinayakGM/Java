import java.io.*;
class Student
{
   
   public int RollNo;
    public String Name;
    public String Dept;
}
public class Serialisation2 {
    public static void main(String[] args) throws Exception
    {
    //    FileOutputStream fo=new FileOutputStream("Student2.txt");
    //    DataOutputStream dos=new DataOutputStream(fo);

    //    Student s=new Student();
    //    s.RollNo=1;
    //    s.Name="A";
    //    s.Dept="ISE";
    //    dos.writeInt(s.RollNo);
    //    dos.writeUTF(s.Name);
    //    dos.writeUTF(s.Dept);

    //    dos.close();
    //    fo.close();

    FileInputStream fin=new FileInputStream("Student2.txt");
    DataInputStream din=new DataInputStream(fin);

    Student s=new Student();
    s.RollNo=din.readInt();
    s.Name=din.readUTF();
    s.Dept=din.readUTF();

    System.out.println(s.RollNo+" "+s.Name+" "+s.Dept);
    fin.close();
    din.close();
    }
    
}
