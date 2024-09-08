public class methodpractice
{ static int max(int x,int y)
  {
     if(x>y)
        return x;
     else
        return y;
  }
  static void change(int A[],int index,int val)
  {
    A[index]=val;
  }
 static String Username(String email)
  {
    int a=email.indexOf('@');
    String name=email.substring(0, a);
    return  name;
  }
  public static void main(String[] args)
  { int a=10,b=11,c;
    c=max(a,b);
    // methodpractice m=new methodpractice(); creating the new object
    // System.out.println(m.max(b, a)); calling the method by object
     System.out.println(c);

     int A[]={1,2,3,4,5};
    //  Passing objects as a parameters
     change(A, 3,25);
     
     System.out.println(A[3]);

    String str="vinayakm2002@gmail.com";
    System.out.println(Username(str));

  }


}