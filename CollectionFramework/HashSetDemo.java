import java.util.*;

public class HashSetDemo {
    public static void main(String[] args)
    {
        
       
        HashSet<Integer>set=new HashSet<>();
        HashSet<String>set2=new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(100);
        set.add(20);
        
        System.out.println(set);
        
        set2.add("a");
        set2.add("b");
        set2.add("c");
        set2.add("c");
        
        System.out.println(set2);



        

    }
}
