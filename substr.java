public class substr {
    public static void main(String[] args)
    {
        String Fullname="Vinod,kumar,Yarlagadda";
        System.out.println(Fullname);
        String firstname=Fullname.substring(0,Fullname.indexOf(","));
        //System.out.println(firstname);
        //int firstcomma=Fullname.indexOf(",");
        //System.out.println(firstcomma);
        System.out.println("FirstName: "+firstname);
        Fullname=Fullname.substring(Fullname.indexOf(",")+1);
        System.out.println("data for first reassignment: "+Fullname);
        String middlename=Fullname.substring(0,Fullname.indexOf(","));
        System.out.println("Middle name: "+middlename);
        Fullname=Fullname.substring(Fullname.indexOf(",")+1);
        String lastname=Fullname;
        System.out.println("last name: "+lastname);





    }
}
