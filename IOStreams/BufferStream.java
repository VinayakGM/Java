import java.io.*;
public class BufferStream {
    public static void main(String[] args) throws Exception
    {
        // FileInputStream fis=new FileInputStream("Test1.txt");
        // BufferedInputStream bis=new BufferedInputStream(fis);
        FileReader fis=new FileReader("Test1.txt");
        BufferedReader bis=new BufferedReader(fis);

        // int x;
        // while((x=bis.read())!=-1)
        // {
        //     System.out.println((char)x);
        // }

        System.out.println(bis.markSupported());
        System.out.println(fis.markSupported());
        // java learning

        // System.out.println((char)bis.read());
        // System.out.println((char)bis.read());
        // bis.mark(10); //10 is number of chracterr for which mark  is set
        // System.out.println((char)bis.read());
        // System.out.println((char)bis.read());
        // bis.reset();
        // System.out.println((char)bis.read());
        // System.out.println((char)bis.read());
        System.out.println(bis.readLine());
        bis.close();
        fis.close();
      
    }
    
}
