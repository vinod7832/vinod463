import java.io.File;

public class createNewFile {
    public static void main(String[] args)
    {
        try{
            String filename="demo1.txt";
            File newFileObject = new File(filename);
            //newFileObject.createNewFile();
            if(newFileObject.exists())
            {
                 System.out.println("File already exists");
            }
            else
            {
             newFileObject.createNewFile();
            }
            System.out.println(newFileObject.getAbsolutePath());
            }
        catch(Exception e)
        {
        System.out.println("run time error");
        }

    }
}
