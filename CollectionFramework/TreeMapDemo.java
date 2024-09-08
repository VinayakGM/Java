import java.util.*;

public class TreeMapDemo {
      public static void main(String[] args)
    {
        
     TreeMap<Integer,String>t=new TreeMap<>(Map.of(1,"a",2,"b",3,"c",4,"d"));
     
     System.out.println(t.get(3));
     t.put(4,"d");
     System.out.println(t);
    //  t.containsValue
    

     Map<Integer,String>mpp=new HashMap<>();

     mpp.put(1, "a");
     mpp.put(2, "a");
     mpp.put(3, "a");
     mpp.put(1, "b");

   if(!mpp.containsValue("a"))
   {
    t.put(4,"c");
   }


     System.out.println(mpp);

     for(Map.Entry<Integer,String> e:mpp.entrySet())
     {
        System.out.println(e.getKey()+" "+e.getValue());
        System.out.println(e);
        
     }



        

    }
}
