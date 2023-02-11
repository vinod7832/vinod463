public class swapnum {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;
    
            System.out.println("Number 1:" + num1 + " and Number 2: " + num2);
    
            int tmp = num1;
    
            num1 = num2;
            num2 = tmp;
            System.out.println("After interchanging the values:\n");
            System.out.println("Number 1:" + num1 + " and Number 2: " + num2);
        }
    }

