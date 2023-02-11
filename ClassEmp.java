

class Employee{
    String name;
    String Department;
    int salary;
    Employee(String N,String D,int S){
        this.name=N;
        this.Department=D;
        this.salary=S;
    }
    public void Netsal(){
        double total=salary*0.2;
        System.out.println("Netsal"+total);

    }
}



public class ClassEmp {

    public static void main(String[] args)
     {
    //     Scanner sc=new Scanner(System.in);
        Employee e=new Employee("vinod","ECE",20000);
        e.Netsal();
    }
}
