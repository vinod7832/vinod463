public class arr {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int a[]=new int[6];
        for(int i=0;i<arr.length;i++)
        {
            a[i]=arr[i];
        }
        a[5]=6;
        for(int num: a){
            System.out.print(" "+num);
        }
    }
}
//adding ele to the new array.