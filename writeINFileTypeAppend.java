import java.util.*;
 import java.io.File;
import java.io.FileOutputStream;
public class writeINFileTypeAppend {
    public static void main(String[] args)
    {
        try {
            FileOutputStream fileWritingOutput = new FileOutputStream("demo.txt",false);
            String t = "\nGood Afternoon Everyone!";
            byte[] b = t.getBytes();
            fileWritingOutput.write(b);
            fileWritingOutput.close();
        } catch (Exception e) {
            System.out.println("Run time error");
        }
        
    }
    
}
