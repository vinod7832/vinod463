public class revInt {
    public static void main(String[] args)
    {
        int num=463;
        int d=0,r=0;
        while(num>0)
        {
            r=num%10;
            d=d*10+r;
            num=num/10;
        }
        System.out.println(d+" Reverse Integer");
    }
    
}
