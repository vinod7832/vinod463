import java.io.FileInputStream;
import java.io.File;
public class readFromFile
{
    public static void main(String[] args)
    {
        try
        {
            File fileObject = new File("newSample.txt"); // Name of the file from which we want to read   
            FileInputStream fileReadingObject = new FileInputStream(fileObject);
            int inputFromFile;
            while((inputFromFile=fileReadingObject.read())!=-1)
                {
                    System.out.print((char)inputFromFile);
                }
            fileReadingObject.close();
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}