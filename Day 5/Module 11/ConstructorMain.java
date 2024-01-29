class RectangleConstructor{
    private int length;
    private int breadth;

    public RectangleConstructor(){
        this.length = 1;
        this.breadth = 1;
    }

    public RectangleConstructor(int l, int b){
        length = l;
        breadth = b;
    }
    public int area(){
        return length*breadth;
    }
}

public class ConstructorMain {
   public static void main(String[] args) 
   {
    RectangleConstructor rc1= new RectangleConstructor(10,20);
    System.out.println(rc1.area());
   }
}
