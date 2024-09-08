class A{}
class B extends A{

}
class C extends A{}
class Data<T>
{
    T obj;
    public void set(T v)
    {
        obj=v;
    }
    public T get()
    {
        return obj;
    }
}
@SuppressWarnings("unchecked")
class MyArray<T>
{
    T A[]=(T[])new Object[10];
    int length=0;
    public void append(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
}

public class GenericDemo
{
    static <E> void show(E list[])
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }
    static <T> void fun(MyArray<? super B> obj)
    {
        obj.display();
    }
    public static void main(String[] args)
    {
        Data<Integer>d=new Data<>();
        d.set(10);
        System.out.println(d.get());

        // MyArray<Integer> m=new MyArray<>();

        // m.append(1);
        // m.append(2);
        // m.append(3);

        // m.display();

        MyArray<B>m=new MyArray<>();
        MyArray<C>m2=new MyArray<>();

        // show(new String[]{"hi","hello"});
        // show(new Integer[]{1,2});
        fun(m);
    }
}