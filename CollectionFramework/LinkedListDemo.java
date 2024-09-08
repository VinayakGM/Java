import java.util.*;


public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList<Integer> ll=new LinkedList<>();
        LinkedList<String> l2=new LinkedList<>();
        // Insert at head
        ll.addFirst(10);
        ll.addFirst(20);
        System.out.println(ll);
        
        // insert at end
        ll.addLast(30);
        ll.addLast(40);
        System.out.println(ll);
        
        
        // to get the first and last element
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        // to delete at first and at last
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());


        for(int i=0;i<ll.size();i++)
        {
            System.out.print(ll.get(i)+" -->");
        }
        

    }
}
