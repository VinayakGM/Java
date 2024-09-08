public class Literal {
    public static void main(String args[])
    {
        byte b=10;
        byte b1=0b1010;
        byte b2=012;
        byte b3=0XA;
        long l=8888888888l;
        float f=12.43f;
        int x=-10;
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(l);
        System.out.println(f);
         System.out.println(Integer.toBinaryString(x));
         System.out.println(Integer.toHexString(x));
         System.out.println(Integer.toOctalString(x));
    }
}
