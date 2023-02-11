import java.util.*;
import java.util.ArrayList;
public class missingnum {
    public static void main(String[] args)
    {
        int[] arr=new int[]{1,2,4,5,7,9,11};
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]+1!=arr[i+1])
            {
                al.add(arr[i]+1);
            }
        }
        System.out.println(al);

    }
}
