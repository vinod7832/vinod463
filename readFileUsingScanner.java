import java.util.Scanner;
import java.io.File;

public class readFileUsingScanner {
    public static void main(String[] args) {
        try {

            File fileObject = new File("demo1.txt");
            Scanner sc = new Scanner(fileObject);
            
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            
            sc.close();

        } catch (Exception e) {
            System.out.println("runtime eror");
        }

    }
}