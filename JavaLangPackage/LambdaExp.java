@FunctionalInterface
interface MyLambda
{
    // void Display();
    int add(int a,int b);
}
public class LambdaExp
{
    public static void main(String[] args)
    {
        // MyLambda m=()->{ System.out.println("Hello World");};
        // MyLambda m=(a,b)->{return a+b;};
        MyLambda m=(a,b)->a+b;

        System.out.println(m.add(5, 7));

    }
}