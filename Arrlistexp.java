import java.util.ArrayList;
public class Arrlistexp {
    public static void main(String[] args)
    {
        ArrayList<String> studentname=new ArrayList<String>();
        studentname.add("vinod");
        studentname.add("eswar");
        studentname.add("raju");
        studentname.add("kiran");
        studentname.add("ram");
        for(String name:studentname)
        {
        System.out.println(name);
        }
        studentname.add("riya");
        System.out.println();
        System.out.println("Added new name");
        for(String name:studentname)
        {
            System.out.println(name);
        }

    }
}
