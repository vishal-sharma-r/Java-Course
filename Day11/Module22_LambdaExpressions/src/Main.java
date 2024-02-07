@FunctionalInterface
interface MyLambda{
    public void display(String s);
}
@FunctionalInterface
interface MyLambda1{
    public int add(int x ,int y);
}

public class Main {
    public static void main(String[] args) {
       MyLambda m = (s)->{
           System.out.println("Hello "+s);
       };
       m.display("Vishal");

       MyLambda1 m1 = (a,b)-> {
           return a + b;
       };

        System.out.println(m1.add(10,20));

    }
}