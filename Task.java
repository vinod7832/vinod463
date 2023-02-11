import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;

public class Task {

    public static void main(String[] args) {
        try {
            String newfolder="AdityaCollegeOfEngg&Technology";
            String newfile = "demoDatabase.txt";
            File fileObj = new File(newfile);
            File newFolder=new File(newfolder);
            newFolder.mkdir();
                System.out.println("New folder is created");

            if (fileObj.exists()) {
                System.out.println("File already exists");
            } else {
                fileObj.createNewFile();
            }
            System.out.println("New File is created");
            System.out.println(fileObj.getAbsolutePath());
            String inputText = " 101,Aman V,Co\n 102,Parth Sarthi,EE\n 103,Saritha V,CO\n 104,Devika T,EE";
            inputText.getBytes();
            byte[] ByteinputText = inputText.getBytes();
            FileOutputStream fileoutput = new FileOutputStream(fileObj);
            fileoutput.write(ByteinputText);
            fileoutput.close();

            Scanner sc=new Scanner(fileObj);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            sc.close();


            String oldfile = "demoDatabase.txt";
            File fileold = new File(oldfile);
            if (fileold.delete()) {
                System.out.println("File deleted sucessfully");
            } else
                System.out.println("Error");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("run time error");
        }
    }
}
