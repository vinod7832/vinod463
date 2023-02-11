import java.io.File;
public class createNewFile1 {
    public static void main(String[] args)
    {
        try
        {
            String filename="sample1.txt";
            File newFileObject=new File(filename);
            if(newFileObject.exists())
            {
                System.out.println("File already exists");
            }
            else
            {
                newFileObject.createNewFile();
            }
            System.out.println(newFileObject.getAbsolutePath());
            System.out.println("File is created");
        }
        catch(Exception e)
        {
            System.out.println("run time error");
        }
    }
}
