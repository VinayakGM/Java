public class NestedException {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,0};
        try{
            int c=arr[0]/arr[4];
            try
            {
                System.out.println(arr[3]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("bye");
    }
}
