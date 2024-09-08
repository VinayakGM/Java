public class variableargument {
     static void show(int ...x)
     {
        for(int a:x)
        {
            System.out.print(a+" ");
        }
        System.out.println("");
     }
    static void showlist(int start,String ...str)
    {
        for(int i=0;i<str.length;i++)
        {
            System.out.println(start+" "+str[i]+" ");
            start++;
        }
        System.out.println("");
    }
    public static void main(String[] args)
    {
          show(10);
          show(10,20,30);
          show(new int[]{10,20,30,40,50});
          showlist(4,"john","hello","vinayak");
    }
}
