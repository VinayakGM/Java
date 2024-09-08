
import java.io.*;
class Cutstomer implements Serializable
{
    String Custid;
    String Name;

    static int c=1;
    public Cutstomer()
    {

    }
    public Cutstomer(String Name)
    {
        this.Custid="C"+c;
        c++;
        this.Name=Name;
    }
    public String toString()
    {
        return Custid+" "+Name;
    }
}
public class SC3 {
    public static void main(String[] args) throws Exception
    {
    //  FileOutputStream fos=new FileOutputStream("data.txt");
    //  DataOutputStream dos=new DataOutputStream(fos);

    //  float list[]={0.1f,0.2f,0.3f};

    //  for(int i=0;i<list.length;i++)
    //  {
    //     dos.writeFloat(list[i]);
    //  }
    //  dos.close();
    // fos.close();

    // FileInputStream fis=new FileInputStream("data.txt");
    //  DataInputStream dis=new DataInputStream(fis);

    // for(int i=0;i<dis.available();i++)
    // {
    //    System.out.println(dis.readFloat());
    // }


     
    

    //  dis.close();
    // fis.close();
    // Cutstomer list[]={new Cutstomer("A"),new Cutstomer("B"),new Cutstomer("C"),new Cutstomer("D")};
    // FileOutputStream fo=new FileOutputStream("Customer.txt");
    // ObjectOutputStream os=new ObjectOutputStream(fo);

    // for(int i=0;i<list.length;i++)
    // {
    //     os.writeObject(list[i]);
    // }
    // os.close();;
    // fo.close();
      FileInputStream fi=new FileInputStream("Customer.txt");
    ObjectInputStream oi=new ObjectInputStream(fi);

     Cutstomer list[]=new Cutstomer[oi.available()];
    for(int i=0;i<list.length;i++)
    {
        list[i]=(Cutstomer)oi.readObject();
        System.out.println(list[i].toString());
        
    }
    oi.close();;
    fi.close();




        
    }
}
