import java.io.*;

public class SC2 {
    
    public static void main(String[] args) throws Exception
    {
       FileInputStream fis1=new FileInputStream("Src1.txt");
       FileInputStream fis2=new FileInputStream("Src2.txt");
       FileOutputStream fout=new FileOutputStream("Destination.txt");

        SequenceInputStream s=new SequenceInputStream(fis1,fis2);

        int x;
        while((x=s.read())!=-1)
        {
            fout.write(x);
        }
        fis1.close();
        fis2.close();
        s.close();
        fout.close();

    }
}
