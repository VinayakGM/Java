import javax.swing.text.html.StyleSheet;

class superclass
{  public void display()
    {
        System.out.println("Superclass");
    }
 


}
class subclass extends superclass
{  public void display()
    {
        System.out.println("Subclass");
    }

}


public class method_override {
    
    public static void main(String[] args)
    {

        superclass su=new superclass();
        su.display();

        subclass s=new subclass();
        s.display();//method overriding

        // superclass su1=new subclass();
        // su1.display();//dynamic method dispatch
    }
}
