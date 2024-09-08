import java.io.*;
// import java.FileInputStream;

public class FileInput {
    
    public static void main(String[] args) 
    {
       
        try{
            FileInputStream fis=new FileInputStream("Test.txt");
            // Reading Byte array from Test.txt
            // byte b[]=new byte[fis.available()];
            // fis.read(b);
            // String str=new String(b);
            // System.out.println(str);

            // Reading byte
            int x;
            while((x=fis.read())!=-1)
            {
                System.out.println((char)x);
            }
            fis.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
          System.out.println(e);

        }
    }
    
}
