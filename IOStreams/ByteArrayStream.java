import java.io.*;

public class ByteArrayStream
{
    public static void main(String[] args) throws Exception
    {
        byte b[]={'a','b','c','d','e'};
        
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        // int x;

        // while((x=bis.read())!=-1)
        // {
        //     System.out.print((char)x);
        // }
        String str=new String(bis.readAllBytes());
        System.out.println(str);
        bis.close();

        ByteArrayOutputStream bout=new ByteArrayOutputStream(20);

        bout.write('a');
        bout.write('x');
        bout.write('d');
        bout.write('e');

        byte c[]=bout.toByteArray();

        for(byte x:c)
           System.out.println((char)x);

        // bout.writeTo(new FileOutputStream("Test.txt"));




        bout.close();


        CharArrayWriter cw=new CharArrayWriter(10);

        cw.write("hello world");
        String s=new String(cw.toString());

         System.out.println(s);
        // for(char x:s)
        //    System.out.println(x);


       cw.close();
    }
}
