import java.util.*;
import java.io.File;
import java.io.FileOutputStream;

public class writeINFileTypeOne {
    public static void main(String[] args)
    {
        try{
            String newFileName="sample1.txt";
            File objFile =new File(newFileName);
            if(objFile.createNewFile()){
                System.out.println("File is created."+ newFileName);
            }
            String inputText ="Hello World";
            inputText.getBytes();
            byte[] byteInputText = inputText.getBytes();
            FileOutputStream fileOutput = new FileOutputStream(objFile);
            fileOutput.write(byteInputText);
            fileOutput.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
    
}
