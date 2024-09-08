
import java.util.*;

public class DequeDemo {
     public static void main(String[] args)
    {
        
        ArrayDeque<Integer>dq=new ArrayDeque<>();

        dq.addFirst(10);
        dq.addFirst(20);

        dq.offerFirst(30);


        dq.addLast(40);
        dq.addLast(50);
        dq.offerLast(60);

        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        
        System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());



        //stack implementation
        ArrayDeque<Integer> st=new ArrayDeque<>();

        st.addLast(10);
        st.addLast(20);
        st.addLast(30);
        st.addLast(40);
        st.addLast(50);

        System.out.println(st);


        System.out.println(st.removeLast());
        System.out.println(st.removeLast());
        System.out.println(st.removeLast());
        System.out.println(st.removeLast());




        

    }
}
