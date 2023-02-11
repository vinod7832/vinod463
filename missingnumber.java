import java.util.*;
public class missingnumber {
    public  static ArrayList<Integer> findnum(int arr[],int size)
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<size;i++)
        {
            hs.add(arr[i]);
        }
        ArrayList<Integer> output=new ArrayList<>();
        for(int i=arr[0];i<arr[size-1];i++)
        {
            if(!hs.contains(i))
                output.add(i);
        }
        return output;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
             x[i]=sc.nextInt();
        }
        ArrayList<Integer> al=findnum(x,n);
        System.out.println(al);
        sc.close();
    }
}
