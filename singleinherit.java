import java.util.*;
//import java.util.Scanner;

class PersonalDetails {
        String name = "Y.VINODKUMAR";
        String DOB = "28-10-2002";
        String Address = "J.THIMMAPURAM";
        String parent = "SRINIVASU";
}

class StudentDetails extends PersonalDetails {
    String pin = "20P31A0463";
    String course = "B.TECH";
}

public class singleinherit {
    public static void main(String[] args) {
        //PersonalDetails pd = new PersonalDetails();
        StudentDetails sd = new StudentDetails();
        System.out.println("NAME: "+sd.name);
        System.out.println("DOB: "+sd.DOB);
        System.out.println("ADDRESS: "+sd.Address);
        System.out.println("PARENT: "+sd.parent);
        System.out.println("PIN: " +sd.pin);
        System.out.println("COURSE: "+sd.course);
    }
}
