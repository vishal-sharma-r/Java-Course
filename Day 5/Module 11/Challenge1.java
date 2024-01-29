class ChallengeCylinder {
    private double radius;
    private double height;


    public void setRadius(double r) {
        radius = r;
    }

    public void setHeight(double h) {
        height = h;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

    /* Constructor */
    public ChallengeCylinder(){
        height = 0.0;
        radius = 0.0;
    }
    public ChallengeCylinder(double r){
        radius = r;
        height = 1;
    }
    public ChallengeCylinder(double r, double h){
        radius = r;
        height = h;
    }
}

public class Challenge1 {
    public static void main(String[] args) {
        ChallengeCylinder cc1 = new ChallengeCylinder();

        System.out.println(cc1.getRadius() + " "+cc1.getHeight());
        ChallengeCylinder cc2 = new ChallengeCylinder(10);
        System.out.println(cc2.getRadius() + " "+cc2.getHeight());

        ChallengeCylinder cc3 = new ChallengeCylinder(10,30);
        System.out.println(cc3.getRadius() + " "+cc3.getHeight());

    }
}
