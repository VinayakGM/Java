// import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SC1 {

    public static void main(String[] args) throws Exception
    {
        //  try(FileOutputStream f=new FileOutputStream("Src1.txt"))
        //  {
        //     String src=new String("HELLO WORLD");
        //     f.write(src.getBytes());

        //     f.close();

        //     FileInputStream fis=new FileInputStream("Src1.txt");
        //     byte b[]=new byte[fis.available()];
        //     fis.read(b);
        //     String str1=new String(b);
        //     fis.close();

        //     FileOutputStream fout=new FileOutputStream("Src2.txt");
        //     fout.write(str1.toLowerCase().getBytes());
        //     fout.close();



        //  }
        try{
            // Writing into src1 
            FileOutputStream f=new FileOutputStream("SC1.txt");
            String str="Hi Java";
            f.write(str.getBytes());
            f.close();

            // Reading from src1
            FileInputStream fis=new FileInputStream("SC1.txt");
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str1=new String(b);
            System.out.println("The data read from src1"+str1);
            fis.close();

            // Copying the read data into src2
            FileOutputStream fout=new FileOutputStream("SC2.txt");
            fout.write(str1.getBytes());
            
            fout.close();



        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}
