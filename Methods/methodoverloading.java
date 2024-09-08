public class methodoverloading {
   static int max(int x,int y)
    {
        return x>y?x:y;
        
    }
   static int max(int x,int y,int z)
    {
        return x>y && x>z?x:(y>z?y:z);
        
    }
   static float max(float x,Float y)
    {
        return x>y?x:y;

    }

    public static void main(String[] args)
    {
          int a=10,b=5,c=15;
          float m=19.0f,n=23.0f;
          System.out.println(max(a,b,c));
          System.out.println(max(m,n));

    }
}
