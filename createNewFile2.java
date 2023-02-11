import java.io.File;
public class createNewFile2
{
    public static void main(String[] args)
    {
        try
        {
            String newfile="Demov.txt";
            File createFileObject=new File(newfile);
            if(createFileObject.exists())
            {
                System.out.println("File is already created");
            }
            else
            {
                createFileObject.createNewFile();
                System.out.println("New File is created");
            }
        }
        catch(Exception e)
        {
            System.out.println("Run time error");
        }
    }
}