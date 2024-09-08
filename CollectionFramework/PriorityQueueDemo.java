import java.util.*;

class mycom implements Comparator<Integer>
{
  public int compare(Integer a,Integer b)
  {
    if(a>b) return -1;
    else if(a<b) return 1;
    else return 0;
  }
}
 public class PriorityQueueDemo {
      public static void main(String[] args)
    {
        
       
        


        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(2);
        pq.add(30);
        pq.add(15);
        pq.add(8);
        
        System.out.println(pq);
        
        // the element with max prioritry is deleted
        
        System.out.println(pq.remove());
        pq.add(10);
        
        
        
    // max heap
        PriorityQueue<Integer> p=new PriorityQueue<>(new mycom());

    p.add(10);
    p.add(20);
    p.add(30);
    p.add(40);

    System.out.println(p);



        

    }
}
