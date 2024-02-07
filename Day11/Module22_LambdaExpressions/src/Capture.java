@FunctionalInterface
interface  MyLambda11{
    public void display();
}
class UseLambda{
    public void callLambda11(MyLambda11 ml){
        ml.display();
    }
}
class Demo{
    public void meth1(){
        UseLambda ul = new UseLambda();
        MyLambda11 ml11 = ()-> {
            System.out.println("Hello ji");
        };
        ul.callLambda11(ml11);
        ul.callLambda11(()-> System.out.println("Hello "));
    }
}

public class Capture {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.meth1();
    }
}
