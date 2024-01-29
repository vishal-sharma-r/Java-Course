class Parent1{
    public Parent1(){
        System.out.println("Non-param Parent1");
    }
    public Parent1(int a){
        System.out.println("param Parent1 "+a);
    }
}
class child1 extends Parent1{
    public child1(){
        System.out.println("Non-param Child1");
    }
    public child1(int a){
      
        System.out.println("Param child1 "+a);
    }
    public child1(int a, int b){
        super(a);
        System.out.println("Param child1 having 2 parameters " + b);
    }

}
public class ParametrizesConstructor {
    public static void main(String[] args) {
        child1 c1= new child1(10,20);
        System.out.println(c1); // just to remove warning
    }
}
