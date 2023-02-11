import java.util.Scanner;
public class FindApair {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[],target,n;
        n=sc.nextInt();
        int sum=0;
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==target)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        sc.close();
    }
}
