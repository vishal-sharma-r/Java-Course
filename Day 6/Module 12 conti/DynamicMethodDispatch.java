
class Super1{
    public void meth1(){ System.out.println("Meth 1 super");}
    public void meth2(){System.out.println("Meth 2 super");}
}
class sub1 extends Super1{
    public void meth2(){
        System.out.println("Meth 2 sub");
    }
    public void meth3(){System.out.println("Meth 3 sub");}
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super1 s1 = new Super1();
        s1.meth1();
        s1.meth2();
        Super1 s2 = new sub1();
        s2.meth1();
        s2.meth2();
        
    }
}
