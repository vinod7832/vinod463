import java.util.*;
class School{
    String schoolname="ADITYA COLLEGE OF ENGINEERING AND TECHNOLOGY";
    String Location="SURAMPALEM";
    String Address="PEDDAPURAM";
}
class ClassName extends School{
    String ClassName="ECE-B";
    int Noofdivisions=2;
    String courseId="B.TECH";
}
class Division extends ClassName{
    int NoOfStudents=140;
    String classTeacher="DEVI";
    String ClassMonitor="PREETHI";
}
public class MultiInherit {
    public static void main(String[] args)
    {
        Division d=new Division();
        System.out.println("SchoolName: "+d.schoolname);
        System.out.println("Location: "+d.Location);
        System.out.println("Address: "+d.Address);
        System.out.println("ClassName: "+d.ClassName);
        System.out.println("NoofDivisions: "+d.Noofdivisions);
        System.out.println("CourseID: "+d.courseId);
        System.out.println("NoofStudents: "+d.NoOfStudents);
        System.out.println("ClassTeacher: "+d.classTeacher);
        System.out.println("ClassMonitor: "+d.ClassMonitor);
    }
}
