class OverFlowException extends Exception
{
    public String toString()
    {
        return "Stack Overflow";
    }
}
class UnderFlowException extends Exception
{
    public String toString()
    {
        return "Stack Underflow";
    }
}
class Stack{
      int size;
      int arr[];
      static int top=-1;

      public Stack( int s)
      {
              size=s;
              arr=new int[size];
      }

     public void push(int x) throws Exception
     {
        if(top==size-1)
        {
            throw new OverFlowException();
        }
      top++;
      arr[top]=x;


     }
     public int pop() throws Exception
     { int x=-1;
        if(top==-1)
        {
            throw new UnderFlowException();
        }
        x=arr[top];
        top--;
        return x;
     }
}
public class SC{
    public static void main(String[] args)
    {
        Stack st=new Stack(5);
        try{
        
        
        st.push(1);
        st.push(4);
        st.push(0);
        st.push(2);
        st.push(3);
        // st.push(5);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

}
