
class Cir
{
    int radius;
    Cir(int r)
    {
        this.radius=r;
    }
    void Perimeter(){
        System.out.println("Perimeter: "+2*3.14*radius);
    }
    void Area(){
        System.out.println("Area: "+3.14*radius*radius);
    }
}

public class classCicle {
    public static void main(String[] args)
    {
       
        
        Cir c=new Cir(10);
        c.Perimeter();
        c.Area();

    }   
}
