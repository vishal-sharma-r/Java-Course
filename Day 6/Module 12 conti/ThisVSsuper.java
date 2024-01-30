class Rectangle{
    public int length;
    public int breadth;
    int x = 10;

    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

}
class Cuboid extends Rectangle{
    int height;
    int x  = 20;
    public Cuboid(int l, int b, int h){
        super(l,b);
        height = h;
    }
    public void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
}
public class ThisVSsuper {
    public static void main(String[] args) {
        Cuboid c= new Cuboid(10,2,33);
        c.display();
    }
    
}
