import java.io.*;

public class FileExample
{
    public static void main(String[] args)
    {
        try{
        FileOutputStream f=new FileOutputStream("Test3.txt");
        String str="Learn Java Programming";

        byte b[]=str.getBytes();
        // using offset
        f.write(b);
        // writing a single byte
        // for(byte x:b)
        //    f.write(x);
            
    //    wrinti9ng byte[] array
        // f.write(str.getBytes());
        f.close();
    
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