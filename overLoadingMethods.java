public class overLoadingMethods {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 5;
        add(num1,num2);
        System.out.println("Overloading example:");
        add(num1,num2,num3);   
    }


    //overloading methods: 
    public static void add(int a, int b){
        System.out.println("Addition: " + (a+b));
    }

    public static void add(int a, int b,int c){
        System.out.println("Addition: " + (a+b+c));
    }
}