class Parent{
    public Parent(){
        System.out.println("Parent class Constructor ");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child class Constructor ");
    }
}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild class Constructor ");
    }
}

public class ConstructorInheritance {
    public static void main(String[] args){
        GrandChild gc = new GrandChild();
        System.out.println(gc);
    }
}
