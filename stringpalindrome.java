import java.util.Scanner;
class stringpalindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String st="";
		String d=s;
		for(int i=s.length()-1;i>=0;i--)
		{
			st=st+s.charAt(i);
		}
		if(st.equals(d))
			System.out.println("palindrome");
		else 
			System.out.println("Not a palindrome");
	}
	public class swapNumbers {
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