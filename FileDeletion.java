import java.io.File;
public class FileDeletion {
    public static void main(String[] args)
    {
        String oldfile = "try.txt";
        File fileold = new File(oldfile);
        if (fileold.delete()) {
            System.out.println("File deleted sucessfully");
        } else 
            System.out.println("Error");

    }
}
