interface MyLambda22{
    public void display(String s);
}


public class Reference {

    // Constructor
    public Reference(String s){
        System.out.println(s.toUpperCase());
    }
    // static method
    public static  void reverse(String s)
    {
        StringBuffer sb =new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }
    // Non-static method
    public void show(String s){
        System.out.println("Show method" + s);
    }
    public static void main(String[] args) {

        // Static method
        MyLambda22 ml22 = Reference::reverse;
        ml22.display("vishal sharma");
        // Non - Static method Constructor
        /*

        Reference r = new Reference();
        MyLambda22 ml23 = r::show;
        ml23.display(" Namaste");

         */
        // Constructor assign
        MyLambda22 ml24 = Reference::new;
        ml24.display("vishal");


    }


}
