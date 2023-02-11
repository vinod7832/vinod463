public class substring {
    public static void main(String[] args)
    {
        String data="VinodKumar,Yarlagadda";
        String firstname=data.substring(0,data.indexOf(","));
        //System.out.println(data.substring(data.indexOf(" ")+1));
        System.out.println(firstname);


    }
}
