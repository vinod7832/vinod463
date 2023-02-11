public class overLoadingMethods1{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 5;

        double numDouble1 = 40;
        double numDouble2 = 45;

        String text1 = "Pushp";
        String text2 = "anjali";

        System.out.println("Overloading with different number of arguments:");
        double sumDouble = add(num1, num2);
        System.out.println("Addition: "+ sumDouble);
        add(num1, num2, num3);
        System.out.println("Overloading with different daya type in arguments:");
        add(text1, text2);

        System.out.println("Overloading with different return type:");
        double sum = add(numDouble1,numDouble2);
        System.out.println("Addition: " + sum);

    }

    // add method with 2 integers in arguments:
    public static int add(int a, int b) {
        return (a+b);
    }

    // add method with 3 integers in arguments:
    public static void add(int a, int b, int c) {
        System.out.println("Addition: " + (a + b + c));
    }

    // add method with 2 Strings in arguments:
    public static void add(String a, String b) {
        System.out.println("Addition: " + (a + b));
    }

    // add method with different return type:
    public static double add(double a, double b) {
        return (a + b);

    }
}