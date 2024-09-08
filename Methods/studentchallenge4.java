public class studentchallenge4 {
    
    public static void main(String args[])
    {  double s=0;
         for(int i=0;i<args.length;i++)
         {  if(args[i].matches("[0-9\\.]+"))
                s+=Double.parseDouble(args[i]);

         }
         System.out.println("Sum is "+s);


    }
}
