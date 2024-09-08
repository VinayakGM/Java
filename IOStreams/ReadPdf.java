// import java.io.FileInputStream;  
// import java.io.File;  
// // Importing the required classes of Apache POI   
// import org.apache.tika.metadata.Metadata;  
// import org.apache.tika.sax.BodyContentHandler;  
// import org.apache.tika.parser.pdf.PDFParser;  
// import org.apache.tika.parser.ParseContext;  

// public class ReadPdf
// {
//     public static void main(String[] args) throws Exception{
//          // Creating an object of the BodyContentHandler class  
// BodyContentHandler ch = new BodyContentHandler();  
// // Creating a file object  
// File fl = new File("K:/sample.pdf");  
// // Create a FileInputStream object on  
// // the path specified using the created file object file  
// FileInputStream fs = new FileInputStream(fl);  
// // Creating an object of the type Metadata  
// Metadata md = new Metadata();  
// // Creating an object of the ParseContext class  
// ParseContext pc = new ParseContext();  
// // creating an object of the class PDFParser  
// PDFParser pp = new PDFParser();  
// // calling the parse() method using the   
// // object of the PDFParser class  
// pp.parse(fs, ch, md, pc);  
// // Displaying the contents   9i
// // of the pdf file by invoking the toString() method  
// String str = ch.toString();  
// System.out.println("Extracting the contents from the file: \n" + ch.toString());  
//     }
// }