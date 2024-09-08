import java.io.*;
class Student
{
   
   public int RollNo;
    public String Name;
    public String Dept;
}
public class Printstream {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("Student.txt");
        PrintStream ps=new PrintStream(fos);
        
        
        Student s=new Student();
        s.RollNo=10;
        s.Name="John";
        s.Dept="CSE";
        
        ps.println(s.RollNo);
        ps.println(s.Name);
        ps.println(s.Dept);
        
        ps.close();
        fos.close();
        // FileInputStream fin=new FileInputStream("Student.txt");
        // BufferedReader br=new BufferedReader(new InputStreamReader(fin));

        // Student s=new Student();
        // s.RollNo=Integer.parseInt(br.readLine());
        // s.Name=br.readLine();
        // s.Dept=br.readLine();

        // System.out.println(s.RollNo+" "+s.Name+" "+s.Dept);
        
       
    }
    
}
