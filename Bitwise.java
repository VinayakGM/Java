public class Bitwise {
    public static void main(String[] args)
    {   int x=-10;
        int y=0b1110;
        int z=x|y;
        int a=x&y;
        int n=~x;
        int xor=x^y;
        int l=x<<1;
        int r=x>>1;
        int ur=x>>>1;
        int m=9;
        int p=12;
        System.out.println("the value of m and n "+m+" "+p);
        m=m^p;
        p=m^p;
        m=m^p;
        System.out.println("The Value of m and n after swapping : "+m+" "+p);
        System.out.println("x and y is :"+a);
        System.out.println("X or Y is "+z);
        System.out.println(" x xor is :"+xor);
        System.out.println("Negation or not of x is "+n);
        System.out.println(" left shift of x is :"+l);
        System.out.println("right shift of x is "+r);
        System.out.println("Unsigned right shift of x is "+ur);
    }
}
