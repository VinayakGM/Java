import java.io.*;
public class FileClass {
    public static void main(String[] args) throws Exception
    {
        try
        {
        
            File f=new File("myjava.txt");
            boolean iscreated=f.createNewFile();
            if(iscreated)
            {
                System.out.println("New file has been created");
            }
            else
            {
                System.out.println("File already exists");
            }
            System.out.println("is a directory "+f.isDirectory());
            System.out.println("is a file "+f.isFile());
            System.out.println("Absolute path: "+f.getAbsolutePath());

            System.out.println("Name of file "+f.getName());
            System.out.println("Check whether file exists "+f.exists());
            System.out.println("is it have parent "+f.getParent());
        
            

            // Wrinting into file
            FileWriter fw=new FileWriter("myjava.txt");
            String str="hi java ,how are you and why you are so complex";
            fw.write(str);
            fw.close();

            // Reading a file:
            //1. using file reader
            // FileReader fr=new FileReader("myjava.txt");
            // int x;
            // while((x=fr.read())!=-1)
            // {
    
            //     System.out.print((char)x);
            // }
            // fr.read();
            // fr.close();

            // 2.Buffered Streams
            // Using scanner
            // Scanner sc=new Scanner(f);
            // while(sc.hasNextLine())
            // {
            //     System.out.println(sc.nextLine());
            // }
            // sc.close();
            

       
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
    
}
