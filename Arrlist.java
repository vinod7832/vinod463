import java.util.ArrayList;
public class Arrlist {
    public static void main(String[] args)
    {
        ArrayList<String> studentname=new ArrayList<String>();
        studentname.add("vinod");
        studentname.add("eswar");
        studentname.add("raju");
        studentname.add("kiran");
        studentname.add("ram");
        studentname.remove(2);
        System.out.println(studentname);
        // for(String name:studentname)
        // {
        // System.out.println(name);
        // }
        // studentname.remove("ram");
        // System.out.println();
        // System.out.println("Names After Removed" );
        // for(String name:studentname)
        // {
        //     System.out.println(name);
        // }
    }
}
