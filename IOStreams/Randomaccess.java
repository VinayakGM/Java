import java.io.*;
public class Randomaccess {
    public static void main(String[] args) throws Exception
    {
      File fr=new File("Demo.txt");
      String str=new String("abcdefghio");
      byte b[]=str.getBytes();
      System.out.println(fr.canWrite());
      FileOutputStream f=new FileOutputStream("Demo.txt");
      f.write(b);


      RandomAccessFile rf=new RandomAccessFile("Demo.txt", "rw");
      System.out.println((char)rf.read());
      System.out.println((char)rf.read());
      System.out.println((char)rf.read());
      rf.write('C');
      System.out.println((char)rf.read());
      rf.skipBytes(2);
      System.out.println((char)rf.read());
      rf.seek(0);
      System.out.println((char)rf.read());
      System.out.println(rf.getFilePointer());
      rf.close();
      f.close();

    }
}
