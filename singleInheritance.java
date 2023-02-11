class Father {
    String fatherName = "father";
}

class Child extends Father {
    String childName = "child";
}

class GrandChild extends Child{
    String granChildName = "grandChild";
}


class singleInheritance {
    public static void main(String[] args) {
        GrandChild grandChildObject = new GrandChild();
        System.out.println(grandChildObject.fatherName);        
    }
}
// class Father {
//     String fatherName = "father";
// }

// class Child extends Father {
//     String childName = "child";
// }

// class singleInheritance {
//     public static void main(String[] args) {
//         Child childObject = new Child();
//         System.out.println(childObject.fatherName);        
   // }
//}