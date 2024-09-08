public class stringPractice {
    public static void main(String[] args)
    { 
        // String str1="Java";   
        // String str2=new String("Java");//string(String) constructor
        // char c[]={'A','B','C','D'};
        // String str3=new String(c);//by String(Char) constructor
        // byte b[]={66,67,68,69};
        // String str4=new String(b);// by String(byte) constructor
        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(str3);
        // System.out.println(str4);

        // String str5=new String(c,1,3);  //1 indicates the staring index of string and 3 indicates the length of string
        // String str6=new String(b,1,2);   

    //  System.out.println(str5);
    //  System.out.println(str6);
     //to check a single copy of object is created 
    //  System.out.println(str1==str2);
    // String str7="Java";
    // System.out.println(str1==str7); 
    //String methods
    // String str="java";
    // System.out.println(str.length());
    // String str2=str.toLowerCase();
    // String str3=str.toUpperCase();
    // System.out.println(str3);
    // String str4="   welcome  ";
    
    // String str5="welcome";
    // System.out.println(str.toLowerCase());
    // System.out.println(str4.trim());
    //Creating substrings
    // System.out.println(str5.substring(3));
    // System.out.println(str5.substring(0,3));
    

    // System.out.println(str5.replace('e', 'k'));


///
    String s="wwww.gfg.com";
    System.out.println(s.startsWith("www"));
    System.out.println(s.startsWith(".",4));//for the second '.'
    System.out.println(s.endsWith(".com"));
    System.out.println(s.endsWith("."));

    System.out.println(s.charAt(0));

    System.out.println(s.indexOf("gfg"));
    System.out.println(s.indexOf(".", 4));

    System.out.println(s.lastIndexOf("."));
    System.out.println(s.lastIndexOf(".",7));

    String s2="java";
    String s3="Java";
    String s4="Python";
    String s5="Python";

    System.out.println(s2.equals(s3));
    System.out.println(s4.equals(s5));

    System.out.println(s2.compareTo(s3));
    System.out.println(s3.compareTo(s4));
    System.out.println(s2.compareToIgnoreCase(s3));
    System.out.println(String.valueOf(1));

    System.out.println(s5.contains("yt"));
    System.out.println(s5.concat(" "+s3));


    //Student challenge 1
String str="programmer@gmail.com";
//to check the given email is gmail
 // System.out.println(str.matches(".*@gmail.*"));
int i=str.indexOf("@");
     String user=str.substring(0, i);
  System.out.println("The User name: "+str.substring(0, i));
 // System.out.print(str.substring(0, str.indexOf("@"))+"\n");
   String Domain=str.substring(i+1);
  System.out.println("The Domain name :"+str.substring(i+1));
 // System.out.print(str.substring(str.indexOf("@")+1)+"\n");
   System.out.println(Domain.startsWith("gmail"));

    




    }
}
