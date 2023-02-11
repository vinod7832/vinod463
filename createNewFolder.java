import java.io.File;
public class createNewFolder {
    public static void main(String[] args)
    {
    try
        {
            String filename="sample1";
            File newFile=new File(filename);
            if(newFile.exists())
            {
                System.out.println("Folder already exists");
            }
            else
            {
                newFile.mkdir();
            }
            System.out.println(newFile.getAbsolutePath());
            System.out.println("Folder is created");
        }
        catch(Exception e)
        {
            System.out.println("run time error");
        }
    }
}
