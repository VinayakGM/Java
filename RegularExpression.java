public class RegularExpression {
    public static void main(String args[])
    {  /*  String s1="a";
      String s2="f";
      String s3="xz";
       String s4="a9";

       System.out.println(s1.matches("[abc]"));
       System.out.println(s2.matches("."));
       System.out.println(s4.matches("[abc][0-9]"));
       System.out.println(s2.matches("[^abc]"));
       System.out.println(s4.matches("[a-zA-Z][0-9]"));
       System.out.println(s3.matches("xz"));

       System.out.println(s1.matches("\\w"));
       System.out.println(s1.matches("\\d"));
       System.out.println(s1.matches("\\s"));
       System.out.println(s1.matches("\\S"));
*/ /*       
   String s6="abcdef";
   String s7="a";
     System.out.println(s6.matches(".*"));
     System.out.println(s6.matches("[a-z]*"));
     System.out.println(s7.matches("[a-z]+"));
     System.out.println(s7.matches("[a-z]?"));
     System.out.println(s6.matches("[a-z]{3}"));
     System.out.println(s6.matches("[a-z]{3,7}"));

    String email="vinayakm2002@gmail.com";
    System.out.println(email.matches(".*@gmail.com")); */
//Student challenge 1/* 
/*String str="programmer@gmail.com";
//to check the given email is gmail
  System.out.println(str.matches(".*@gmail.*"));
  System.out.print("The User name: ");
  System.out.print(str.substring(0, str.indexOf("@"))+"\n");
  System.out.print("The Domain name :");
  System.out.print(str.substring(str.indexOf("@")+1)+"\n");
*/
//to check binary number
       int b=1001000;
       //to check the number is binary
      String str=String.valueOf(b);
      System.out.println(str.matches("[01]+"));
      System.out.println(str);
// to check the number is hexadecimal
      String str1="21";
      System.out.println(str1.matches("[0-9A-F]+"));
    //to check the date
      String str3="13/02/2023";
      System.out.println(str3.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"));
      System.out.println(str3.matches("[0-9/]{10}"));
// to remove the specila characters
   String str4="aB12!$z";
     System.out.println(str4.replaceAll("[^a-zA-Z0-9]",""));
//to remove the extra white spaces
   String str5="abc   de ff  ee";
   System.out.println(str5.replaceAll("\\s+", " "));
   String str6=" abc   de ff   ";
   System.out.println(str5.replaceAll("\\s+", " ").trim());
// to count the number of words in string 
  String str7="   abc    de  fged  ";
  String word=str7.replaceAll("\\s+", " ");
   String words[]=word.split(" ");

   for(int i=0;i<words.length;i++)
   {
       System.out.println(words[i]);
   }









       
    
    



      

    }
}
