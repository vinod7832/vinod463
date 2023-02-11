//method overriding
//Use of Super keyword

class Father {
    String name = "father";

    void printName(){
        System.out.println(this.name);
    }
}


class Child extends Father {
    String name = "child";

    void printName(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

class methodOverriding {
    public static void main(String[] args) {
        Child childObject = new Child();
        childObject.printName();     
    }
}