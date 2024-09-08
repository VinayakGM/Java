
import java.util.*;

public class ArrayListDemo{
    public static void main(String[] args)
    {
    List<Integer> arr=new ArrayList<>();
   ArrayList<Integer> arr2=new ArrayList<>(List.of(1,2,3,4,5,6));
   arr.add(10);
   arr.add(10);
   arr.add(1,5);
   System.out.println(arr);
   arr.addAll(arr2);
   System.out.println(arr);
   System.out.println(arr.contains(20));
   System.out.println(arr.equals(arr2));
   System.out.println(arr.indexOf(5));
   System.out.println(arr.lastIndexOf(5));
   System.out.println(arr.remove(5));
   System.out.println(arr);
   System.out.println(arr.removeAll(arr2));
   System.out.println(arr.set(1, 20));
   
   System.out.println(arr);
   
   for(int i=0;i<arr.size();i++)
   {
       System.out.print(arr.get(i)+" ");
       
    }
    
    System.out.print("\n");
    for(Integer x:arr)
    {
        System.out.print(x+" ");
        
    }
    System.out.print("\n");
    
    Iterator<Integer>it=arr.iterator();
    while(it.hasNext())
    {
        System.out.print(it.next()+" ");
    }
    
    System.out.print("\n");
    
    }  

}