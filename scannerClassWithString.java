import java.util.Scanner;
public class scannerClassWithString {
    public static void main(String[] args)
    {
        String data="My name is vinod\n I pursuing my B.tech\n I live in AndharaPradesh";
        Scanner sc=new Scanner(data);
        while(sc.hasNext())
        {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
